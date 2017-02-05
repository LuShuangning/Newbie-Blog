var backEndCtrls = angular.module('backEndCtrls', [ ]);

backEndCtrls.controller('selfCtrl',['$scope',function($scope) {
	$scope.greetingMe = {
		text: '这里是aboutMe'
	};
}]);

backEndCtrls.controller('libraryCtrl', ['$scope',function($scope){
	$scope.greetingLibrary = {
		text: '这里是library'
	};
}]);

backEndCtrls.controller('tailorCtrl', ['$scope',function($scope){
	$scope.text = "这里是tailorCtrl";
}]);

backEndCtrls.controller('booksSubmitCtrl', ['$scope',function($scope){
	$scope.bookType = 
	[
		{name:'安卓'},
		{name:'JAVA EE'},
		{name:'Linux'},
		{name:'算法'},
		{name:'其他'}
	];
	$scope.selectedType = $scope.bookType[0].name;

	$scope.bookSubmit = function(){
		alert($scope.selectedType);
	};

}]);

backEndCtrls.controller('softwareSubmitCtrl', ['$scope',function($scope){
	$scope.softwareType = 
	[
		{name:'安卓'},
		{name:'前端'},
		{name:'服务端'},
		{name:'运维'},
		{name:'其他'}
	];
	$scope.selectedType = $scope.softwareType[0].name;
	$scope.bookSubmit = function(){
		alert("保存数据...");
	};

}]);

backEndCtrls.controller('systemSubmitCtrl', ['$scope',function($scope){
	$scope.systemType = 
	[
		"Windows",
		"Linux"
	];

	$scope.systemBelong = 
	[
		"Windows xp",
		"Windows 7",
		"Windows 8",
		"Windows 10",
		"Debian",
		"Ubunto",
		"Fedora",
		"CentOS",
		"RedHat"
	];

	$scope.bookSubmit = function(){
		alert("保存数据...");
	};

}]);

backEndCtrls.controller('webSubmitCtrl', ['$scope',function($scope){
	

}]);