package com.kgisl.sbngjscrud.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.sbngjscrud.entity.Employee;
import com.kgisl.sbngjscrud.entity.EmployeeProjection;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    List<EmployeeProjection> findAllProjectedBy();
}

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// import com.kgisl.sbngjscrud.entity.Employee;
// import com.kgisl.sbngjscrud.entity.EmployeeProjection;

// @RepositoryRestResource(excerptProjection = EmployeeProjection.class)
// public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//       List<EmployeeProjection> findAllProjectedBy();
// }

