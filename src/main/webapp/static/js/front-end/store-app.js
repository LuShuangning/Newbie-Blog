var StoreApp = angular.module('StoreApp',[ 
'ngRoute', 'storeCtrls' //此处写注册依赖
]);

StoreApp.config(function($routeProvider){
	$routeProvider.when('/book', {
		templateUrl: 'http://www.syninglu.space:8080/static/html/store/book.html',
		controller: 'bookCtrl'
	}).when('/software', {
		templateUrl: 'http://www.syninglu.space:8080/static/html/store/software.html',
		controller: 'softwareCtrl'
	}).otherwise({
		redirectTo: '/book'
	})
})