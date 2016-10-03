var app = angularjs.module('library',[]);
app.controller('list',function($scope){
	$scope.listView={
		{site : "Google", url : "http://www.google.com"},
		{site : "Runoob", url : "http://www.runoob.com"},
		{site : "Taobao", url : "http://www.taobao.com"}
	};
});