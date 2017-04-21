var storeCtrls = angular.module('storeCtrls', [ ]);

storeCtrls.controller('storeBookCtrl',function($scope,$http) {
	$http({
		method: 'GET',
		url: 'books/list',
		headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
		params: {
			'category':'其他'
		}
			// headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}
	})
	.success(function(data,status){
		console.log('请求成功');
		$scope.datas = data;
	})
	.error(function(data,status){
		console.log('请求失败');
	});
	
	
});

storeCtrls.controller('storeSoftwareCtrl', function($scope,$http){
	$http({
		method: 'GET',
		url: 'software/list',
		headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
		params: {
			'category':'其他'
		}
			// headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}
	})
	.success(function(data,status){
		console.log('请求成功');
		$scope.software = data;
	})
	.error(function(data,status){
		console.log('请求失败');
	});
});