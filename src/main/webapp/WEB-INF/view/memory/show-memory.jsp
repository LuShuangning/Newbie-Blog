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
	<title>印象、笔记</title>
	
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="<%=web_domain %>/static/css/memory/show-memory.css">
	<link rel="icon" href="<%=web_domain %>/static/img/easyicon.ico" type="image/x-ico" />
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
						<img class="cover_page" src="<%=file_domain %>/images/album/插画/01.jpg">
					</a>
					<h4 class="album_title">插画</h4>
				</div>
			</div>
			
			<div class="box">
				<div class="pic">
					<a href="detail/壁纸">
						<img class="cover_page" src="<%=file_domain %>/images/album/壁纸/01.jpg">
					</a>
					<h4 class="album_title">壁纸</h4>
				</div>
			</div>

			<div class="box">
				<div class="pic">
					<a href="../essays/detail/40398f43-dac3-4ecd-bf98-43fc988f9ed4">
						<div class="memory">
							<p>
								时间回到2014年3月份，14年的高考进入了紧张的冲刺阶段。学校在省里各个地方请来了几位老师，为年级排名前150的尖子生们安排了一场讲座，我有幸参与其中。一位来自山东德州一中的女老师，高三实验班的语文组组长，让我重新认识了语文的美。在她的讲义里，我记下了这篇文章。
							</p>
						</div>
						
					</a>
					<h4 class="album_title">马不停蹄的忧伤</h4>
				</div>
			</div>


			<div class="box">
				<div class="pic">
					<a href="detail/模特">
						<img class="cover_page" src="<%=file_domain %>/images/album/模特/01.jpg">
					</a>
					<h4 class="album_title">模特</h4>
				</div>
			</div>

			<div class="box">
				<div class="pic">
					<a href="detail/成都">
						<img class="cover_page" src="<%=file_domain %>/images/album/成都/01.jpg">
					</a>
					<h4 class="album_title">成都</h4>
				</div>
			</div>
			
		</div>
	</div>
	<%@ include file="/static/html/public/footer.html" %>

	<script type="text/javascript" src="<%=file_domain %>/framework/jquery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="<%=web_domain %>/static/js/front-end/memory/show-memory.js"></script>
</body>
</html>