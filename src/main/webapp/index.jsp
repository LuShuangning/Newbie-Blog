<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String web_domain = request.getScheme()+"://"+request.getServerName();
	String file_domain = "http://115.159.40.239";
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>双的博客</title>

	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/Font-Awesome-3.2.1/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/index/index.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/public.css">
	<link rel="icon" href="<%=web_domain %>/static/img/easyicon.ico" type="image/x-ico" />

</head>
<body>
	
	<div class="snowbg">
	</div>	
	<%@ include file="/static/html/public/header.html" %>
	<nav class="main-navigation" >
		<div class="container">
			<div class="row">
				<div class="col-sm-12">	
					<div class="audio-center">
						<audio src="<%=file_domain %>/music/You Belong With Me.mp3" loop="loop" />
					</div>		
				</div>
			</div>

			<!-- <div class="row">
				<div class="col-sm-12">
					<div class="lsn-login">
						<a href="loginPage">登录</a>
					</div>
				</div>
			</div> -->
		</div>
	</nav>
	<div class="lsn-center">	
		<div class="container">
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">

							<div class="thumbnail">
								<a href="store/show" title="储物间~~" target="_blank"><img src="<%=file_domain %>/images/index/img01.png" alt=""></a>
								<h3>储物间</h3>
								<p>双儿和朋友们放东西的地方</p>
							</div>
							
						</div>

						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						
							<div class="thumbnail">
								<a href="essays/brief/干货数据库" title="疯狂程序员" target="_blank"><img src="<%=file_domain %>/images/index/img02.jpg" alt=""></a>
								<h3>干货数据库</h3>
								<p>代码、程序员的日常</p>
							</div>
							
						</div>

						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						
							<div class="thumbnail">
								<a href="memory/show" title="路过全世界" target="_blank"><img src="<%=file_domain %>/images/index/img03.jpg" alt=""></a>
								<h3>印象、笔记</h3>
								<p>剩下的，留给时间去发酵</p>
							</div>
							
						</div>

						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						
							<div class="thumbnail">
								<a href="essays/introduction" title="谁又路过了我的世界" target="_blank"><img src="<%=file_domain %>/images/index/img04.jpg" alt=""></a>
								<h3>关于我</h3>
								<p>个人简介</p>
							</div>
							
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>
		
		
	</div>
	<%@ include file="/static/html/public/footer.html" %>
	
	<script src="<%=file_domain %>/framework/audiojs/audio.min.js"></script>
	<script src="<%=file_domain %>/framework/jquery/jquery-3.1.1.js"></script>
	<script src="<%=web_domain %>/static/js/front-end/index.js"></script>

	<script>
		audiojs.events.ready(function() {
		    var as = audiojs.createAll();
	 	});
	</script>

</body>
</html>