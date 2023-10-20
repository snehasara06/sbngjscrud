// angular.module('employeeApp')
//     .controller('EmployeeController', function($scope, EmployeeService, $location) {
//         $scope.employees = [];
//         $scope.currentEmployee = {};
//         $scope.currentEmployee.id=0;
//         $scope.isEditMode = false;


//         // Get all employees from the REST API
//         EmployeeService.getAllEmployees().then(function(response) {
//             $scope.employees = response.data;
//         });

        // // Corrected the function declaration here
        // $scope.saveEmployee = function() {
        //     if ($scope.currentEmployee.id !== undefined) {
        //         // Update existing employee
        //         EmployeeService.updateEmployee($scope.currentEmployee).then(function(response) {
        //             // Handle response as needed
        //             $scope.currentEmployee = angular.copy(response.data);
        //         });
        //     } else {
        //         // Add new employee
        //         EmployeeService.saveEmployee($scope.currentEmployee).then(function(response) {
        //             // Handle response as needed
        //             $scope.employees.push(response.data); // Push the response data
        //             console.log(response.data);

        //             // Clear the form
        //             $scope.currentEmployee = {}; // Clear the form after adding
        //         });
        //     }

        //     $scope.isEditMode = false; // Move this line outside the if-else block for consistency
        // };

        // $scope.editEmployee = function(employee) {
        //     // $scope.currentEmployee = angular.copy(employee);
        //     // $scope.isEditMode = true;
        //     $location.path('/update/' + employee.id);
        // };

        // // Clear form when not in edit mode
        // $scope.clearForm = function() {
        //     $scope.currentEmployee = {};
        //     $scope.isEditMode = false;
        // };

    //     $scope.deleteEmployee = function(id) {
    //         EmployeeService.deleteEmployee(id).then(function(response) {
    //             // Handle response as needed
    //             var index = $scope.employees.findIndex(employee => employee.id === id);
    //             if (index !== -1) {
    //                 $scope.employees.splice(index, 1);
    //             }
    //         });
    //     };

    //     $scope.viewDetails = function(employees) {
    //         $location.path('/update' + employee.id);
    //     };

    //     $scope.goToAddNewItem = function() {
    //         $location.path('/save');
    //     };
    // });


    //**************************with projection*********************/
    angular.module('employeeApp')
    .controller('EmployeeController', function($scope, EmployeeService, $location) {
        $scope.employees = [];
        $scope.currentEmployee = {};
        $scope.isEditMode = false;

        // Get all employees from the REST API
        EmployeeService.getAllEmployees().then(function(response) {
            $scope.employees = response.data;
        });

        $scope.editEmployee = function(employee) {
            $location.path('/update/' + employee.id);
        };

        $scope.deleteEmployee = function(id) {
            EmployeeService.deleteEmployee(id).then(function(response) {
                var index = $scope.employees.findIndex(employee => employee.id === id);
                if (index !== -1) {
                    $scope.employees.splice(index, 1);
                }
            });
        };

        $scope.goToAddNewItem = function() {
            $location.path('/save');
        };
    });

    //**************** without projection*********************
    // angular.module('employeeApp')
    // .controller('EmployeeController', function($scope, EmployeeService, $location) {
    //     $scope.employees = [];
    //     $scope.currentEmployee = {};
    //     $scope.currentEmployee.id=0;
    //     $scope.isEditMode = false;


    //     // Get all employees from the REST API
    //     EmployeeService.getAllEmployees().then(function(response) {
    //         $scope.employees = response.data;
    //     });

    //     $scope.editEmployee = function(employee) {
    //         $location.path('/update/' + employee.id);
    //     };

    //     $scope.deleteEmployee = function(id) {
    //         EmployeeService.deleteEmployee(id).then(function(response) {
    //             // Handle response as needed
    //             var index = $scope.employees.findIndex(employee => employee.id === id);
    //             if (index !== -1) {
    //                 $scope.employees.splice(index, 1);
    //             }
    //         });
    //     };

    //     $scope.viewDetails = function(employees) {
    //         $location.path('/update' + employee.id);
    //     };

    //     $scope.goToAddNewItem = function() {
    //         $location.path('/save');
    //     };
    // });


