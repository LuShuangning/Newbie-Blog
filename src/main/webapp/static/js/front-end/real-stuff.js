$(document).ready(function(){
	$(".title").html("SyningLu's Real Stuff");
	$(".viceTitle").html("双儿的干货集中营");
	$(".signature").html("生活以残忍，待之以温柔&nbsp;&nbsp;: )");

	// var list_view=$('<div class="list-view"><div class="panel panel-default"><div class="panel-body"></div></div></div>');
	// var piece_title=$('<div class="piece-title"><h2>一腔狗血别凉了下来</h2></div>');
	// var piece_info=$('<div class="piece-info"><span class="piece-author">作者：路双宁&nbsp;</span><time class="piece-time">•&nbsp;2016.10.29</time></div>');
	// var piece_content=$('<div class="piece-conten"><h4>测试</h4></div>');
	// var piece_btn=$('<div class="piece-btn"><a href="www.syninglu.space:8080" class="btn btn-primary" role="button">全文阅读</a></div>');
	

	// $(".lsn-center").append(list_view);
	// $(".panel-body").append(piece_title,piece_info,piece_content,piece_btn);

	// $(".lsn-center").append(list_view);
			
	var h2=$('<h2>一腔狗血别凉了下来</h2>');
	for (var a = 0; a < 10; a++) {
		$(".lsn-center").append(h2);
	}
});