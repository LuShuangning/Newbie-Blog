var meCtrls = angular.module('meCtrls', [ ]);

meCtrls.controller('meCtrl',['$scope,$http',
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