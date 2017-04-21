$(document).ready(function(){
	// localHandler({"result":"我是远程js带来的数据"});
	$(".title").html("SyningLu's Memory");
	$(".viceTitle").html("印象、笔记");
	$(".signature").html("剩下的，留给时间去发酵&nbsp;&nbsp;: )");
	$("#module-index").attr("href","http://www.sunnylu.me/memory/show");

	// function repeat(){
	// 	var box = $('<div class="box"><div class="pic"><a href=""><img id="cover_page" src=""></a><h4 id="album_title"></h4></div></div>');
	// 	$(".main").append(box);
	// };

	// $.each(album,function(index,item){
	// 	repeat();
	// 	$(".main .box:last-child #cover_page").attr("src","http://www.syninglu.space/static/img/album/" + item.belongTo + "/" + item.name);
	// 	$(".main .box:last-child #album_title").append(item.belongTo);
	// });

});