public class MyUtil{
    public static String percentage2fivegrade(int grade){
        //如果成绩小于0，转成“错误”
        if ((grade < 0))
            return "错误";
            //如果成绩小于60，转成“不及格”
        else if (grade < 60)
            return "不及格";
            //如果成绩在60与70之间，转成“及格”
        else if (grade < 70)
            return "及格";
            //如果成绩在70与80之间，转成“中等”
        else if (grade < 80)
            return "中等";
            //如果成绩在80与90之间，转成“良好”
        else if (grade < 90)
            return "良好";
            //如果成绩在90与100之间，转成“优秀”
        else if (grade <= 100)
            return "优秀";
            //如果成绩大于100，转成“错误”
        else
            return "错误";
    }
}