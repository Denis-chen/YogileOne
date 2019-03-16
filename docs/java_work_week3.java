# 学号 20175223 《Java程序设计》第3周学习总结

## 教材学习内容总结
- 第四章要点：
    - 要点1：面向对象三个性质：封装性、继承、多态；
    - 要点2：类：类声明、类体、成员变量、方法、类的UML图；
    - 要点3：构造方法与对象的建立：构造方法、对象的建立和使用、对象的引用和实体；
    - 要点4：类与程序的基本结构，参数传值；
    - 要点5：对象的组合：组合和复用，类的关联关系与依赖关系；
    - 要点6：实例成员与类成员，方法重载，this关键字；
    - 要点7：包package，import；
    - 要点8：访问权限：public，protected，友好的（friendly），private；
    - 要点9：基本类型的类封装：Byte(byte num)、byteValue()等，对象数组；
    - 要点10：JRE扩展与jar文件xxx.mf,文档生成器javados，应用举例。

## 教材学习中的问题和解决过程

### 1. 引用其他类中的变量数值错误。
如下列程序用来进行阶乘运算
```
public class JDB{
    public static void main(String[] args) {
        int numone=9, numtwo=10;
        HE tet = new HE();      //为tet分配空间
        tet.mult(numone);       //实现9!并输出
        System.out.println(numone+"!的值supnum="+tet.supnum);      //输出阶乘的值
        tet.mult(numtwo);       //实现10!并输出
        System.out.println(numtwo+"!的值supnum="+tet.supnum);      //输出阶乘的值
    }
}

class HE{       //声明实现阶乘运算的类
    int supnum = 1;     //声明成员变量
    void mult(int  num){
        for (int i=1; i<=num; i++){
            supnum = supnum*i;      //进行阶乘运算
        }
    }
}
```
结果如下：
```
9!的值supnum=362880
10!的值supnum=-1736015872
```

- 问题1解决方案：
为什么9!的值是对的，但10!就不对了呢？
重点是：**类中的变量分为两种：成员变量和局部变量。成员变量在声明的方法外，成员变量的值一旦通过命令改变就不会恢复初始，进行垃圾回收。但局部变量在方法内，在方法运行完成后就会回收，下次再用方法时，会重新定义为初始值。**
而tet中的supnum是成员变量，supnum是不会随着tet中方法mult的结束而恢复初始1。在进行9!的运算后，supnum=362880；但在进行10!的运算的时候，supnum就不是1了，还是362880。这时进行的运算就是362880*10!，这个算式的结果超过了int类型的最大容量2^31-1，结果就变成了错误的值。
将程序更改如下，改变的命令已用 //** xxxxx ** 的格式标明：
```
public class JDB{
    public static void main(String[] args) {
        int numone=9, numtwo=10;
        HE tet = new HE();
        tet.mult(numone);
        System.out.println(numone+"!的值supnum="+tet.supnum);
        tet.mult(numtwo);
        System.out.println(numtwo+"!的值supnum="+tet.supnum);
    }
}

class HE{ 
    int supnum = 1; 
    void mult(int  num){
        int innum=1;        //** 声明局部变量 **
        for (int i=1; i<=num; i++){
            innum = innum*i;      //** 使用局部变量进行阶乘运算 **
        }
        supnum = innum;         //** 将局部变量的值赋值给成员变量 **
    }
}
```
正确结果如下：
```
9!的值supnum=362880
10!的值supnum=3628800
```

### 2. 可变参数的用法
声明可变参数`int ... add`基本等同于`int[] add`，如下程序。
**4个注意事项：**
1.只能出现在参数列表的最后；
2.位于变量类型和变量名之间；
3.调用可变参数的方法时，编译器为该可变参数隐含创建一个数组，在方法体中一数组的形式访问可变参数；
4.参数的类型必须保持一致。
```
public class VariableParameter {
    public static void main(String[] args) {
        //使用可变参数
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        //使用数组方式
        int[] x1=new int[]{2,3};
        int[] x2=new int[]{2,3,4};
        System.out.println(add2(x1));
        System.out.println(add2(x2));
    }

    public static int add(int x,int ... args){      //隐含建立数组(int)args[]
        int sum=x;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
    }
    //传入数组参数
    public static int add2(int[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
    }
}
```


### 3. 编写简单脚本的初尝试
[Shell脚本学习笔记]()
在初次打开终端时，只是进入根目录~，如何快速进入码云的本地仓库目录并开启root权限呢？
在根目录中`vim cas.sh`创建脚本文件，输入以下命令、保存退出；`chmod +x cas.sh`添加执行权限；在根目录中执行脚本文件`. ./cas.sh`要在普通目录中`./xxx.sh`命令之前加`. `，注意：`.`与`./`之间有空格。
```
#!/bin/sh
clear
cd /alive/string
echo "You had cd ~.alive.string."
echo ""
sudo su
```
执行脚本并输入密码结果如下：
```
You had cd ~.alive.string.

[sudo] yogile 的密码：
root@yogile-VirtualBox:/alive/string# 
```
如果这时输入`exit`回车，将停留在`/alive/string`文件夹中，但是失去了root权限。


[菜鸟教程提供的Shell在线编辑器](http://www.runoob.com/try/runcode.php?filename=helloworld&type=bash)







'123+""="123"'     //将数字转化为字符串
integer              'parseInt(String s)'     //将字符串转化为数字

- 问题2解决方案：

## 代码调试中的问题和解决过程

### 1. 仍然对类封装不太熟悉。
在编译第四章例子22时，可编译，但仍然在编译完成后想要运行它，短时间内没有意识到它是有理数的类封装。
```
root@yogile-VirtualBox:/alive/string/bin# java Rational
错误: 在类 Rational 中找不到 main 方法, 请将 main 方法定义为:
   public static void main(String[] args)
否则 JavaFX 应用程序类必须扩展javafx.application.Application
```
上述错误并非程序错误，是用法错误。Rational.class 是为Example2_23.java提供 Rational 类的可创建对象的。在 Example4_23.java 中写`public static void main(String[] args)`，以Example4_23为主类即可。


### 2.
- 问题2解决方案：


## [代码托管]
- 代码提交过程截图：

- 代码量截图：


## 其他（感悟、思考等，可选）

## 学习进度条

|            | 代码行数（新增/累积）| 博客量（新增/累积）|学习时间（新增/累积）|重要成长|
| --------   | :----------------:|:----------------:|:---------------:  |:-----:|
| 目标        | 5000行            |   30篇           | 400小时            |       |
| 第一周      | 322/322           |   1/1            | 23/23               |       |
| 第二周      | 520/842           |   3/4            | 25/48               |       |
| 第三周      | 286/1128           |   1/5            | 16/48               |       |


- 计划学习时间:23小时

- 实际学习时间:16小时

- 改进情况：
较上周，解决了可变参数的问题。


## 参考资料

-  [Java 可变参数](https://www.cnblogs.com/yqyongqing/p/3235266.html)

-  [Shell 教程 | 菜鸟教程](http://www.runoob.com/linux/linux-shell.html)

-  []()


