package employee;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import crud.interfaces.Employee;
import crud.interfaces.Operations;
import crud.service.imp.ServiceImpPortBindingStub;
import crud.service.imp.ServiceImpService;
import crud.service.imp.ServiceImpServiceLocator;

public class Test {
	public Employee[] findAll() throws MalformedURLException, RemoteException {
		ServiceImpService service = new ServiceImpServiceLocator();
		Operations ws = new ServiceImpPortBindingStub(new URL(service.getServiceImpPortAddress()), service);
		return ws.findAll();
	}
	public Employee findById(Employee employee) throws MalformedURLException, RemoteException {
		ServiceImpService service = new ServiceImpServiceLocator();
		Operations ws = new ServiceImpPortBindingStub(new URL(service.getServiceImpPortAddress()), service);
		return ws.findById(employee.getId());
	}	
	public void insert(Employee employee) throws MalformedURLException, RemoteException {
		ServiceImpService service = new ServiceImpServiceLocator();
		Operations ws = new ServiceImpPortBindingStub(new URL(service.getServiceImpPortAddress()), service);
		ws.insert(employee.getName(), employee.getLast_name(), employee.getDoc_type(), employee.getDoc(), employee.getBirthdate(), employee.getBind_date(), employee.getPosition(), employee.getSalary());
	}	
	public void update(Employee employee) throws MalformedURLException, RemoteException {
		ServiceImpService service = new ServiceImpServiceLocator();
		Operations ws = new ServiceImpPortBindingStub(new URL(service.getServiceImpPortAddress()), service);
		ws.update(employee.getId(), employee.getName(), employee.getLast_name(), employee.getDoc_type(), employee.getDoc(), employee.getBirthdate(), employee.getBind_date(), employee.getPosition(), employee.getSalary());
	}	
	public void delete(Employee employee) throws MalformedURLException, RemoteException {
		ServiceImpService service = new ServiceImpServiceLocator();
		Operations ws = new ServiceImpPortBindingStub(new URL(service.getServiceImpPortAddress()), service);
		ws.delete(employee.getId());
	}
}
