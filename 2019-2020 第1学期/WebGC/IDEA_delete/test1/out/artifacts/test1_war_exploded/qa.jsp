<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/2
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>qa</title>
</head>
<body>
<%
    String[] b = (String [])session.getAttribute("a");
    String[] cc = (String [])request.getSession().getAttribute("data");
    out.print(b[0]);
    out.print(b[1]);
    out.print(Integer.parseInt(b[0]));
    if (!b[0].equals("")) {
        out.print("<br>"+b[0]);
    }
    out.print("<br>"+cc[0]);
    session.setAttribute("a",b);
    session.setAttribute("dd",cc);
    //response.sendRedirect("index.jsp");

%>

<form action="index.jsp" id="form_UploadMassage" name="form_UploadMassage" method="post">
    <span class="word_Msg">添加留言区域</span><br>
    <input name="Submit" type="submit" value="提交留言">
</form>
</body>
</html>
