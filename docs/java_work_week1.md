# 学号 20175223 《Java程序设计》第1周学习总结

## 教材学习内容总结
- 第一章要点：
    - 要点1：Java的三大平台：Java SE，Java EE，Java ME。
    - 要点2：Java的特点：简单，面向对象，平台无关，多线程，动态。
    - 要点3：Java程序的开发步骤：编写源文件，编译源文件，运行程序。
    - 要点4：Java的编程风格：Allmans风格，Kernighan风格，注释。
    - 要点5：Java之父：James Gosling

## 教材学习中的问题和解决过程

- 问题1：无法使用javac(1):
- 问题1解决方案：输入
    sudo update-alternatives --install /usr/bin/java java /usr/local/java/jdk1.8.0_91/bin/java 300
    sudo update-alternatives --install /usr/bin/javac javac /usr/local/java/jdk1.8.0_91/bin/javac 300

- 问题2：仍无法使用javac(2):
- 问题2解决方案：输入
    sudo su<Enter>
    键入密码

- 问题2：无法使用jdb(1):
    程序'jdb'已包含在下列软件中:
    xxxxxx
    请尝试: sudo apt install <选定的软件包>
- 问题2解决方案：是jdk的环境配置未完成，输入：
    gedit /etc/profile ##图形界面下可用gedit进行编辑
    输入配置信息
    保存，再输入：
    source /etc/profile
    使文件立即生效，重启虚拟机。

- 问题2：仍无法使用jdb(2):
    如果完成上一步骤仍出现下列信息：
    程序'jdb'已包含在下列软件中:
    xxxxxx
    请尝试: sudo apt install <选定的软件包> 
- 问题2解决方案：
    退出root权限，再进行命令。

## 代码调试中的问题和解决过程


- 问题1：
    helloqq.java:94: 错误: 已在方法 main(String[])中定义了变量 count
			for(int count=0, choicetwo = 0; count < namelist.length; count++)
			        ^
- 问题1解决方案：删除int


## [代码托管]
- 代码提交过程截图：
![image.png](https://images.gitee.com/uploads/images/2019/0303/200358_6654c9a8_4815672.png)

- 代码量截图：
![image.png](https://images.gitee.com/uploads/images/2019/0303/202733_fdb969ff_4815672.png)


## 上周考试错题总结
上周无考试

    
## 其他（感悟、思考等，可选）
JAVA的学习是进一步的，而非停留在阅读表面。学习JAVA开发真的有难度，精力的付出是学习好JAVA的基本，而耐心不只是学习JAVA，而且是学习所有东西的必要条件。但是我在学习的过程中，确确实实是沉迷其中，每解决一个遇到的问题，都有一种成就感


## 学习进度条

|            | 代码行数（新增/累积）| 博客量（新增/累积）|学习时间（新增/累积）|重要成长|
| --------   | :----------------:|:----------------:|:---------------:  |:-----:|
| 目标        | 5000行            |   30篇           | 400小时            |       |
| 第一周      | 322/322           |   1/1            | 23/23             |       |



- 计划学习时间:10小时

- 实际学习时间:23小时

- 改进情况：
相较于寒假，我更深入了解学习了Linux，git和JAVA，收获良多。


## 参考资料

-  [Java学习笔记(第8版)](http://book.douban.com/subject/26371167/) 

-  [《Java学习笔记(第8版)》学习指导](http://www.cnblogs.com/rocedu/p/5182332.html)