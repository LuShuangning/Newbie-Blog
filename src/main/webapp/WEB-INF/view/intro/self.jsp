<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
	String web_domain = request.getScheme()+"://"+request.getServerName();
	String file_domain = "http://shuangfile.site";
%>

<!DOCTYPE html>
<html> 
<head>   
	<meta charset="utf-8">
	<title>关于我</title>
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/article.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/public.css">
	<link rel="icon" href="<%=web_domain %>/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>

		<%@ include file="/static/html/public/header.html" %>
		<%@ include file="/static/html/public/main-navigation.html" %>
		<div class="lsn-center">
			<main class="container">
				<div class="row">
					<div class="col-md-12">
						<article class="post format">
							<div class="post-head">
								<div class="post-title">
									<!-- <h3 id="lsn-title"></h3> -->
								</div>
								<div class="post-meta">
									<h4>作者：<span id="post-author"></span>&nbsp;•&nbsp;<span id="post-date"></span></h4>
								</div>
							</div>

							<!-- 文章具体内容 -->
							<div class="post-content">
								<h4></h4>
							</div>
							
							<footer>
							 	<h4>&nbsp;</h4>
								<h4 class="lsn-rights">
									© 2017
									<a href="<%=web_domain %>">NEWBIE</a>
									All rights reserved<br><br><br>
								</h4>

								<h4 class="lsn-rights">
									建网站不易，点击<a href="<%=web_domain %>/article/sponsor">这里</a>赞助NEWBIE
								</h4>
							</footer>
						</article>
					</div>
				</div>
				
			</main>
			
		</div>
		<%@ include file="/static/html/public/footer.html" %>
		

	<script type="text/javascript" src="<%=file_domain %>/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="<%=web_domain %>/static/js/front-end/self.js"></script>

</body>
</html>