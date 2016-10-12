angular.module('library',[]).controller('list',function($scope){
	$scope.describes=[
		{title:"主题",intro:"内容"},
		{title:"第二篇主题",intro:"第二篇内容"}
	];
});