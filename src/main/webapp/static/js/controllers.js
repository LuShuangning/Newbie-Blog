var backEndCtrls = angular.module('backEndCtrls', [ ]);

backEndCtrls.controller('aboutMeCtrl',['$scope',
	function($scope) {
		$scope.greeting = {
			text: '这里是aboutMe'
		};
}]);

backEndCtrls.controller('libraryCtrl', ['$scope',
	function($scope){
		$scope.greeting = {
			text: '这里是library'
		};
}]);