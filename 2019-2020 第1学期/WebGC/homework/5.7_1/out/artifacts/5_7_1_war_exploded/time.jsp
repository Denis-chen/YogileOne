<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script language="JavaScript">
    function showNowTime(now_time) {
        let nowTime = new Date();
        let textTime = nowTime.getFullYear() + "年" + nowTime.getMonth() + "月" + nowTime.getDate() + "日&nbsp;" + nowTime.getHours() + "时:" + nowTime.getMinutes() + "分:" + nowTime.getSeconds() + "秒";
        now_time.innerHTML = textTime;
    }
    window.onload=function(){
        window.setInterval("showNowTime(now_time)",1000);
        //实时获取并显示系统时间
    }
</script>
<div id="now_time"></div>