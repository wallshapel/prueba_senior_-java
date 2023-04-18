package crud.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import crud.models.Employee;
import crud.utilities.Helpers;
import crud.interfaces.Operations;

public class EmployeeDAO implements Operations {
	
	private Conexion connection = new Conexion();
	
	@Override
	public List<Employee> findAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			conn = connection.getConnection();
			ps = conn.prepareStatement("SELECT * FROM employee");
			rs = ps.executeQuery();
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String last_name = rs.getString("last_name");
				String doc_type = rs.getString("doc_type");
				String doc = rs.getString("doc");
				String birthdate = rs.getString("birthdate");
				String bind_date = rs.getString("bind_date");
				String position = rs.getString("position");
				Double salary = rs.getDouble("salary");
				String age = Helpers.timeBetweenDates(rs.getString("birthdate").substring(0, 10));
				String bindingTime = Helpers.timeBetweenDates(rs.getString("bind_date").substring(0, 10));
				employees.add(new Employee(id, name, last_name, doc_type, doc, birthdate, bind_date, position, salary, age, bindingTime));
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			Conexion.Close(conn);
			Conexion.Close(ps);
			Conexion.Close(rs);
		}
		return employees;
	}

	@Override
	public Employee findById(Long id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee employee = new Employee();
		try {
			conn = connection.getConnection();
			ps = conn.prepareStatement("SELECT * FROM employee WHERE id = ?");
			ps.setLong(1, id);
			rs = ps.executeQuery();
			rs.next();
			employee.setId(rs.getLong("id"));
			employee.setName(rs.getString("name"));
			employee.setLast_name(rs.getString("last_name"));
			employee.setDoc_type(rs.getString("doc_type"));
			employee.setDoc(rs.getString("doc"));
			employee.setBirthdate(rs.getString("birthdate"));
			employee.setBind_date(rs.getString("bind_date"));
			employee.setPosition(rs.getString("position"));
			employee.setSalary(rs.getDouble("salary"));	
			employee.setAge(Helpers.timeBetweenDates(rs.getString("birthdate").substring(0, 10)));
			employee.setBindingTime(Helpers.timeBetweenDates(rs.getString("bind_date").substring(0, 10)));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			Conexion.Close(conn);
			Conexion.Close(ps);
			Conexion.Close(rs);
		}
		return employee;
	}

	@Override
	public String insert(String name, String last_name, String doc_type, String doc, String birthdate, String bind_date, String position, Double salary) throws ParseException {
		Connection conn = null;
		PreparedStatement ps = null;		
		if (!Helpers.validateDateFormat(bind_date))
            return "Invalid format to binding date field. yyyy-MM-dd expected";
        if (!Helpers.validateDateFormat(birthdate))
            return "Invalid format to birthdate date field. yyyy-MM-dd expected";
        if (!Helpers.isAdult(birthdate))
            return "The employee must be an adult";
        int rows = 0;
        String resp = "";
		try {
			conn = connection.getConnection();
			ps = conn.prepareStatement("INSERT INTO employee (name, last_name, doc_type, doc, birthdate, bind_date, position, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, last_name);
			ps.setString(3, doc_type);
			ps.setString(4, doc);
			ps.setString(5, birthdate);
			ps.setString(6, bind_date);
			ps.setString(7, position);
			ps.setDouble(8, salary);	
			rows = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			Conexion.Close(conn);
			Conexion.Close(ps);
		}		
		if (rows != 0) resp = "Inserted record";
		return resp;
	}

	@Override
	public String update(Long id, String name, String last_name, String doc_type, String doc, String birthdate, String bind_date, String position, Double salary) throws ParseException {
		Connection conn = null;
		PreparedStatement ps = null;		
		if (!Helpers.validateDateFormat(bind_date))
            return "Invalid format to binding date field. yyyy-MM-dd expected";
        if (!Helpers.validateDateFormat(birthdate))
            return "Invalid format to birthdate date field. yyyy-MM-dd expected";
        if (!Helpers.isAdult(birthdate))
            return "The employee must be an adult";
        int rows = 0;
        String resp = "Nothing to update";
		try {
			conn = connection.getConnection();
			ps = conn.prepareStatement("UPDATE employee SET name = ?, last_name = ?, doc_type = ?, doc = ?, birthdate = ?, bind_date = ?, position = ?, salary = ? WHERE id = ?");
			ps.setString(1, name);
			ps.setString(2, last_name);
			ps.setString(3, doc_type);
			ps.setString(4, doc);
			ps.setString(5, birthdate);
			ps.setString(6, bind_date);
			ps.setString(7, position);
			ps.setDouble(8, salary);	
			ps.setLong(9, id);
			rows = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			Conexion.Close(conn);
			Conexion.Close(ps);
		}		
		if (rows != 0) resp = "Record updated";
		return resp;
	}

	@Override
	public String delete(Long id) {
		Connection conn = null;
		PreparedStatement ps = null;
		int rows = 0;
		String resp = "Nothing to remove";
		try {
			conn = connection.getConnection();
			ps = conn.prepareStatement("DELETE FROM employee WHERE id = ?");
			ps.setLong(1, id);
			rows = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			Conexion.Close(conn);
			Conexion.Close(ps);
		}
		if (rows != 0) resp = "Record deleted";
		return resp;
	}	
}