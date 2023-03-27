package com.company.company.services;
import com.company.company.dto.EmployeeDTO;

import java.text.ParseException;
import java.util.List;

public interface EmployeeService {
    public List<EmployeeDTO> listEmployees() throws ParseException;
    public EmployeeDTO listEmployeeById(Long id) throws ParseException;
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws ParseException;
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long id) throws ParseException;
    public void deleteEmployee(Long id);
}