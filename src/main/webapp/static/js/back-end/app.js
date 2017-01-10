var backEndApp = angular.module('backEndApp',[ 
'ngRoute', 'backEndCtrls' //此处写注册依赖
]);

backEndApp.config(function($routeProvider){
	$routeProvider.when('/self', {
		templateUrl: '/static/html/about-me.html',
		controller: 'selfCtrl'
	}).when('/library', {
		templateUrl: '/static/html/library.html',
		controller: 'libraryCtrl'
	}).otherwise({
		redirectTo: '/self'
	})
})