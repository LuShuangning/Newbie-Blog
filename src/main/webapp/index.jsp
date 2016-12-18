<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>双儿的小窝</title>

	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/framework/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/css/index/index.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/css/public/public.css">
	<link rel='icon' href="http://www.syninglu.space:8080/static/img/easyicon.ico" type="image/x-ico" />
	
</head>
<body>

	<%@ include file="/static/html/public/header.html" %>
	<div>
		<nav class="main-navigation" >
			<div class="container">
			<div class="row">
			<div class="col-sm-12">	
				<div class="audio-center">
					<audio src="http://www.syninglu.space:8080/static/music/index/春风十里.mp3" loop="loop"/>
				</div>		
			</div>
			</div>
			</div>
		</nav>

		<div class="container">
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="col-md-3 col-sm-6">

							<div class="thumbnail">
								<a href="http://www.syninglu.space:8080/store/index.do#/book" title="储物间~~" target="_blank">
								<img src="http://www.syninglu.space:8080/static/img/index/img01.jpg" alt=""></a>
								<h3>储物间</h3>
								<p>双儿和朋友们放东西的地方</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="http://www.syninglu.space:8080/realStuff/index.do" title="广播站里的程序员" target="_blank"><img src="http://www.syninglu.space:8080/static/img/index/img02.jpg" alt=""></a>
								<h3>干货数据库</h3>
								<p>代码、程序员的日常</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="" title="从你的全世界路过" target="_blank"><img src="http://www.syninglu.space:8080/static/img/index/img03.jpeg" alt=""></a>
								<h3>印象、笔记</h3>
								<p>剩下的，留给时间去发酵</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="http://www.syninglu.space:8080/me/home.do" title="谁又路过了我的世界" target="_blank"><img src="http://www.syninglu.space:8080/static/img/index/img04.jpg" alt=""></a>
								<h3>关于我</h3>
								<p>个人简介</p>
							</div>
							
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>
		<%@ include file="/static/html/public/footer.html" %>
		
	</div>
	

	<script src="http://www.syninglu.space:8080/static/framework/audiojs/audio.min.js"></script>
	<script src="http://www.syninglu.space:8080/static/framework/jquery/jquery-3.1.1.js"></script>
	<script src="http://www.syninglu.space:8080/static/js/front-end/index.js"></script>

	<script>
		audiojs.events.ready(function() {
		    var as = audiojs.createAll();
	 	});
	</script>

</body>
</html>