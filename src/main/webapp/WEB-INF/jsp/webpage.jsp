<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<title>Demo</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/css/bootstrap.css">
		<!-- 可选的Bootstrap主题文件（一般不用引入） -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/css/bootstrap-theme.css">
		<script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.easyui.mobile.js"></script>
		<script src="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	</head>
<body>
    <div class="container">
        <nav class="navbar navbar-inverse">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-target=".navbar-responsive-collapse" data-toggle="collapse"></a> <a class="brand" href="#">网站名</a>
                    <div class="nav-collapse collapse navbar-responsive-collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="#">主页</a>
                            </li>
                            <li>
                                <a href="#">链接</a>
                            </li>
                            <li>
                                <a href="#">链接</a>
                            </li>
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">下拉菜单</a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">下拉导航1</a>
                                    </li>
                                    <li>
                                        <a href="#">下拉导航2</a>
                                    </li>
                                    <li>
                                        <a href="#">其他</a>
                                    </li>
                                    <li class="divider">
                                    </li>
                                    <li class="nav-header">
                                        标签
                                    </li>
                                    <li>
                                        <a href="#">链接1</a>
                                    </li>
                                    <li>
                                        <a href="#">链接2</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav pull-right">
                            <li>
                                <a href="#">右边链接</a>
                            </li>
                            <li class="divider-vertical">
                            </li>
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">下拉菜单</a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">下拉导航1</a>
                                    </li>
                                    <li>
                                        <a href="#">下拉导航2</a>
                                    </li>
                                    <li>
                                        <a href="#">其他</a>
                                    </li>
                                    <li class="divider">
                                    </li>
                                    <li>
                                        <a href="#">链接3</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <div class="row">
            <div class="span12">
                <div class="carousel slide" id="carousel-365393">
                    <ol class="carousel-indicators">
                        <li class="active" data-slide-to="0" data-target="#carousel-365393">
                        </li>
                        <li data-slide-to="1" data-target="#carousel-365393">
                        </li>
                        <li data-slide-to="2" data-target="#carousel-365393">
                        </li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <img alt="" src="img/1.jpg" />
                            <div class="carousel-caption">
                                <h4>
                                    棒球
                                </h4>
                                <p>
                                    棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。
                                </p>
                            </div>
                        </div>
                        <div class="item">
                            <img alt="" src="img/2.jpg" />
                            <div class="carousel-caption">
                                <h4>
                                    冲浪
                                </h4>
                                <p>
                                    冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。
                                </p>
                            </div>
                        </div>
                        <div class="item">
                            <img alt="" src="img/3.jpg" />
                            <div class="carousel-caption">
                                <h4>
                                    自行车
                                </h4>
                                <p>
                                    以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。
                                </p>
                            </div>
                        </div>
                    </div> <a data-slide="prev" href="#carousel-365393" class="left carousel-control">‹</a> <a data-slide="next" href="#carousel-365393" class="right carousel-control">›</a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="span2">
                <ul class="nav nav-list">
                    <li class="nav-header">
                        列表标题
                    </li>
                    <li class="active">
                        <a href="#">首页</a>
                    </li>
                    <li>
                        <a href="#">库</a>
                    </li>
                    <li>
                        <a href="#">应用</a>
                    </li>
                    <li class="nav-header">
                        功能列表
                    </li>
                    <li>
                        <a href="#">资料</a>
                    </li>
                    <li>
                        <a href="#">设置</a>
                    </li>
                    <li class="divider">
                    </li>
                    <li>
                        <a href="#">帮助</a>
                    </li>
                </ul>
            </div>
            <div class="span6">
                <div class="hero-unit">
                    <h1>
                        Hello, world!
                    </h1>
                    <p>
                        这是一个可视化布局模板, 你可以点击模板里的文字进行修改, 也可以通过点击弹出的编辑框进行富文本修改. 拖动区块能实现排序.
                    </p>
                    <p>
                        <a class="btn btn-primary btn-large" href="#">参看更多 »</a>
                    </p>
                </div>
            </div>
            <div class="span4">
                <div class="header">
                    <ul class="nav nav-pills pull-right">
                        <li class="active">
                            <a href="#">主页</a>
                        </li>
                        <li>
                            <a href="#">关于</a>
                        </li>
                        <li>
                            <a href="#">联系我们</a>
                        </li>
                    </ul>
                    <h3 class="text-muted">
                        项目名
                    </h3>
                </div>
                <div class="jumbotron well">
                    <h1>
                        超大屏幕标题
                    </h1>
                    <p class="lead">
                        这是一个可视化布局模板, 你可以点击模板里的文字进行修改, 也可以通过点击弹出的编辑框进行富文本修改. 拖动区块能实现排序.
                    </p>
                    <p>
                        <a class="btn btn-lg btn-success" href="#" role="button">登陆</a>
                    </p>
                </div>
                <div class="row marketing">
                    <div class="col-lg-6">
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                    </div>
                    <div class="col-lg-6">
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                        <h4>
                            子标题
                        </h4>
                        <p>
                            W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>