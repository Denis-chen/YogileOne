<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>显示历史、显示添加留言功能</title>
    <link rel="stylesheet" type="text/css" href="word_index.css" />

    <script language="JavaScript">
        function ifNull(form_Msg){
            var userName = form_Msg.upload_UserName.value;
            var userMsg = form_Msg.upload_UserMsg.value;
            if (userName === "") {
                alert("留言人不能为空");
                form_Msg.upload_UserName.focus();
                return false;
            }
            if (userMsg === "") {
                alert("留言内容不能为空");
                form_Msg.upload_UserMsg.focus();
                return false;
            }
        }
    </script>
</head>
<body>
<span class="word_Msg">留言板</span><br><br>
<%
    if (session.isNew()){
        int number_person_index = 0;
        session.setAttribute("number_person",number_person_index);
    }
    int i;
    String[] message_index = (String[])session.getAttribute("message");
    int num = Integer.parseInt(session.getAttribute("number_person").toString());
    if (num != 0) {
        out.println("123213132");
        out.println("number_person: " + num + "<br><br>");
        for (i=0; i < num; i++) {
            out.println(message_index[i]);
        }
    }
%>
<br><hr>

<form action="deal.jsp" id="form_UploadMassage" name="form_UploadMassage" method="post" onSubmit="return ifNull(form_UploadMassage)">
    <span class="word_Msg">添加留言区域</span><br>
    留言人：<input type="text" id="upload_UserName" name="upload_UserName" title="留言人">
    留言内容：<textarea id="upload_UserMsg" name="upload_UserMsg" title="留言内容"></textarea>
    <input name="Submit" type="submit" value="提交留言">
    <input name="Submit2" type="reset" value="重置">
</form>

</body>
</html>
