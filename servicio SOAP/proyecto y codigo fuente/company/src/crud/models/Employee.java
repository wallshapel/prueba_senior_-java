package crud.models;

public class Employee {
	private Long id;
    private String name;
    private String last_name;
    private String doc_type;
    private String doc;
    private String birthdate;
    private String bind_date;
    private String position;
    private Double salary;
    private String age;
    private String bindingTime;
	public Employee() {

	}
	public Employee(String name, String last_name, String doc_type, String doc, String birthdate, String bind_date,
			String position, Double salary, String age, String bindingTime) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.doc_type = doc_type;
		this.doc = doc;
		this.birthdate = birthdate;
		this.bind_date = bind_date;
		this.position = position;
		this.salary = salary;
		this.age = age;
		this.bindingTime = bindingTime;
	}
	public Employee(Long id, String name, String last_name, String doc_type, String doc, String birthdate,
			String bind_date, String position, Double salary, String age, String bindingTime) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.doc_type = doc_type;
		this.doc = doc;
		this.birthdate = birthdate;
		this.bind_date = bind_date;
		this.position = position;
		this.salary = salary;
		this.age = age;
		this.bindingTime = bindingTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getBind_date() {
		return bind_date;
	}
	public void setBind_date(String bind_date) {
		this.bind_date = bind_date;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBindingTime() {
		return bindingTime;
	}
	public void setBindingTime(String bindingTime) {
		this.bindingTime = bindingTime;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", name=" + name + ", last_name=" + last_name + ", doc_type=" + doc_type
				+ ", doc=" + doc + ", birthdate=" + birthdate + ", bind_date=" + bind_date + ", position=" + position
				+ ", salary=" + salary + ", age="+ age + ", binding time=" + bindingTime + "]";
	}    
}