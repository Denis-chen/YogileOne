
package cc.icoc.javaxu.action;

import java.util.ArrayList;
import java.util.Scanner;
import cc.icoc.javaxu.datas.StudentInfo;

public class Op
{
int stuNo,stuAge;
String stuName,stuClass,stuSex;
ArrayList<StudentInfo> list;
blic static void main(String[] args)
{
// TODO Auto-generated method stub
new Operation().operation();
}

private int inputInt()
{
Scanner scanner = new Scanner(System.in);
return scanner.nextInt();
}

private String inputStr()
{
Scanner scanner = new Scanner(System.in);
return scanner.nextLine();
}

private void operation()
{
if(list == null)
{
list = new ArrayList<StudentInfo>();
}
while(true)
{
System.out.println("\t\t\t学生信息管理系统\n");
System.out.println("1.信息查阅");
System.out.println("2.信息查询");
System.out.println("3.信息录入");
System.out.println("4.退出系统");

int what = inputInt();

if ( what == 1 )
{
getInfo();
} else if ( what == 2 )
{
allSerach();
} else if ( what == 3 )
{
inputInfo();
} else if( what == 4 )
{
System.out.println("已经退出系统");
System.exit(0);
}
}
}


private void getInfo()
{
if(!list.isEmpty())
{
for ( int i = 0; i < list.size(); i++ )
{
System.out.println(list.get(i));
}
}
}


private void allSerach()
{
System.out.println("1.输入学号进行查询");
System.out.println("2.输入姓名进行查询");
int what = inputInt();
if(what == 1)
{
System.out.println("请输入学号：");
search(inputInt());
}
else
{
System.out.println("请输入姓名：");
search(inputStr());
}
}


private StudentInfo search(String name)
{
for ( int i = 0; i < list.size(); i++ )
{
if(list.get(i).getStuName().equals(name))
{
System.out.println(list.get(i));
return list.get(i);
}
}
System.out.println("未查询到该名字的学生");
return null;
}


private StudentInfo search(int id)
{
for ( int i = 0; i < list.size(); i++ )
{
if(list.get(i).getStuNo()==id)
{
System.out.println(list.get(i));
return list.get(i);
}
}
System.out.println("未查询到该学号的学生");
return null;
}


private void inputInfo()
{
try
{
System.out.print("请输入学生学号：\n");
stuNo = inputInt();
System.out.print("请输入学生姓名：\n");
stuName = inputStr();
System.out.print("请输入学生性别：\n");
stuSex = inputStr();
System.out.print("请输入学生年龄：\n");
stuAge = inputInt();
System.out.print("请输入学生班级：\n");
stuClass = inputStr();
list.add(new StudentInfo(stuNo, stuAge, stuName, stuSex, stuClass));
} catch (Exception e)
{

System.out.println("不允许为空，请重新输入");
}
}
}

package cc.icoc.javaxu.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stu
{
int countStu = 0;
int sum = 0;
int avg = 0;
List<StuBean> list = new ArrayList<Stu.StuBean>();

public static void main(String[] args)
{
new Stu().go();
}

private void go()
{
A:while(true)
{

StuBean bean = new StuBean();

System.out.println("请输入成绩：");
System.out.println("语文：");
bean.setYuwen(scanner());

System.out.println("数学：");
bean.setMath(scanner());


System.out.println("英语：");
bean.setEnglish(scanner());


list.add(bean);

for ( int i = 0; i < list.size(); i++ )
{
sum += list.get(i).english+list.get(i).math+list.get(i).yuwen;
}
avg = sum / (3*list.size());
System.out.println("当前有"+list.size()+"条学生记录，所有学生总分="+sum+"平均分为"+avg);


System.out.println("\n已成功录入一个学生的数据，是否继续/退出(y/x)");
if("x".equals(scannerString()))
break A;
}
}


private int scanner()
{
Scanner scanner = new Scanner(System.in);
return scanner.nextInt();
}


private String scannerString()
{
Scanner scanner = new Scanner(System.in);
return scanner.nextLine();
}

class StuBean
{
int math;
int yuwen;
int english;
public int getMath()
{
return math;
}
public void setMath(int math)
{
this.math = math;
}
public int getYuwen()
{
return yuwen;
}
public void setYuwen(int yuwen)
{
this.yuwen = yuwen;
}
public int getEnglish()
{
return english;
}
public void setEnglish(int english)
{
this.english = english;
}
}
}


package cc.icoc.javaxu.datas;


public class StudentInfo
{
int stuNo,stuAge;
String stuName,stuSex,stuClass;

public StudentInfo(int stuNo, int stuAge, String stuName, String stuSex, String stuClass)
{
super();
this.stuNo = stuNo;
this.stuAge = stuAge;
this.stuName = stuName;
this.stuSex = stuSex;
this.stuClass = stuClass;
}

public int getStuNo()
{
return stuNo;
}

public void setStuNo(int stuNo)
{
this.stuNo = stuNo;
}

public int getStuAge()
{
return stuAge;
}

public void setStuAge(int stuAge)
{
this.stuAge = stuAge;
}

public String getStuName()
{
return stuName;
}

public void setStuName(String stuName)
{
this.stuName = stuName;
}

public String getStuSex()
{
return stuSex;
}

public void setStuSex(String stuSex)
{
this.stuSex = stuSex;
}

public String getStuClass()
{
return stuClass;
}

public void setStuClass(String stuClass)
{
this.stuClass = stuClass;
}

@Override
public String toString()
{

String s = "学号："+getStuNo()+"\t姓名："+getStuName()+" \t性别："+getStuSex()+"\t年龄："+getStuAge()+"\t班级："+getStuClass();
return s;
}

} 
