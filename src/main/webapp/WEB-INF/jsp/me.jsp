<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="me" ng-controller="articleController">
<head>
	<meta charset="utf-8">
	<title>关于我</title>
	
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="static/css/me/me.css">
	<link rel="stylesheet" type="text/css" href="static/css/public/head.css">
	<link rel='icon' href='static/img/easyicon.ico' type=‘image/x-ico’ />

	<script type="text/javascript" src="static/js/angularjs/angular.js" ></script>
	<script  type="text/javascript" src="static/js/me/me.js"></script>
</head>
<body>
	<div class="container main-header">
		<div class="row">
			<div class="col-sm-12 body-header">
				<div class="header-text header-center">
					<h1>
						SyningLu's Brief Introduction<br/>	
					</h1>
					<h3 header-text>生活以残忍，待之以温柔&nbsp;&nbsp;:）</h3>
				</div>
								
			</div>
		</div>					
	</div>

	<nav class="main-navigation">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 nav-body">
					<div>
						<a href="" class="nav-img-hover">
						<img src="static\img\me\back_to_index_normal.png" alt="">首页</a>
						<span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
						<a href="http://localhost:8080/syninglu/index.action" class="nav-hover">博客首页</a>
					</div>
				</div>
			</div>

		</div>
	</nav>

	<main class="container">
		<div class="row">
			<div class="col-md-12 post">
				<article>
					<div class="post-head">
						<div class="post-title">
							<h3>{{title}}</h3>
						</div>
						<div class="post-meta">
							<h4>作者：<a href="http://localhost:8080/syninglu/index.action">双</a>&nbsp;&nbsp;•&nbsp;{{time}}</h4>
						</div>
						<div class="post-content">
							{{myarticle}}
						</div>
					</div>
					
				</article>
			</div>
		</div>
	</main>

	<script>
	
</script>
</body>
</html>