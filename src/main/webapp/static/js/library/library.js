angular.module('library', [])
.controller('listController', function($scope, $http) {

	$scope.title="SyningLu's Library";
	$scope.viceTitle="欢迎来到我的图书馆";
	$scope.signature="断剑重铸之日，双儿归来之时";

	$scope.describes = [
		{
			title:'第一篇',
			intro:'第二篇文章'
		},
		{
			title:'第二篇',
			intro:'第二篇文章'
		}
	]

});