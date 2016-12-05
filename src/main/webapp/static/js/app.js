var backEndApp = angular.module('backEndApp',[ 
'ngRoute', 'backEndCtrls' //此处写注册依赖
]);

backEndApp.config(function($routeProvider){
	$routeProvider.when('/about-me', {
		templateUrl: 'http://localhost:8080/syninglu/static/html/about-me.html',
		controller: 'aboutMeCtrl'
	}).when('/library', {
		templateUrl: 'http://localhost:8080/syninglu/static/html/library.html',
		controller: 'libraryCtrl'
	}).otherwise({
		redirectTo: '/about-me'
	})
})