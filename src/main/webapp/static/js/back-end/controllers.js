var backEndCtrls = angular.module('backEndCtrls', [ ]);

backEndCtrls.controller('selfCtrl',['$scope',
	function($scope) {
		$scope.greetingMe = {
			text: '这里是aboutMe'
		};
}]);

backEndCtrls.controller('libraryCtrl', ['$scope',
	function($scope){
		$scope.greetingLibrary = {
			text: '这里是library'
		};
}]);