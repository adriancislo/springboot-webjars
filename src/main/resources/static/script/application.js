var app = angular.module('application', ['ngRoute', 'ngResource']);

app.config(function ($routeProvider) {
    $routeProvider
        .when('/page1', {
            templateUrl: 'views/page1.html',
            controller: 'page1Controller'
        })
        .when('/page2', {
            templateUrl: 'views/page2.html'
        });
});