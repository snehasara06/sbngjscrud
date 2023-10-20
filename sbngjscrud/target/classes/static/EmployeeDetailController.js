// Updated EmployeeDetailController
angular.module('employeeApp')
    .controller('EmployeeDetailController', function($scope, $routeParams, EmployeeService, $location) {
        var employeeId = $routeParams.id;
        $scope.currentEmployee = {};
        $scope.currentEmployee.id=0;
        $scope.employees=[];
        
        if (employeeId) {
            EmployeeService.getEmployeeById(employeeId).then(function(response) {
                $scope.currentEmployee = response.data;
            });
        }

        // $scope.saveEmployee = function(employee) {
        //     if ($scope.currentEmployee.id) {
        //         EmployeeService.updateEmployee($scope.currentEmployee).then(function(response) {
        //             $scope.currentEmployee = angular.copy(response.data);
        //         });
        //     } else {
        //         EmployeeService.addEmployee($scope.currentEmployee).then(function(response) {
        //             console.log($scope.currentEmployee);
        //             $scope.employees.push(response.data);
        //             console.log($scope.employees+"haiii"+response.data);
        //             $location.path('/');
        //         });
        //     }
            
        //     $scope.currentEmployee = {}; // Clear the form
        // };
        $scope.saveEmployee = function(employee) {
            // Check if the currentEmployee object has a valid ID
            if ($scope.currentEmployee.id !== undefined) {
                // Update existing employee
                EmployeeService.updateEmployee($scope.currentEmployee).then(function(response) {
                    // Handle response as needed
                    $scope.currentEmployee = angular.copy(response.data);
                });
            } else {
                // Add new employee
                EmployeeService.addEmployee($scope.currentEmployee).then(function(response) {
                    // Handle response as needed
                    $scope.employees.push(employee);
                    console.log(response.data);
                });
            }

            // Clear the form
            $scope.currentEmployee = {};
            $scope.isEditMode = false;
        };
    });
