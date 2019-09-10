<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/10
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>检测输入的日期格式是否合法</title>
    <script language="JavaScript">
        function checkTime(strTime) {
            var bigMounth=[1,3,5,7,8,10,12];
            var separate, sepCount=0, strEle;
            var strYear, strMonth, strDay;
            var i;
            //若为空，则返回
            if (strTime === "") {
                return -1;
            }
            //alert("123");
            //console.log("sepCount:"+sepCount);    //什么意思
            if (strTime.indexOf('-') !== -1) {
                strEle = strTime.split('-');
                if(strEle.length !== 3) {
                    return -1;
                }
                for(i=0;i<3;i++) {
                    //isNaN():判断是否为非数字
                    //      也可理解为：判断是否可以被Number()合法地转换成数字，若不可，则返回true，若可以，返回false
                    if(isNaN(strEle[i]) === true) {
                        return -1;
                    }
                }
                //alert("strEle[0]:"+strEle[0]+"\nstrEle[1]:"+strEle[1]+"\nstrEle[2]"+strEle[2]);
                separate = '-';
                strYear = strEle[0];
                strMonth = strEle[1];
                strDay = strEle[2];
            }
            else {
                if (strTime.indexOf('/') !== -1) {
                    strEle = strTime.split('/');
                    if(strEle.length !== 3) {
                        return -1;
                    }
                    for(i=0;i<3;i++) {
                        //isNaN():判断是否为非数字
                        //      也可理解为：判断是否可以被Number()合法地转换成数字，若不可，则返回true，若可以，返回false
                        if(isNaN(strEle[i]) === true) {
                            return -1;
                        }
                    }
                    //alert("strEle[0]:"+strEle[0]+"\nstrEle[1]:"+strEle[1]+"\nstrEle[2]"+strEle[2]);
                    separate = '/';
                    strYear = strEle[0];
                    strMonth = strEle[1];
                    strDay = strEle[2];
                }
                else {
                    return -1;
                }
            }

            //判断除2月的大小月
            for(i=0;i<bigMounth.length;i++) {
                if(strMonth === bigMounth[i]) {
                    if(strDay<1 || strDay>31) {
                        return -1;
                    }
                }
                else if(strMonth !== 2) {
                    if(strDay<1 || strDay>30) {
                        return -1;
                    }
                }
            }
            /**
             * 判断闰年
             */
            if((strYear % 4 === 0 && strYear % 100 !== 0) || strYear % 400 ===0) {
                if(strMonth === 2) {
                    if(strDay<1 || strDay>29) {
                        return -1;
                    }
                }
                //alert("是闰年。");
            }
            else {
                if(strMonth === 2) {
                    if(strDay<1 || strDay>28) {
                        return -1;
                    }
                }

                //alert("不是闰年。");
            }
            return 1;
        }
    </script>

    <script language="javascript">
        function main(uploadForm) {
            if (uploadForm.enterTime.value === "") {
                alert("内容为空，请输入日期");
                uploadForm.enterTime.focus();   //将鼠标焦点移动到文本框内
                return false;   //若输入为空，不进入判断程序
            }
            //alert("1233");
            if (checkTime(uploadForm.enterTime.value) === -1) {
                alert("您输入的日期不正确！\n日期格式：2019/8/7或2019-8-7\n以及该年二月是否为闰年。");
            }
            else if (checkTime(uploadForm.enterTime.value) === 1) {
                alert("您输入的日期正确。");
            }
        }
    </script>
</head>
<body>
<%
    String name_Jsp = request.getAttribute("name_jsp").toString();
%>
name_Jsp:<%= name_Jsp %><br>


<form action="" name="uploadForm_1" method="post">
    <!-- 如何在填文本框时，填入之前显示字符，在焦点到文本框后，字符消失？ -->
    <input name="enterTime" type="text" id="enterTime" title="">
    <input name="uploadForm" type="button" value="提交表单" onclick="main(uploadForm_1)">
</form>
</body>
</html>