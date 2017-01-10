<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html ng-app="backEndApp">
<head>
<meta charset="utf-8">
<title>路小双后台管理</title>

<link rel="stylesheet" type="text/css" href="/static/framework/bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/static/css/back-end/back-end.css">
<link rel="stylesheet" type="text/css" href="/static/css/public/public.css">
<link rel='icon' href="/static/img/easyicon.ico' type=‘image/x-ico" />
</head>

<body>

	<div class="lsn-nav">
		<ul class="nav nav-pills">
			<li><a href="#">Home</a></li>
			<li><a href="#">SVN</a></li>
			<li><a href="#">iOS</a></li>
			<li><a href="#">VB.Net</a></li>
			<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#">
			Java <span class="caret"></span>
			</a>

			<ul class="dropdown-menu">
				<li><a href="#">Swing</a></li>
				<li><a href="#">jMeter</a></li>
				<li><a href="#">EJB</a></li>
				<li class="divider"></li>
				<li><a href="#">分离的链接</a></li>
			</ul>

			</li>
			<li><a href="#">PHP</a></li>
		</ul>
	</div>

	<div class="lsn-content">
		<div class="lsn-span-left">
			<div class="lsn-menu">
				<ul>
					<li>
						储物间
					</li>

					<li>
						干货数据库
					</li>

					<li>
						印象、笔记
					</li>

					<li>
						关于我
					</li>	
				</ul>
			</div>
		</div>

		<div class="lsn-span-right">
			<div ng-view>
				
			</div>
		</div>
	</div>

	<%@ include file="/static/html/public/footer.html" %>


	<script type="text/javascript" src="/static/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="/static/framework/angularjs/angular-route.js" ></script>
	<script type="text/javascript" src="/static/js/back-end/controllers.js"></script>
	<script type="text/javascript" src="/static/js/back-end/app.js"></script>
	<script type="text/javascript" src="/static/js/back-end/directives.js"></script>
	<script type="text/javascript" src="/static/js/back-end/filters.js"></script>
	<script type="text/javascript" src="/static/js/back-end/services.js"></script>
</body>
</html>