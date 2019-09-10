<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/2
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="word_type.css" type="text/css">
<html>
<head>
    <title>result</title>
</head>
<body>
    <%
        String userName_r = "Yogile";
        String userPassword_r = "H575969143";

        String userName_f = request.getParameter("userName");
        String userPassword_f = request.getParameter("userPassword");
        if (userName_f.equals(userName_r) && userPassword_f.equals(userPassword_r)) {
            %><span class="center_type">欢迎用户[<%=userName_f%>]登录</span><%
        }
        else {
            response.sendRedirect("result_e.jsp");
        }
    %>
</body>
</html>
