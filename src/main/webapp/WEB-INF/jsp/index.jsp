<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <title>首页</title>
        <%--<jsp:include page="${pageContext.request.contextPath}/common/include.jsp"></jsp:include>--%>
        <!-- 新 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/css/bootstrap.css">
        <!-- 可选的Bootstrap主题文件（一般不用引入） -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/css/bootstrap-theme.css">
        <script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
        <script src="${pageContext.request.contextPath}/jquery-easyui-1.4.3/jquery.easyui.mobile.js"></script>
        <script src="${pageContext.request.contextPath}/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
        <%--<script src="${pageContext.request.contextPath}/test.js"></script>--%>
    </head>
        <div class="container">
            <h2>标题一&nbsp;&nbsp;&nbsp;<small>第一个标题</small></h2>
            <p>我在动态网页制作教程中a.jsp页面上定义了一个 String  path = request.getContextPath() , 而这个页面用说明标签引入了一个b.jsp ,
                而这个上面也需要一个String path = request.getContextPath() , 结果打开a.jsp时报错了，说path这个变量已经定义过了。查看其他同样也引了b.jsp的页面，
                他们也定义了path这个字符串变量，却没有这种错误，我刚开始还挺纳闷，后来发现他们和a.jsp所引入的方法是不一样的----都是动作标签。</p>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <h3>标题二&nbsp;&nbsp;&nbsp;<small>小标题</small></h3>
                    <p>使用单一的一组 .col-md-* 栅格类，就可以创建一个基本的栅格系统，在手机和平板设备上一开始是堆叠在一起的（超小屏幕到小屏幕这一范围），
                        在桌面（中等）屏幕设备上变为水平排列。所有“列（column）必须放在 ” .row 内。</p>
                </div>
                <div class="col-md-6">
                    <h3>标题二&nbsp;&nbsp;&nbsp;<small>小标题</small></h3>
                    <p>使用单一的一组 .col-md-* 栅格类，就可以创建一个基本的栅格系统，在手机和平板设备上一开始是堆叠在一起的（超小屏幕到小屏幕这一范围），
                        在桌面（中等）屏幕设备上变为水平排列。所有“列（column）必须放在 ” .row 内。</p>
                    <button class="btn" data-toggle="modal" data-target="#myModal">点 击</button>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close"
                                data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                            模态框（Modal）标题
                        </h4>
                    </div>
                    <div class="modal-body">
                        <span id="text">在这里添加一些文本</span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default"
                                data-dismiss="modal">关闭
                        </button>
                        <button type="button" id="submit" class="btn btn-primary" onclick="$('#text').html('文本框改变！！！');">
                            提交更改
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
