angular.module('me', [])
.controller('articleController', function($scope, $http) {
	$scope.title="关于我";
	$scope.time="2016.10.29";
//$http.get("http://localhost:8080/syninglu/static/text/test1.txt")
//.success(function (response) {$scope.myarticle = response});
});