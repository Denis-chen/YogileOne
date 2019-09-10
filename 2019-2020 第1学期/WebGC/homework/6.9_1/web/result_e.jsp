<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/2
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>result_e</title>
    <link rel="stylesheet" href="word_type.css" type="text/css">
</head>
<body>
    <script language="JavaScript">
        var sysTime_start = new Date();
        var time_start = sysTime_start.valueOf();
        var time_end = time_start + 30000;
        function time_out(timeEnd) {
            var sysTime_m = new Date().valueOf();
            //timeEnd.innerHTML=time_end - sysTime_m;
            if (time_end - sysTime_m >0) {
                /**
                 * number..toFixed(x) 解决小数点问题
                 * .innerHTML= "<span class='center_type'>" + ... + "</span>"; 解决函数显示问题
                 * @type {string}
                 */
                timeEnd.innerHTML= "<span class='center_type'>" + ((time_end - sysTime_m) / 1000).toFixed(0) + "</span>";
            }
            else if (time_end - sysTime_m <= 0) {
                location.href="index.jsp";
            }

        }
        window.onload=function(){
            window.setInterval("time_out(timeEnd)","1");	//实时获取并显示系统时间
        }
    </script>
输入用户名或密码错误。<br><br>
还有<span id="timeEnd" class="center_type"></span>秒返回登录界面
</body>
</html>
