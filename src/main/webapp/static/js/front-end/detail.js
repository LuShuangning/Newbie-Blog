$(document).ready(function(){
	$(".title").html("Newbie's Real Stuff");
	$(".viceTitle").html("NEWBIE的干货铺");
	$(".signature").html("文章详情页&nbsp;&nbsp;: )");
	$("#module-index").attr("href","http://www.sunnylu.me/essays/brief/干货数据库");

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);

});