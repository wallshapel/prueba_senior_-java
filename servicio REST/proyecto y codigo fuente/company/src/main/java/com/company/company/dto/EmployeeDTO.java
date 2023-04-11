package com.company.company.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
public class EmployeeDTO {
    // Attributes
    private Long id;
    @NotEmpty(message = "The name field cannot be empty")
    @Size(min = 2, message = "The name field must have at least 2 characters")
    private String name;
    @NotEmpty(message = "The last name field cannot be empty")
    @Size(min = 2, message = "The last name field must have at least 2 characters")
    private String last_name;
    @NotEmpty(message = "The document type field cannot be empty")
    @Size(min = 2, message = "The document type field must have at least 2 characters")
    private String doc_type;
    @NotEmpty(message = "The document number field cannot be empty")
    @Size(min = 8, message = "The document number field must have at least 8 characters")
    private String doc;
    @NotEmpty(message = "The birthdate date field cannot be empty")
    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "Invalid format to binding date field. yyyy-MM-dd expected")
    private String birthdate;
    @NotEmpty(message = "The binding date field cannot be empty")
    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "Invalid format to binding date field. yyyy-MM-dd expected")
    private String bind_date;
    @NotEmpty(message = "The position field cannot be empty")
    @Size(min = 2, message = "The position field must have at least 2 characters")
    private String position;
    @NotNull(message = "The salary field cannot be empty")
    @DecimalMin(value = "0.0")
    private Double salary;
    private String age;
    private String bindingTime;
    // End Attributes
    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
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
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getBindingTime() { return bindingTime; }
    public void setBindingTime(String bindingTime) { this.bindingTime = bindingTime; }
    // End Getters & Setters
    // Empty Constructor
    public EmployeeDTO() {
        super();
    }
    // End Empty Constructor
}