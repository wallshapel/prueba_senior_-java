package com.company.company.controllers;

import com.company.company.dto.EmployeeDTO;
import com.company.company.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<EmployeeDTO> listEmployees() throws ParseException { return employeeService.listEmployees(); }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> listEmployeeById(@PathVariable(name = "id") Long id) throws ParseException {
        return ResponseEntity.ok(employeeService.listEmployeeById(id));
    }
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) throws ParseException {
        return new ResponseEntity<>(employeeService.createEmployee(employeeDTO), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@Valid @RequestBody EmployeeDTO employeeDTO, @PathVariable(name = "id") Long id) throws ParseException {
        EmployeeDTO employeeResponse = employeeService.updateEmployee(employeeDTO, id);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(name = "id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee successfully removed", HttpStatus.NO_CONTENT);
    }
}