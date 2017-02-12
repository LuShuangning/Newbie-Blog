var storeApp = angular.module('storeApp',[ 
'ui.router', 'storeCtrls', 'storeDirectives', 'storeServices' //此处写注册依赖
]);

storeApp.config(function($stateProvider,$urlRouterProvider){
	$urlRouterProvider.otherwise('/book');

	$stateProvider

	.state('book',{
		url: '/book',
		templateUrl: '/static/html/store/book.html'
	})

	.state('software',{
		url: '/software',
		templateUrl: '/static/html/store/software.html'
	})

	.state('os',{
		url: '/os',
		templateUrl: '/static/html/store/os.html'
	})

	.state('website',{
		url: '/website',
		templateUrl: '/static/html/store/website.html'
	})
});