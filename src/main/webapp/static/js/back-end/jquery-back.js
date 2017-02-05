$(document).ready(function(){
	var header = $(".lsn-navbar").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);
});