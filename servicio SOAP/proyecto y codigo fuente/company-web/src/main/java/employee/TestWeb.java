package employee;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import crud.interfaces.Employee;

@WebServlet(name = "ServletController", urlPatterns = { "/ServletController" })
public class TestWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Test test = new Test();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action != null) {
			switch (action) {
				case "edit":
					try {
						this.edit(req, resp);
					} catch (ServletException | IOException | ParseException e) {
						e.printStackTrace();
					}
					break;
				case "delete":
					this.delete(req, resp);
					break;
	
				default:
					this.actionDefault(req, resp);
				}
		} else 
			this.actionDefault(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action != null) {
			switch (action) {
				case "insert":
					this.insert(req, resp);
					break;
				case "update":
					this.update(req, resp);
					break;
				case "delete":
					this.delete(req, resp);
					break;
	
				default:
					this.actionDefault(req, resp);
				}
		} else 
			this.actionDefault(req, resp);
	}
	protected void actionDefault(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		Employee[] employees = test.findAll();
		HttpSession sesion = req.getSession();
		sesion.setAttribute("employees", employees);	
		resp.sendRedirect("employees.jsp");
	}
	protected void insert(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String last_name = req.getParameter("last_name");
		String doc_type = req.getParameter("doc_type");
		String doc = req.getParameter("doc");
		String birthdate = req.getParameter("birthdate");
		String bind_date = req.getParameter("bind_date");
		String position = req.getParameter("position");
		double salary = 0;
		String salaryString = req.getParameter("salary");
		if (salaryString != null && !"".equals(salaryString))
			salary = Double.parseDouble(salaryString);
		Employee employee = new Employee(name, last_name, doc_type, doc, birthdate, bind_date, position, salary);
		test.insert(employee);
		this.actionDefault(req, resp);
	}
	protected void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		Long id = Long.parseLong(req.getParameter("id"));
		Employee employee = test.findById(new Employee(id));		  
		req.setAttribute("employee", employee);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    Date result = format.parse(employee.getBirthdate());
	    SimpleDateFormat newFormater = new SimpleDateFormat("yyyy-MM-dd");
	    req.setAttribute("birthdate", newFormater.format(result));
	    result = format.parse(employee.getBind_date());
	    req.setAttribute("bind_date", newFormater.format(result));
		String jspEdit = "/WEB-INF/pages/employee/edit.jsp";
		req.getRequestDispatcher(jspEdit).forward(req, resp);
	}
	protected void update(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		Long id = Long.parseLong(req.getParameter("id"));
		String name = req.getParameter("name");
		String last_name = req.getParameter("last_name");
		String doc_type = req.getParameter("doc_type");
		String doc = req.getParameter("doc");
		String birthdate = req.getParameter("birthdate");
		String bind_date = req.getParameter("bind_date");
		String position = req.getParameter("position");
		double salary = 0;
		String salaryString = req.getParameter("salary");
		if (salaryString != null && !"".equals(salaryString))
			salary = Double.parseDouble(salaryString);
		Employee employee = new Employee(id, name, last_name, doc_type, doc, birthdate, bind_date, position, salary);
		test.update(employee);
		this.actionDefault(req, resp);
	}
	protected void delete(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		Long id = Long.parseLong(req.getParameter("id"));
		Employee employee = new Employee(id);
		test.delete(employee);
		this.actionDefault(req, resp);
	}	
}