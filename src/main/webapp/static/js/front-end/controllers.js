var frontEndCtrls = angular.module('frontEndCtrls', [ ]);

frontEndCtrls.controller('indexCtrl',['$scope',
	function($scope) {
		$scope.intro={
			title: "SyningLu's Home Page",
			viceTitle: '双儿的个人主页',
			signature: '生活以残忍，待之以温柔',
			msg1: '储物间',
			msg2: '图书馆',
			msg3: '爱情笔记本',
			msg4: '关于我'
		};
}]);

frontEndCtrls.controller('meCtrl',['$scope,$http',
	function($scope,$http){
		$scope.intro={
			title: "SyningLu's Brief Introduction",
			viceTitle: "个人简介",
			signature: '有事写程序没事打游戏',
		};
		
		$scope.content={
				postTitle: '关于我',
				time: '2016.10.29'
		};
		
		$http.get("http://localhost:8080/syninglu/me/article.action")
	  	.success(function (response) {
	  			$scope.articles  = response.articles;
	  	});
}]);