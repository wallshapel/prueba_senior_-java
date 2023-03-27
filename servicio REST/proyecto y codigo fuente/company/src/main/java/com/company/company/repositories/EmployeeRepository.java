package com.company.company.repositories;
import com.company.company.models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {}