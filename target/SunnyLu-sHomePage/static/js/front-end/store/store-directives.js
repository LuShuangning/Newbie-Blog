var storeDirectives = angular.module('storeDirectives', []);

storeDirectives.directive('showlist',function(){
	return {
		restrict: 'AE',
		link:function(scope,element,attr){
			//在这里操作dom
			// element.bind("mouseenter",function(){
			// 	scope.load();
			// });
		}
	}

});