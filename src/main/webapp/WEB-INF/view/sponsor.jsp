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
	<title>赞助</title>
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/public.css">
	<link rel="icon" href="<%=web_domain %>/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>
		<%@ include file="/static/html/public/header.html" %>
		<%@ include file="/static/html/public/main-navigation.html" %>
		<div class="lsn-center">
			<div class="container-fluid">
				<div class="row">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3>支付宝</h3>
							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/zhifubao1.jpg" width="45%">
								</div>
							</div>

							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/zhifubao5.jpg" width="45%">
								</div>
							</div>

							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/zhifubao.jpg" width="45%">
								</div>
							</div>
						
							<h3>微信</h3>
							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/weixin1.png" width="45%">
								</div>
							</div>

							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/weixin5.png" width="45%">
								</div>
							</div>

							<div class="col-md-4 col-sm-6">
								<div class="thumbnail">
									<img src="<%=web_domain %>/static/img/sponsor/weixin.png" width="45%">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/static/html/public/footer.html" %>
		<script type="text/javascript" src="<%=file_domain %>/framework/jquery/jquery-3.1.1.js"></script>
		<script type="text/javascript" src="<%=web_domain %>/static/js/front-end/sponsor.js"></script>
</body>
</html>