<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="storeApp">
<head>
	<meta charset="utf-8">
	<title>储物间</title>
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/Font-Awesome-3.2.1/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/store/store.css">
	<link rel="icon" href="http://www.sunnylu.me/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>
	<%@ include file="/static/html/public/header.html" %>
	<%@ include file="/static/html/public/main-navigation.html" %>
	<div class="lsn-center">
		<div class="container-fluid">
			<div class="row">
				
				<div class="col-xs-4 col-sm-3 col-md-2 col-lg-2">
					<ul class="nav nav-pills nav-stacked">
						<li><a ui-sref="book">书籍</a></li>
						<li><a ui-sref="software">软件和工具</a></li>
						<li><a ui-sref="os">系统</a></li>
						<li><a ui-sref="website">常用网站</a></li>
					</ul>
				</div>

				<div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
					<!-- 界面注入 ============================== -->
					<div ui-view></div>

				</div>	
				
			</div>
		</div>

		
	</div>
	<%@ include file="/static/html/public/footer.html" %>
	
	<script type="text/javascript" src="http://www.shuangfile.site/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store.js"></script>

	<script type="text/javascript" src="http://www.shuangfile.site/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="http://www.shuangfile.site/framework/angularjs/angular-ui-router.js" ></script>

	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store-app.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store-controllers.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store-directives.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store-filters.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/front-end/store/store-services.js"></script>
	

</body>
</html>