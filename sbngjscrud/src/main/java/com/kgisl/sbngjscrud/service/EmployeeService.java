package com.kgisl.sbngjscrud.service;

import java.util.List;
import java.util.Optional;

import com.kgisl.sbngjscrud.entity.Employee;
import com.kgisl.sbngjscrud.entity.EmployeeProjection;

public interface EmployeeService {

   public List<Employee> getAllEmployees();

   public Optional<Employee> getEmployeeById(Long id);

   public Employee saveEmployee(Employee employee);

   public void deleteEmployee(Long id);

   public Employee updatEmployee(Employee e);

   public List<EmployeeProjection> getAllEmployeesProjected();

   }


    

