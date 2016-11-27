angular.module('me', [])
.controller('articleController', function($scope, $http) {

	$scope.title="SyningLu's Brief Introduction";
	$scope.viceTitle="个人简介"
	$scope.signature="有事写程序没事打游戏";
	$scope.postTitle="关于我";
	$scope.time="2016.10.29";

	
	$http.get("http://localhost:8080/syninglu/me/article.action")
  	.success(function (response) {
  			$scope.articles  = response.articles;
  	});
});