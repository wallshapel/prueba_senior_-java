package crud.interfaces;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import crud.models.Employee;

@WebService
public interface Operations {
	@WebMethod
	public List<Employee> findAll();
	@WebMethod
	public Employee findById(Long id);
	@WebMethod
	public String insert(String name, String last_name, String doc_type, String doc, String birthdate, String bind_date, String position, Double salary) throws ParseException;
	@WebMethod
	public String update(Long id, String name, String last_name, String doc_type, String doc, String birthdate, String bind_date, String position, Double salary) throws ParseException;
	@WebMethod
	public String delete(Long id);
}