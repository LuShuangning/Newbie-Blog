var StoreApp = angular.module('StoreApp',[ 
'ngRoute', 'storeCtrls' //此处写注册依赖
]);

StoreApp.config(function($routeProvider){
	$routeProvider.when('/book', {
		templateUrl: 'http://localhost:8080/syninglu/static/html/store/book.html',
		controller: 'bookCtrl'
	}).when('/software', {
		templateUrl: 'http://localhost:8080/syninglu/static/html/store/software.html',
		controller: 'softwareCtrl'
	}).otherwise({
		redirectTo: '/book'
	})
})