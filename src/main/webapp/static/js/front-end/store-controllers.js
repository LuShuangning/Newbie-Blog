var storeCtrls = angular.module('storeCtrls', [ ]);

storeCtrls.controller('bookCtrl',['$scope,$http',
	function($scope,$http) {
	
	$http({
		method: 'GET',
		url: 'store/books/list.do',
		params: {
			'category':'其他'
		}
		// headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}
	}).success(function(data,status){
		console.log('请求发送成功');
	}).error(function(data,status){

	});
}]);

storeCtrls.controller('softwareCtrl', ['$scope',
	function($scope){
		
}]);