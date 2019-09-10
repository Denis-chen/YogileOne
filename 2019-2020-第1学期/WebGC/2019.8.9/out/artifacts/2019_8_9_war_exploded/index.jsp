<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/9
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>判断身份证号是否合法</title>
    <!-- 主函数 -->
    <script language="javascript">
        function main(uploadForm) {
            if (uploadForm.enterIdNo.value === "") {
                alert("内容为空，请输入身份证号");
                uploadForm.enterIdNo.focus();   //将鼠标焦点移动到文本框内
                return false;   //若输入为空，不进入判断程序
            }
            else if(uploadForm.enterIdNo.value.length !== 18) {
                alert("请检查输入身份证号长度");
                uploadForm.enterIdNo.focus();   //将鼠标焦点移动到文本框内
                return false;   //若输入为空，不进入判断程序
            }
            if(GB_T2260(uploadForm.enterIdNo.value) === -1) {
                alert("输入的身份证号行政区划错误");
            }
            else {
                if (checkTime(uploadForm.enterIdNo.value) === -1) {
                    alert("您输入的身份证号日期不正确！\n日期格式：20190807，无分隔符\n以及该年二月是否为闰年。");
                }
                else {
                    if(orderAndCheck(uploadForm.enterIdNo.value) === -1) {
                        alert("您输入的身份证号顺序码或效验码不正确。");
                    }
                    else {
                        alert("您输入的身份证号正确。");
                    }
                }
            }
        }
    </script>

    <!-- 身份证号前六位行政区划判断 -->
    <script language="JavaScript">
        /**
         * @return {number}
         * 应该用数据库，而不单单是判断数字
         */
        function GB_T2260(IdNo) {
            var IdNo_Admini = IdNo.substr(0,6);
            /**
             * 应该用正则表达式判断
             */
            if(isNaN(IdNo_Admini) === true) {
                return -1;
            }
            return 1;
        }
    </script>

    <!-- 身份证号时间判断 -->
    <script language="JavaScript">
        function checkTime(IdNo) {
            var bigMonth=[1,3,5,7,8,10,12];
            var strEle, strYear, strMonth, strDay;
            var i;
            //若为空，则返回
            if (IdNo === "") {
                return -1;
            }
            strEle = IdNo.substr(6,8);
            if(strEle === "" || isNaN(strEle) === true) {
                return -1;
            }
            strYear = strEle.substr(0,4);
            strMonth = strEle.substr(4,2);
            strDay = strEle.substr(6,2);

            //判断除2月的大小月
            for(i=0;i<bigMonth.length;i++) {
                if(parseInt(strMonth) === bigMonth[i]) {
                    if(strDay<1 || strDay>31) {
                        return -1;
                    }
                }
                else if(parseInt(strMonth) !== 2) {
                    if(strDay<1 || strDay>30) {
                        return -1;
                    }
                }
            }
            /**
             * 判断闰年
             */
            if((strYear % 4 === 0 && strYear % 100 !== 0) || strYear % 400 ===0) {
                if(parseInt(strMonth) === 2) {
                    if(strDay<1 || strDay>29) {
                        return -1;
                    }
                }
                //alert("是闰年。");
            }
            else {
                if(parseInt(strMonth) === 2) {
                    if(strDay<1 || strDay>28) {
                        return -1;
                    }
                }
                //alert("不是闰年。");
            }
            return 1;
        }
    </script>

    <!-- 身份证号后六位顺序码判断 -->
    <script language="JavaScript">
        function orderAndCheck(IdNo) {
            var i;
            var IdNo_OC = IdNo.substr(14,4);
            if(isNaN(IdNo_OC) === true) {
                for(i=0;i<3;i++) {
                    if(isNaN(IdNo_OC[i]) === true) {
                        return -1;
                    }
                }
                if(IdNo_OC[3] === 'X' || isNaN(IdNo_OC[3]) === false) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
            return 1;
        }
    </script>


</head>
<body>
<form action="" name="uploadForm_1" method="post">
    <!-- 如何在填文本框时，填入之前显示字符，在焦点到文本框后，字符消失？ -->
    <input name="enterIdNo" type="text" id="enterIdNo" title="">
    <input name="uploadForm" type="button" value="提交表单" onclick="main(uploadForm_1)">
</form>
</body>
</html>