<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html ng-app="backEndApp">
<head>
	<meta charset="utf-8">
	<title>路小双后台管理</title>

	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/framework/bootstrap-3.3.7/bootstrap.css">
	<link rel='icon' href='http://localhost:8080/syninglu/static/img/easyicon.ico' type=‘image/x-ico’ />
</head>

<body>

	<div>
		<div ng-view>
			
		</div>

	</div>


	<script type="text/javascript" src="http://localhost:8080/syninglu/static/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/framework/angularjs/angular-route.js" ></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/back-end/controllers.js"></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/back-end/app.js"></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/back-end/directives.js"></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/back-end/filters.js"></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/back-end/services.js"></script>
</body>
</html>