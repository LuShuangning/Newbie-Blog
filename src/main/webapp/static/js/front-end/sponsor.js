$(document).ready(function(){
    $(".title").html("Newbie's Sponsor Page");
    $(".viceTitle").html("赞助页面");
    $(".signature").html("滴水恩，涌泉报&nbsp;&nbsp;: )");
    $("#module-index").attr("href","http://www.jacksonlu.me/essays/sponsor");


    var header = $(".main-header").height();
    var nav = $(".main-navigation").height();
    var footer = $(".bottom").height();
    var lsn_height = $(document).height() - header - nav - footer - 38;
    $(".lsn-center").css("min-height",lsn_height);
	
});