<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html ng-app="backEndApp">
<head>
<meta charset="utf-8">
<title>路小双后台管理</title>

<link rel="stylesheet" type="text/css" href="/static/framework/bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/static/css/public/public.css">
<link rel="stylesheet" type="text/css" href="/static/css/back-end/back-end.css">
<link rel="stylesheet" type="text/css" href="/static/framework/editormd/css/editormd.css" />
<link rel='icon' href="/static/img/easyicon.ico' type=‘image/x-ico" />
</head>

<body>

	<nav class="navbar navbar-inverse" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" ui-sref="#">双的后台管理</a>
		</div>

		<ul class="nav navbar-nav">
			<li><a ui-sref="store">储物间</a></li>
			<li><a ui-sref="self">关于我</a></li>
			<li><a ui-sref="write">写文章</a></li>
		</ul>
	</nav>

	<div class="container ">

	    <!-- 界面注入 ============================== -->
	    <div ui-view></div>

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
		<script type="text/javascript" src="/static/framework/jquery/jquery-3.1.1.js"></script>
		<script type="text/javascript" src="/static/framework/editormd/editormd.js"></script>
	<script type="text/javascript" src="/static/framework/angularjs/angular.js" ></script>
	<script type="text/javascript" src="/static/framework/angularjs/angular-ui-router.js" ></script>
	<!-- END js框架 =============================================================================== -->


	<script type="text/javascript" src="/static/js/back-end/app.js"></script>
	<script type="text/javascript" src="/static/js/back-end/controllers.js"></script>


	

	
</body>
</html>