<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>干货数据库</title>

	<link rel="stylesheet" type="text/css" href="http://www.shuangfile.site/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/real-stuff/show-article.css">
	<link rel="icon" href="http://www.sunnylu.me/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>
	<c:set var="listMap" value="${listMap}" scope="application"/>

	<%@ include file="/static/html/public/header.html" %>
	<%@ include file="/static/html/public/main-navigation.html" %>
	<div class="lsn-center">
		
		<div class="list">
			<script>
				var listMap = ${listMap};
			</script>
		</div>

		<%@ include file="/static/html/public/contact.html" %>
	</div>	
	<%@ include file="/static/html/public/footer.html" %>

	<script src="http://www.shuangfile.site/framework/jquery/jquery-3.1.1.js"></script>
	<script src="http://www.sunnylu.me/static/js/front-end/show-article.js"></script>
</body>
</html>