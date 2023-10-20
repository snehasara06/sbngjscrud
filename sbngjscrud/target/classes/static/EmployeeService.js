app.service('EmployeeService', function($http) {
    this.getAllEmployees = function() {
        return $http.get('http://localhost:8080/employees/getall');
    };

    this.getEmployeeById = function(id) {
        return $http.get('http://localhost:8080/employees/getbyid/'+id);
    };

    this.addEmployee = function(employee) {
        return $http.post('http://localhost:8080/employees/save', employee);
    };

    this.updateEmployee = function(employee) {
        return $http.put('http://localhost:8080/employees/update/' + employee.id, employee);
    };

    this.deleteEmployee = function(id) {
        return $http.delete('http://localhost:8080/employees/delete/' + id);
    };
});