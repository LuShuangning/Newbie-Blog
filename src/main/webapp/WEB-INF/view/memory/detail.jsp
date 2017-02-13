<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>印象、笔记</title>
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/css/memory/show-memory.css">
	<link rel="icon" href="http://www.syninglu.space/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>

	<%@ include file="/static/html/public/header.html" %>
	<%@ include file="/static/html/public/main-navigation.html" %>
	<div class="lsn-center">
		<div class="main">
			
		</div>
	</div>
	<%@ include file="/static/html/public/footer.html" %>

	<script>
		var album = ${album};
	</script>

	<script type="text/javascript" src="http://www.syninglu.space/static/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/memory/detail.js"></script>

</body>
</html>