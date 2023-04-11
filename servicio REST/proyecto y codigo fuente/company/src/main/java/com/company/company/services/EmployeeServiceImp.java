package com.company.company.services;
import com.company.company.dto.EmployeeDTO;
import com.company.company.exceptions.InvalidDataException;
import com.company.company.exceptions.ResourceNotFoundException;
import com.company.company.models.EmployeeModel;
import com.company.company.repositories.EmployeeRepository;
import com.company.company.utilities.Helpers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployeeRepository employeeRepository;
    // Mapper
    private EmployeeDTO mapperDTO(EmployeeModel employee) { return modelMapper.map(employee, EmployeeDTO.class); }
    private EmployeeModel mapperModel(EmployeeDTO employeeDTO) { return modelMapper.map(employeeDTO, EmployeeModel.class); }
    // End Mapper
    @Override
    public List<EmployeeDTO> listEmployees() throws ParseException {
        List<EmployeeModel> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeesDTOList = employees.stream().map(this::mapperDTO).collect(Collectors.toList());
        for (EmployeeDTO employeeDTO: employeesDTOList ) {
            employeeDTO.setAge(Helpers.timeBetweenDates(employeeDTO.getBirthdate().substring(0, 10)));  // Position 10 is excluded because (yyyy-MM-dd hh:mm:ss) at position 10 returns "cannot parsed"
            employeeDTO.setBindingTime(Helpers.timeBetweenDates(employeeDTO.getBind_date().substring(0, 10)));
        }
        return employeesDTOList;
    }
    @Override
    public EmployeeDTO listEmployeeById(Long id) throws ParseException {
        EmployeeModel employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        EmployeeDTO employeeDTO = mapperDTO(employee);
        employeeDTO.setAge(Helpers.timeBetweenDates(employeeDTO.getBirthdate().substring(0, 10)));
        employeeDTO.setBindingTime(Helpers.timeBetweenDates(employeeDTO.getBind_date().substring(0, 10)));
        return employeeDTO;
    }
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws ParseException {
        if (!Helpers.isAdult(employeeDTO.getBirthdate()))
            throw new InvalidDataException("The employee must be an adult");
        EmployeeModel employee = mapperModel(employeeDTO);
        EmployeeModel newEmployee = employeeRepository.save(employee);
        EmployeeDTO sending = mapperDTO(newEmployee);
        sending.setAge(Helpers.timeBetweenDates(employeeDTO.getBirthdate()));
        sending.setBindingTime(Helpers.timeBetweenDates(employeeDTO.getBind_date()));
        return sending;
    }
    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long id) throws ParseException {
        EmployeeModel employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        if (!Helpers.isAdult(employeeDTO.getBirthdate()))
            throw new InvalidDataException("The employee must be an adult");
        employee.setName(employeeDTO.getName());
        employee.setLast_name(employeeDTO.getLast_name());
        employee.setDoc_type(employeeDTO.getDoc_type());
        employee.setDoc(employeeDTO.getDoc());
        employee.setBirthdate(employeeDTO.getBirthdate());
        employee.setBind_date(employeeDTO.getBind_date());
        employee.setPosition(employeeDTO.getPosition());
        employee.setSalary(employeeDTO.getSalary());
        EmployeeModel updatedEmployee = employeeRepository.save(employee);
        EmployeeDTO sending = mapperDTO(updatedEmployee);
        sending.setAge(Helpers.timeBetweenDates(employeeDTO.getBirthdate()));
        sending.setBindingTime(Helpers.timeBetweenDates(employeeDTO.getBind_date()));
        return sending;
    }
    @Override
    public void deleteEmployee(Long id) {
        EmployeeModel employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        employeeRepository.delete(employee);
    }
}