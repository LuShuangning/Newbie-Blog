$(document).ready(function(){
	$(".title").html("SunnyLu's error page");
	$(".viceTitle").html("错误页面");
	$(".signature").html("从哪里跌倒再从哪里爬起来&nbsp;&nbsp;: )");

	var header = $(".main-header").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);
});