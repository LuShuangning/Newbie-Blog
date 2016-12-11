<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>储物间</title>
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/framework/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/syninglu/static/css/public/public.css">
	<link rel='icon' href='http://localhost:8080/syninglu/static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>
	<%@ include file="/static/html/public/header.html" %>
	<div>
		<%@ include file="/static/html/public/main-navigation.html" %>

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3">
					<ul class="nav nav-pills nav-stacked">
  						<li><a href="#">第1行</a></li>
  						<li><a href="#">第2行</a></li>
  						<li><a href="#">第3行</a></li>
  						<li><a href="#">第4行</a></li>
  						<li><a href="#">第6行</a></li>
  						<li><a href="#">第7行</a></li>
					</ul>
				</div>

				<div class="col-md-9">

					<table class="table table-hover table-bordered">
						<tr>
							<th>书名</th>
							<th>作者</th>
							<th>类别</th>
							<th>下载</th>
						</tr>
						<tr>
							<td>Thinking in Java</td>
							<td>xxx.xxx</td>
							<td>Java</td>
							<td>下载</td>
						</tr>
						<tr>
							<td>Android群英传</td>
							<td>xxx</td>
							<td>Android</td>
							<td>下载</td>
						</tr>
						<tr>
							<td>鸟哥的Linux私房菜</td>
							<td>鸟哥</td>
							<td>Linux</td>
							<td>下载</td>
						</tr>
						<tr>
							<td>Hadoop基础教程</td>
							<td>xxx</td>
							<td>Hadoop</td>
							<td>下载</td>
						</tr>
					</table>

				</div>
			</div>
		</div>

		<%@ include file="/static/html/public/footer.html" %>
	</div>
	

	<script type="text/javascript" src="http://localhost:8080/syninglu/static/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://localhost:8080/syninglu/static/js/front-end/store.js"></script>
</body>
</html>