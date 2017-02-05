<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>印象、笔记</title>
</head>
<body>

<script type="text/javascript">
var localHandler = function(data){
    alert('我是本地函数，可以被跨域的remote.js文件调用，远程js带来的数据是：' + data.result);
};
</script>

<script type="text/javascript" src="http://www.syninglu.space/static/framework/jquery/jquery-3.1.1.js"></script>
<script type="text/javascript" src="http://www.syninglu.space/static/js/front-end/show-notes.js"></script>

</body>
</html>