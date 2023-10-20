package com.kgisl.sbngjscrud.entity;
import org.springframework.data.rest.core.config.Projection;
// public interface EmployeeProjection {
//     Long getId();
//     String getName();
//     String getEmail();
// }



@Projection(name = "employeeProjection", types = { Employee.class })
public interface EmployeeProjection {
    Long getId();

    String getName();

    String getEmail();

    // Add other fields you want to include in the projection
}
