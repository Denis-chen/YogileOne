<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/14
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>qwe</title>
</head>
<body>
<%
    String ma = request.getAttribute("result").toString();
%>
123:<%= ma %>
</body>
</html>
