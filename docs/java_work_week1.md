# 学号 20175223 《Java程序设计》第1周学习总结

## 教材学习内容总结

## 教材学习中的问题和解决过程

教材学习有问题先去[https://shimo.im/doc/1i1gldfsojIFH8Ip/](https://shimo.im/doc/1i1gldfsojIFH8Ip/)看看，如果别人没有提出相同问题，可以编辑文档添加，然后把自己提出的问题复制到下面：

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

教材中代码调试有问题先去[https://shimo.im/doc/1i1gldfsojIFH8Ip/](https://shimo.im/doc/1i1gldfsojIFH8Ip/)看看，如果别人没有提出相同问题，可以编辑文档添加，然后把自己提出的问题复制到下面：

- 问题1：XXXXXX
- 问题1解决方案：XXXXXX
- 问题2：XXXXXX
- 问题2解决方案：XXXXXX
- ...

## [代码托管](码云学习项目链接)

（statistics.sh脚本的运行结果截图）

## 上周考试错题总结
- 错题1及原因，理解情况
- 错题2及原因，理解情况
- ... 

### 点评模板：

- 博客中值得学习的或问题：
    - xxx
    - xxx
    - ...
- 代码中值得学习的或问题：
    - xxx
    - xxx
    - ...
    
- 基于评分标准，我给本博客打分：XX分。得分情况如下：xxx

- [参考示例](http://www.cnblogs.com/haoliberale/p/6580822.html#3650972) 

### 点评过的同学博客和代码

- 本周结对学习情况 
    - [结对同学学号1](博客链接)
    - 结对照片
    - 结对学习内容
        - XXXX
        - XXXX
        - ...
- 上周博客互评情况（只要链接，具体点评放相应博客下）

    - [学号1](博客链接)
    - [学号2](博客链接)
    - [学号3](博客链接)
    - [学号4](博客链接)
    - ...
    
## 其他（感悟、思考等，可选）

xxx
xxx

## 学习进度条

|            | 代码行数（新增/累积）| 博客量（新增/累积）|学习时间（新增/累积）|重要成长|
| --------   | :----------------:|:----------------:|:---------------:  |:-----:|
| 目标        | 5000行            |   30篇           | 400小时            |       |
| 第一周      | 200/200           |   2/2            | 20/20             |       |
| 第二周      | 300/500           |   2/4            | 18/38             |       |
| 第三周      | 500/1000          |   3/7            | 22/60             |       |
| 第四周      | 300/1300          |   2/9            | 30/90             |       |


- 计划学习时间:XX小时

- 实际学习时间:XX小时

- 改进情况：



## 参考资料

-  [Java学习笔记(第8版)](http://book.douban.com/subject/26371167/) 

-  [《Java学习笔记(第8版)》学习指导](http://www.cnblogs.com/rocedu/p/5182332.html)
-  ...