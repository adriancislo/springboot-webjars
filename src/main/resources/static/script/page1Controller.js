app.controller('page1Controller', function ($scope, Restangular) {

    $scope.title = 'Page title';

    Restangular.one('page').get({pageNumber: '1'}).then(function (data) {
        $scope.title = data.title;
    });

});