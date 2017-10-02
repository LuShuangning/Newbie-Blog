$(document).ready(function(){
	$(".title").html("NEWBIE's Store House");
	$(".viceTitle").html("闻道先后，术业专攻");
	$(".signature").html("分享，是程序员对待朋友的基本友谊&nbsp;&nbsp;: )");

	var header = $(".main-header").height();
	var footer = $(".bottom").height();
	var nav = $(".main-navigation").height();

	$("#module-index").attr("href","http://www.sunnylu.me/store/show#/book");
	$("#blog-index").mouseenter(function(){
	    $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页-pressed.svg");
	});
	$("#blog-index").mouseleave(function(){
	    $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页.svg");
	});



	// $('#table').bootstrapTable({
	//     url: 'data1.json',
	//     columns: [{
	//         field: 'id',
	//         title: 'Item ID'
	//     }, {
	//         field: 'name',
	//         title: 'Item Name'
	//     }, {
	//         field: 'price',
	//         title: 'Item Price'
	//     }, ]
	// });

	$('#table').bootstrapTable({
	    columns: [{
	        field: 'id',
	        title: 'Item ID'
	    }, {
	        field: 'name',
	        title: 'Item Name'
	    }, {
	        field: 'price',
	        title: 'Item Price'
	    }],
	    data: [{
	        id: 1,
	        name: 'Item 1',
	        price: '$1'
	    }, {
	        id: 2,
	        name: 'Item 2',
	        price: '$2'
	    }]
	});

});