$(document).ready(function(){
    $(".title").html("SyningLu's Personal profile");
    $(".viceTitle").html("个人简介");
    $(".signature").html("还会遇到很多人，经历很多事&nbsp;&nbsp;: )");
    $("#module-index").attr("href","http://www.syninglu.space/essays/introduction");
    $("#blog-index").mouseenter(function(){
        $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页-pressed.svg");
    });
    $("#blog-index").mouseleave(function(){
        $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页.svg");
    });


    var header = $(".main-header").height();
    var nav = $(".main-navigation").height();
    var footer = $(".bottom").height();
    var lsn_height = $(document).height() - header - nav - footer - 38;
    $(".lsn-center").css("min-height",lsn_height);
	
    // JQuery的ajax请求异步加载
    $.ajax({
        type : 'GET',
        url : 'self/关于我',
        dataType:'json',
        beforeSend: loadFunction,
        success : succFunction,
        error: erryFunction
    });

    // 加载过程中
    function loadFunction(){
        $(".post-content h4:first-child").html("文章正在加载中...");
    };

    // 加载成功
    function succFunction(data){
        $(".post-content h4:first-child").remove();

        var json = eval(data);
        $(".post-title").append('<h3>' + json.essayTitle + '</h3>');
        $("#post-author").append(json.essayAuthor);
        $("#post-date").append(json.createTime);
        $(".post-content").append(json.essayContent);
        $(".ds-thread").attr("data-thread-key",json.essayId);
        $(".ds-thread").attr("data-title",json.essayTitle);
        $(".ds-thread").attr("data-url",window.location.href);
    };

    // 加载失败
    function erryFunction(jqXHR){
        alert("发生错误：" + jqXHR.status);
    };
});