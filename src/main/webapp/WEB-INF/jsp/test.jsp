<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="static/js/angularjs/angular.js"></script>


</head>
<body>
	<div ng-app="myApp" ng-controller="myCtrl">
		<p>当前的路径是：{{loc}}</p>
	</div>
	
	<h3 id="test">请点击下面的按钮，通过 jQuery AJAX 改变这段文本。</h3>
	<button id="btn1" type="button">获得外部的内容</button>

	<script>
		var app = angular.module("myApp",[]);
		app.controller("myCtrl",function($scope,$location){
			$scope.loc = $location.absUrl();
		});
	</script>
	
	<script>
		$(document).ready(function(){
		  	$("#btn1").click(function(){
		    		$('#test').load('http://localhost:8080/SyningLu/static/test/test.txt');
		  	})
		})
	</script>
</body>
</html>