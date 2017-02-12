<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>印象、笔记</title>
	
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="http://www.syninglu.space/static/css/notes/show-notes.css">
	<link rel="icon" href="http://www.syninglu.space/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>
<!-- <script type="text/javascript">
var localHandler = function(data){
    alert('我是本地函数，可以被跨域的remote.js文件调用，远程js带来的数据是：' + data.result);
};
</script> -->
	<%@ include file="/static/html/public/header.html" %>
	<%@ include file="/static/html/public/main-navigation.html" %>
	<div class="lsn-center">
		<div class="main">

			<div class="box">
				<div class="pic">
					<a href="detail/插画">
						<img id="cover_page" src="http://www.syninglu.space/static/img/album/插画/01.jpg">
					</a>
					<h4 id="album_title">插画</h4>
				</div>
			</div>
			
			<div class="box">
				<div class="pic">
					<a href="detail/壁纸">
						<img id="cover_page" src="http://www.syninglu.space/static/img/album/壁纸/01.jpg">
					</a>
					<h4 id="album_title">壁纸</h4>
				</div>
			</div>

			

			<div class="box">
				<div class="pic">
					<a href="detail/模特">
						<img id="cover_page" src="http://www.syninglu.space/static/img/album/模特/01.jpg">
					</a>
					<h4 id="album_title">模特</h4>
				</div>
			</div>

			<div class="box">
				<div class="pic">
					<a href="detail/成都">
						<img id="cover_page" src="http://www.syninglu.space/static/img/album/成都/01.jpg">
					</a>
					<h4 id="album_title">成都</h4>
				</div>
			</div>
			
		</div>
	</div>
	<%@ include file="/static/html/public/footer.html" %>

	<script type="text/javascript" src="http://www.syninglu.space/static/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/notes/show-notes.js"></script>

</body>
</html>