<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html> 
<head>   
	<meta charset="utf-8">
	<title>关于我</title>
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/framework/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/css/me/me.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space:8080/static/css/public/public.css">
	<link rel='icon' href='http://www.syninglu.space:8080/static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>

		<%@ include file="/static/html/public/header.html" %>
		<div>
			<%@ include file="/static/html/public/main-navigation.html" %>
		
			<main class="container">
				<div class="row">
					<div class="col-md-12">
						<article class="post format">
							<div class="post-head">
								<div class="post-title">
									<h3>关于我</h3>
								</div>
								<div class="post-meta">
									<h4>作者：<a href="http://www.syninglu.space:8080">双</a>&nbsp;&nbsp;•&nbsp;2016.10.29</h4>
								</div>
							</div>



							<!-- 文章具体内容 -->
							<div class="post-content">

								<h4></h4>
								
							</div>



							
							<div class="footer">
							 	<h4>&nbsp;</h4>
								<h4>
									© 2016
									<a href="http://www.syninglu.space:8080">双儿的小窝</a>
									All rights reserved
								</h4>
							</div>
						</article>
					</div>
				</div>
				
			</main>

			<div id="comment">
				
				<!-- 多说评论框 start -->
				<div class="ds-thread" data-thread-key="1" data-title="关于我" data-url="http://http://www.syninglu.space:8080/me/home.do">
					
				</div>
				<!-- 多说评论框 end -->
				<!-- 多说公共JS代码 start (一个网页只需插入一次) -->
				<script type="text/javascript">
				var duoshuoQuery = {short_name:"syninglu"};
					(function() {
						var ds = document.createElement('script');
						ds.type = 'text/javascript';ds.async = true;
						ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
						ds.charset = 'UTF-8';
						(document.getElementsByTagName('head')[0] 
						 || document.getElementsByTagName('body')[0]).appendChild(ds);
					})();
				</script>
				<!-- 多说公共JS代码 end -->

			</div>

			<%@ include file="/static/html/public/footer.html" %>
		</div>
		

	<script type="text/javascript" src="http://www.syninglu.space:8080/static/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://www.syninglu.space:8080/static/js/front-end/about-me.js"></script>

</body>
</html>