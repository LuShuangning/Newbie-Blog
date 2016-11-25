angular.module('me', [])
.controller('articleController', ['$scope','$http',function($scope, $http) {
	$scope.title="SyningLu's Brief Introduction";
	$scope.postTitle="关于我";
	$scope.signature="有事写程序没事打游戏";
	$scope.time="2016.10.29";

	$scope.getContent() = function(){
		var data = 'me'

		$http({
			method : 'GET',
			url: '',
			data: data,
			headers:{'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}
		}).success(function (data){
			console.log(data);
		});
	};
}]);