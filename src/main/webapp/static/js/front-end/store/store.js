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

	initTable();

	// $('#contentTable').bootstrapTable({
	//     columns: [{
	//         field: 'bookName',
	//         title: '书名'
	//     }, {
	//         field: 'authorName',
	//         title: '作者'
	//     }, {
	//         field: 'press',
	//         title: '出版社'
	//     }, {
	//         field: 'category',
	//         title: '类别'
	//     }, {
	//         field: 'downloadLink',
	//         title: '下载'
	//     }],
	//     data: [{
	//         bookName: '测试',
	//         authorName: '张宇',
	//         press: '北京航空航天出版社',
	//         category: '考研',
	//         downloadLink: 'www.baidu.com'
	//     }]
	// });

});


function initTable() {  
	//先销毁表格  
	$('#contentTable').bootstrapTable('destroy');  
	//初始化表格,动态从服务器加载数据  
	$("#contentTable").bootstrapTable({  
	    method: "get",  //使用get请求到服务器获取数据  
	    url: "/store/book/list", //获取数据的Servlet地址  
	    striped: true,  //表格显示行间颜色

        columns: [
        {
	        field: 'bookName',
	        title: '书名'
	    }, 
	    {
	        field: 'authorName',
	        title: '作者'
	    }, 
	    {
	        field: 'press',
	        title: '出版社'
	    }, 
	    {
	        field: 'category',
	        title: '类别'
	    }, 
	    {
	        field: 'downloadLink',
	        title: '下载'
	    }
	    ]
	     
	  });  
}