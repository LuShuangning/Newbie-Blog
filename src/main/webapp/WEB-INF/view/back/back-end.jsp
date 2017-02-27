<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html ng-app="backEndApp">
<head>
	<meta charset="utf-8">
	<title>路小双后台管理</title>

	<link rel="stylesheet" type="text/css" href="http://www.shuangfile.site/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/back-end/back-end.css">
	<link rel="stylesheet" type="text/css" href="http://www.shuangfile.site/framework/editormd/css/editormd.css" />
	<link rel="icon" href="http://www.sunnylu.me/static/img/easyicon.ico" type="image/x-ico" />
</head>

<body>

	<nav class="navbar navbar-inverse lsn-navbar" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" ui-sref="#">双的后台管理</a>
		</div>

		<ul class="nav navbar-nav">
			<li><a ui-sref="tailor">首页订制</a></li>
			<li><a ui-sref="store">储物间</a></li>
			<li><a ui-sref="write">写文章</a></li>
			<li><a ui-sref="photo">传照片</a></li>
		</ul>
	</nav>
	
	<div class="lsn-center">
		<div class="container-fluid">

		    <!-- 界面注入 ============================== -->
		    <div ui-view></div>

		</div>

	</div>
	

	<%@ include file="/static/html/public/footer.html" %>



	<!-- START js框架 一定要注意某些js文件的调用顺序，否则会出现不能完全加载的情况======================= -->
		<!-- start simditor框架 -->
		<!-- <script type="text/javascript" src="/static/framework/simditor-2.3.6/scripts/jquery.min.js"></script>
		<script type="text/javascript" src="/static/framework/simditor-2.3.6/scripts/module.js"></script>
		<script type="text/javascript" src="/static/framework/simditor-2.3.6/scripts/hotkeys.js"></script>
		<script type="text/javascript" src="/static/framework/simditor-2.3.6/scripts/uploader.js"></script>
		<script type="text/javascript" src="/static/framework/simditor-2.3.6/scripts/simditor.js"></script> -->
		<!-- end simditor框架 -->
		<script type="text/javascript" src="http://www.shuangfile.site/framework/jquery/jquery-3.1.1.js"></script>
		<script type="text/javascript" src="http://www.shuangfile.site/framework/editormd/editormd.js"></script>
	<script type="text/javascript" src="http://www.shuangfile.site/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="http://www.shuangfile.site/framework/angularjs/angular-ui-router.js" ></script>
	<script type="text/javascript" src="http://www.shuangfile.site/framework/angularjs/angular-file-upload.js" ></script>
	<script type="text/javascript" src="http://www.shuangfile.site/framework/bootstrap-3.3.7/js/bootstrap.js" ></script>
	<!-- END js框架 =============================================================================== -->


	<script type="text/javascript" src="http://www.sunnylu.me/static/js/back-end/app.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/back-end/controllers.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/back-end/directives.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/back-end/services.js"></script>
	<script type="text/javascript" src="http://www.sunnylu.me/static/js/back-end/jquery-back.js"></script>
</body>
</html>