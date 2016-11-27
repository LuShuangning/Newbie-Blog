<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html ng-app="me" ng-controller="articleController"> 
<head>     
	<meta charset="utf-8">
	<title>关于我</title>
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/me/me.css">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/public/public.css">
	<link rel='icon' href='http://localhost:8080/syninglu/static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>

		<%@ include file="/static/html/public/header.html" %>
		<div>
			<nav class="main-navigation">
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<div class="nav-header">
								<ul class="menu">
									<li>
										<a href="">
											<img src="http://localhost:8080/syninglu/static/img/me/back_to_index_normal.png" alt="">首页
										</a>
									</li>
										
									<li>
										<a href="http://localhost:8080/syninglu/">博客首页</a>
									</li>
								</ul>

							</div>
						</div>
					</div>

				</div>
			</nav>

			<main class="container">
				<div class="row">
					<div class="col-md-12">
						<article class="post format">
							<div class="post-head">
								<div class="post-title">
									<h3>{{postTitle}}</h3>
								</div>
								<div class="post-meta">
									<h4>作者：<a href="http://localhost:8080/syninglu/">双</a>&nbsp;&nbsp;•&nbsp;2016.10.29</h4>
								</div>
							</div>

							<div class="post-content">

								<h4 ng-repeat="article in articles">{{article.content}}</h4>
								
							</div>
							
						</article>
					</div>
				</div>
				<%@ include file="/static/html/public/footer.html" %>
			</main>
			
		</div>
		

    <script type="text/javascript" src="http://localhost:8080/syninglu/static/js/angularjs/angular.js" ></script>
    <script type="text/javascript" src="http://localhost:8080/syninglu/static/js/me/me.js"></script>

</body>
</html>