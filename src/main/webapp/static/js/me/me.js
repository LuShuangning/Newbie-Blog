angular.module('me', [])
.controller('articleController', function($scope, $http) {
	$scope.title="SyningLu's Brief Introduction";
	$scope.postTitle="关于我";
	$scope.signature="有事写程序没事打游戏";
	$scope.time="2016.10.29";
});