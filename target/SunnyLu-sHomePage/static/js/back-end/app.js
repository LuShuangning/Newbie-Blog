var backEndApp = angular.module('backEndApp',[ 
'ui.router' ,'backEndCtrls', 'backEndDirectives' , 'backEndServices','angularFileUpload' //此处写注册依赖
]);

backEndApp.config(function($stateProvider,$urlRouterProvider){
	$urlRouterProvider.otherwise('/tailor');

	$stateProvider

	//HOME STATE AND NESTED VIEWS ==============================
	.state('store',{
		url: '/store',
		views: {
			'':{templateUrl: '/static/html/back-end/store.html'},
			'listPage@store' : {templateUrl: '/static/html/back-end/store-list.html'},
		}
		
	})

	.state('store.books',{
		url: '/booksmng',
		views: {
			'contentPage@store' : {templateUrl: '/static/html/back-end/store-books.html'},
		}
	})

	.state('store.software',{
		url: '/softwaremng',
		views: {
			'contentPage@store' : {templateUrl: '/static/html/back-end/store-software.html'},
		}
	})

	.state('store.system',{
		url: '/sysmng',
		views: {
			'contentPage@store' : {templateUrl: '/static/html/back-end/store-system.html'},
		}
	})

	.state('store.website',{
		url: '/webmng',
		views: {
			'contentPage@store' : {templateUrl: '/static/html/back-end/store-website.html'},
		}
	})

	.state('tailor',{
		url: '/tailor',
		templateUrl: '/static/html/back-end/tailor.html'
	})

	.state('write',{
		url: '/editor',
		templateUrl: '/static/html/back-end/editor.html'
	})

	.state('photo',{
		url: '/photo',
		templateUrl: '/static/html/back-end/photo.html'
	})

});