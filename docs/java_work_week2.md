# 学号 20175223 《Java程序设计》第2周学习总结

## 教材学习内容总结
- 第二章要点：
    - 要点1：标识符与关键字
    - 要点2：基本数据类型：逻辑类型boolean，整数类型int|byte|short|long，字符类型char，浮点类型float|double
    - 要点3：输入基本型数据、输出基本型数据
    - 要点4：数组：声明，分配元素，length使用
- 第三章要点：
    - 要点1：运算符与表达式
    - 要点2：if分支语句
    - 要点3：switch开关语句
    - 要点4：循环语句：for | while | do while
    - 要点5：break和continue语句
    - 要点6：for语句与数组：for each

## 教材学习中的问题和解决过程

### 1. 如何使用git更新远程仓库代码到本地仓库？

- 问题1解决方案：git更新远程仓库代码到本地仓库的主要命令:
```
git branch -a  ##可查看所有仓库分支
git remote -v  ##可查看远程仓库分支
git fetch origin master:xxx  /*可在本地新建一个xxx分支
                               并将远程仓库的master分支的代码下载到本地分支xxx上
                               再键入 `git branch -a` 会发现xxx已在分支中*/
git diff xxx  ##可比较当前本地仓库和xxx仓库
git merge xxx  ##可更新本地仓库
git branch -d xxx  ##可删除xxx分支
```
这时，你的远程仓库代码就更新到本地仓库。

### 2. 如何解决git更新本地仓库并修改后却无法更新到远程仓库？
- 问题2解决方案：
用git配置，在[《Java程序设计》第1周学习总结](https://gitee.com/Yogile/YogileOne/blob/master/docs/java_work_week1.md#)教材学习中的问题和解决过程问题5。


### 3. 无法运行已经编译完成的源文件
```
root@yogile-VirtualBox:/alive/string# javac -d bin string/name.java
root@yogile-VirtualBox:/alive/string# java string/name
错误: 找不到或无法加载主类 string.name
```
或者是出现这种情况：
```
root@yogile-VirtualBox:/alive/string# java -cp string name
错误: 找不到或无法加载主类 name
```
- 问题3解决方案：两种情况均是解释文件的格式不对。解释器java.exe解释的并不是源文件本身，而是编译后的文件xxx.class。由于`javac -d bin string/name.java`将编译name.java生成的name.class字节码文件生成到bin文件夹中，所以应该用`java -cd bin name`运行。

### 4. 无法使用`sudo apt-get update`，fghdf.
```
$ sudo apt-get update
正在读取软件包列表... 完成
E: 无法获得锁 /var/lib/apt/lists/lock - open (11: 资源暂时不可用)
E: 无法对目录 /var/lib/apt/lists/ 加锁
```
- 问题4解决方案：

方案一：输入
```
sudo rm /var/lib/apt/lists/lock
sudo rm /var/cache/apt/archives/lock
```
方案二：


### 5. 
```

```
- 问题5解决方案：

## 代码调试中的问题和解决过程

### 1. 非英文的字符出错，变成乱码。
```
string/Example2_1.java:3: 错误: 未结束的字符文字
      char chinaWord='��',japanWord='��';
                                       ^
```
或
```
string/Example2_1.java:148: 错误: 需要class, interface或enum
```
- 问题1解决方案：这些部分代码是我从其它地方复制过来的，有些不可见字符也被复制了。这是Windows中日文等的编码格式与Unicode的冲突。不可直接编译，需重新在Linux系统中键入文字。

### 2.
```
root@yogile-VirtualBox:/alive/string# javac work/Circular.java
work/Circular.java:3: 错误: 找不到符号
    Circle bottom;
    ^
  符号:   类 Circle
  位置: 类 Circular
```
- 问题2解决方案：

### 3.
```

```
- 问题1解决方案：

## [代码托管]
- 代码提交过程截图：


- 代码量截图：



## 上周考试错题总结
上周考试无错题。

    
## 其他（感悟、思考等，可选）

## 学习进度条

|            | 代码行数（新增/累积）| 博客量（新增/累积）|学习时间（新增/累积）|重要成长|
| --------   | :----------------:|:----------------:|:---------------:  |:-----:|
| 目标        | 5000行            |   30篇           | 400小时            |       |
| 第一周      | 322/322           |   1/1            | 23/23               |       |
| 第一周      | 0/390           |   1/2            | 8/23               |       |



- 计划学习时间:23小时

- 实际学习时间:8小时

- 改进情况：
相较于寒假，我更深入了解学习了Linux，git和JAVA，收获良多。


## 参考资料

-  [Java学习笔记(第8版)](http://book.douban.com/subject/26371167/) 

-  [《Java学习笔记(第8版)》学习指导](http://www.cnblogs.com/rocedu/p/5182332.html)

-  [GIT更新远程仓库代码到本地仓库以及GIThub上SHH的设定](https://blog.csdn.net/weixin_41884599/article/details/82317566)

-  [Java 9 尝鲜之JShell交互式编程环境](https://www.cnblogs.com/IcanFixIt/p/6690478.html)