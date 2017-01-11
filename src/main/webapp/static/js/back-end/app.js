var backEndApp = angular.module('backEndApp',[ 
'ui.router', 'backEndCtrls' //此处写注册依赖
]);

backEndApp.config(function($stateProvider,$urlRouterProvider){
	$urlRouterProvider.otherwise('/editor');

	// $routeProvider.when('/self', {
	// 	templateUrl: '/static/html/about-me.html',
	// 	controller: 'selfCtrl'
	// }).when('/library', {
	// 	templateUrl: '/static/html/library.html',
	// 	controller: 'libraryCtrl'
	// }).otherwise({
	// 	redirectTo: '/self'
	// })

	$stateProvider

	//HOME STATE AND NESTED VIEWS ==============================
	.state('self',{
		url: '/self',
		templateUrl: ''
	})

	.state('write',{
		url: '/editor',
		templateUrl: '/static/html/back-end/editor.html'
	})

	//.state('about',{
	// 	url: '/about',
	// 	templateUrl: ''
	// })

})