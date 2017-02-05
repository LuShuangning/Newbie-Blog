<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>储物间</title>
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/css/public/public.css">
	<link rel='icon' href="http://www.syninglu.space/static/img/easyicon.ico' type=‘image/x-ico" />
</head>
<body>
	<%@ include file="/static/html/public/header.html" %>
	<%@ include file="/static/html/public/main-navigation.html" %>
	<div class="lsn-center">
		

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-2">
					<ul class="nav nav-pills nav-stacked">
  						<li><a href="#book">书籍</a></li>
  						<li><a href="#software">软件</a></li>
  						<li><a href="#">操作系统</a></li>
  						<li><a href="#">常用网站</a></li>
					</ul>
				</div>

				<div ng-app="StoreApp" class="col-md-10">
					<div ng-view>
			
					</div>

				</div>



				
			</div>
		</div>

		
	</div>
	<%@ include file="/static/html/public/footer.html" %>
	
	<script type="text/javascript" src="http://www.syninglu.space/static/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/store.js"></script>

	<script type="text/javascript" src="http://www.syninglu.space/static/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/framework/angularjs/angular-route.js" ></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/store-controllers.js"></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/store-app.js"></script>

</body>
</html>