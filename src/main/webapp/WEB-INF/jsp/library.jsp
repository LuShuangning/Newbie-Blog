<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="library" ng-controller="listController">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>图书馆</title>

	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/library/library.css">
	<link rel='icon' href='http://localhost:8080/syninglu/static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>
	<%@ include file="/static/html/public/header.html" %>
	<div>
	<!-- angularjs ng-repeat实现div的循环 -->
		<div class="list-view" ng-repeat="describe in describes">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="left-img">
						<img src="http://localhost:8080/syninglu/static/img/library/img1.jpg" alt="" class="img-thumbnail">
					</div>

					<div class="right-content">
						<div class="title">
							{{describe.title}}
						</div>

						<div class="brief-intro">
							{{describe.intro}}
						</div>
						
					</div>
				</div>
			</div>

		</div>
		<%@ include file="/static/html/public/footer.html" %>
		
	</div>	

	

	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/angularjs/angular.js" ></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/library/library.js"></script>
</body>
</html>