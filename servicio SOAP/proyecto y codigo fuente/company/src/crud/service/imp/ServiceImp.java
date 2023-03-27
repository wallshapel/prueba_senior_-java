package crud.service.imp;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebService;

import crud.conexion.EmployeeDAO;
import crud.interfaces.Operations;
import crud.models.Employee;

@WebService(endpointInterface = "crud.interfaces.Operations")
public class ServiceImp implements Operations{
	private Operations op = new EmployeeDAO();

	@Override
	public List<Employee> findAll() {
		return op.findAll();
	}

	@Override
	public Employee findById(Long id) {
		return op.findById(id);
	}

	@Override
	public String insert(String name, String last_name, String doc_type, String doc, String birthdate, String bind_date,
			String position, Double salary) throws ParseException {
		return op.insert(name, last_name, doc_type, doc, birthdate, bind_date, position, salary);
	}

	@Override
	public String update(Long id, String name, String last_name, String doc_type, String doc, String birthdate,
			String bind_date, String position, Double salary) throws ParseException {
		return op.update(id, name, last_name, doc_type, doc, birthdate, bind_date, position, salary);
	}

	@Override
	public String delete(Long id) {
		return op.delete(id);
	}

	
}