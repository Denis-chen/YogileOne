<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/2
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>application内置对象</h1>
<%
    application.setAttribute("city", "北京");
    application.setAttribute("postcode", "10000");
    application.setAttribute("email", "lisi@126.com");

%>
所在城市是：<%=application.getAttribute("city") %><br>
application中的属性有：<%
    Enumeration attributes = application.getAttributeNames();
    while(attributes.hasMoreElements())
    {
        out.println(attributes.nextElement()+"  ");
    }
%><br>
JSP(SERVLET)引擎名及版本号:<%=application.getServerInfo() %><br>

</body>
</html>
