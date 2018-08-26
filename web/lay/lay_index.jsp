<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><sitemesh:title/></title>
    <%--css文件--%>
    <%@include file="lay_css.jsp"%>

    <sitemesh:head/>
</head>
<body>

<%--js文件--%>
<%@include file="lay_js.jsp"%>
<%--导航栏--%>
<%@include file="lay_nav.jsp"%>
<div class="container-fluid">
    <div class="row ">
        <!-- 垂直导航栏 -->
        <%@include file="lay_menu.jsp"%>
        <!--主体-->
        <div class="col-10 ">
            <sitemesh:body/>
        </div>
    </div>
</div>
</body>
</html>
