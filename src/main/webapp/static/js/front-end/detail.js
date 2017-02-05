$(document).ready(function(){
	$(".title").html("SyningLu's Real Stuff");
	$(".viceTitle").html("双儿的干货集中营");
	$(".signature").html("文章详情页&nbsp;&nbsp;: )");

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);

});