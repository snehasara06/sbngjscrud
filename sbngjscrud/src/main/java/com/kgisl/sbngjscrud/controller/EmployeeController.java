package com.kgisl.sbngjscrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.sbngjscrud.entity.Employee;
//import com.kgisl.sbngjscrud.entity.EmployeeProjection;
import com.kgisl.sbngjscrud.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //*********************without projection**********************/
    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getAll()
    {
    List<Employee> employees=employeeService.getAllEmployees();
    return ResponseEntity.ok(employees);
    }

    // ***************************with projection***********************/

    // @GetMapping("/getall")
    // public ResponseEntity<List<EmployeeProjection>> getAll() {
    //     List<EmployeeProjection> employees = employeeService.getAllEmployeesProjected();
    //     return ResponseEntity.ok(employees);
    // }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id") Long id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(Employee e) {
        Employee employee = employeeService.saveEmployee(e);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee e) {
        Employee employee = employeeService.updatEmployee(e);

        return ResponseEntity.ok(employee);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }

}
