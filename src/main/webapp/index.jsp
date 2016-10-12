<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="index">
<head>
	<meta charset="utf-8">
	<title>SyningLu's homepage</title>

	<link rel="stylesheet" type="text/css" href="static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="static/css/index/index.css">
	<link rel="stylesheet" type="text/css" href="static/css/public/head.css">
	<link rel='icon' href='static/img/easyicon.ico' type=‘image/x-ico’ />
	
</head>
<body>
	<!-- TODO:angularjs进行数据绑定 -->
	<div ng-controller="myCtrl">		
		<div class="container main-header">
			<div class="row">
				<div class="col-sm-12 body-header">
					<div class="header-text header-center">
						<h1>
							{{title}}<br/>
							<small>双儿的个人主页</small>	
						</h1>
						<h3 header-text>{{signature}}&nbsp;&nbsp;:）</h3>
					</div>
					
					<div class="audio-center">
						<audio src="static/music/index/春风十里.mp3" prelood="none"/>
					</div>
									
				</div>
			</div>					
		</div>

		<!-- <nav class="main-navigation" >
			<div class="container">
			<div class="row">
			<div class="col-sm-12">		
			</div>
			</div>
			</div>
		</nav> -->

		<div class="container">
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="col-md-3 col-sm-6">

							<div class="thumbnail">
								<a href="" title="储物间~~"><img src="static/img/index/img01.jpg" alt=""></a>
								<h3>储物间</h3>
								<p>双儿和朋友们放东西的地方</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="http://localhost:8080/SyningLu/library.action" title="广播站里的程序员"><img src="static/img/index/img02.jpg" alt=""></a>
								<h3>图书馆</h3>
								<p>代码、程序员的日常</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="" title="从你的全世界路过"><img src="static/img/index/img03.jpeg" alt=""></a>
								<h3>爱情笔记本</h3>
								<p>暂不对外开放</p>
							</div>
							
						</div>

						<div class="col-md-3 col-sm-6">
						
							<div class="thumbnail">
								<a href="http://localhost:8080/SyningLu/me.action" title="谁又路过了我的世界"><img src="static/img/index/img04.jpg" alt=""></a>
								<h3>关于我</h3>
								<p>个人简介</p>
							</div>
							
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>


	        <div class="container bottom">
	            <div class="row  text-bottom">
	                <div class="col-md-12">
	                    <div class="text-center">
	                        <h5>
	                            &copy;Copyright 2016 | Designer&nbsp;&&nbsp;Author&nbsp;:&nbsp;SyningLu&nbsp;|&nbsp;Running on Aliyun ESC
	                        </h5>
	                    </div>
	                    
	                </div>
	                
	            </div>
	            
	        </div>
	</div>

	<script src="static/js/audiojs/audio.min.js"></script>
	<script src="static/js/angularjs/angular.js"></script>
	<script src="static/js/index/index.js"></script>

	<script>
		audiojs.events.ready(function() {
		    var as = audiojs.createAll();
	 	});
	</script>

</body>
</html>