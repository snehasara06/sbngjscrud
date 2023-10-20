package com.kgisl.sbngjscrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.sbngjscrud.entity.Employee;
import com.kgisl.sbngjscrud.entity.EmployeeProjection;
import com.kgisl.sbngjscrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
       return employeeRepository.findById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeProjection> getAllEmployeesProjected() {
    return employeeRepository.findAllProjectedBy();
}

    @Override
    public Employee updatEmployee(Employee e) {
      return employeeRepository.saveAndFlush(e);
    }

    

    
    
}
