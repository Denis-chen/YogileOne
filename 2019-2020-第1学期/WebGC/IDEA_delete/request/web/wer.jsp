<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/14
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>wer</title>
</head>
<body>
    <%
        String _name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
    %>
_name:<%= _name %>
</body>
</html>
