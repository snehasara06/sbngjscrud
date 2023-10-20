app.config(function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'employee-list.html',
            controller: 'EmployeeController'
        })
        .when('/save', {
            templateUrl: 'employee-form.html',
            controller: 'EmployeeDetailController'
        })
        .when('/update/:id', {
            templateUrl: 'employee-form.html',
            controller: 'EmployeeDetailController'
        })
        .otherwise({
            redirectTo: '/'
        });
});
