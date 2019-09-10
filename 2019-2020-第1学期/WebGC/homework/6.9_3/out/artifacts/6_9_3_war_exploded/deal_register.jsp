<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/6
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userName_dC = request.getParameter("userName");
    String userPassword_dC = request.getParameter("userPassword");
%>
userName_dC:<%= userName_dC%>
userPassword_dC:<%= userPassword_dC%>
<%
    application.setAttribute("userName",userName_dC);
    out.print(application.getAttribute("userName"));
    application.setAttribute("userPassword",userPassword_dC);
    /*
    前往结果界面：

    */
    //response.sendRedirect("deal_success.jsp");
%>

<br><br>
<form action="deal_success.jsp" name="back_dC_Form" id="back_dC_Form" method="post" >
    <input name="back_dC_Submit" type="submit" value="前往结果界面">
</form>
<br><br>

<%
    session.setAttribute("userName",userName_dC);
    out.print(session.getAttribute("userName"));
    session.setAttribute("userPassword",userPassword_dC);
    /*
    前往结果界面：

    */
    //response.sendRedirect("deal_success.jsp");
%>
</body>
</html>
