<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head ng-app="library">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>图书馆</title>

	<link rel="stylesheet" href="static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" href="static/css/library/library.css">
	<link rel='icon' href='static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>
	<div ng-controller="list">
	<!-- angularjs ng-repeat实现div的循环 -->
		<div class="list-view" ng-repeat="describe in describes">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="left-img">
						<img src="static\img\library\img1.jpg" alt="" class="img-thumbnail">
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
	</div>	


	<div class="container main-header">
		<div class="row">
			<div class="col-sm-12 body-header">
				<div class="header-text header-center">
					<h1>
						SyningLu's Library<br/>	
					</h1>
					<h3 header-text>生活以残忍，待之以温柔&nbsp;&nbsp;:）</h3>
				</div>
								
			</div>
		</div>					
	</div>

	<script src="static/js/angularjs/angular.js"></script>
	<script src="static/js/library/library.js"></script>
	
</body>
</html>