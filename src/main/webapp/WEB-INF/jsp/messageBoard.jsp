<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>留言板</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script>
        window.UEDITOR_HOME_URL = "/ueditor/";
    </script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>
</head>
<body>
<script type="text/javascript">
    var ue = UE.getEditor('container',{
        autoHeightEnabled: false
    });
</script>
<div style="width:800px;margin: auto;">
    <form action="${pageContext.request.contextPath}/messageboard/submit" method="post">
        <script id="container" type="text/plain" style="width:800px;height:250px;"></script>
        <input type="submit" value="提交">
    </form>
</div>
<div style="width:800px;margin: auto;">
    <c:forEach items="${messageBoardList}" var="messageBoard" varStatus="vs">
        <span style="font-size: 20px;">${messageBoardList.size()-vs.index}楼</span>&nbsp;&nbsp;
        <span style="font-size: 15px;"><fmt:formatDate value="${messageBoard.createTime}" pattern="yyyy/MM/dd HH:mm:ss"/></span>
        ${messageBoard.content}
        <br/>
        <HR style="border:3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
    </c:forEach>
</div>
</body>
</html>