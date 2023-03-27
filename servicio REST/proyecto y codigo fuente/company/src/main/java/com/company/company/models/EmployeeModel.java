package com.company.company.models;
import javax.persistence.*;
@Entity
@Table(name = "employee", uniqueConstraints = { @UniqueConstraint(columnNames = { "doc" }) })
public class EmployeeModel {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String last_name;
    @Column(name = "doc_type", nullable = false)
    private String doc_type;
    @Column(name = "doc", nullable = false)
    private String doc;
    @Column(name = "birthdate", nullable = false)
    private String birthdate;
    @Column(name = "bind_date", nullable = false)
    private String bind_date;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "salary", nullable = false)
    private Double salary;
    // End Attributes
    // Getters & Setters
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
    // Empty Constructor
    public EmployeeModel() {
        super();
    }
    // End Empty Constructor
    // All Attributes Constructor
    public EmployeeModel(Long id, String name, String last_name, String doc_type, String doc, String birthdate, String bind_date, String position, Double salary) {
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
    }
    // End All Attributes Constructor
}