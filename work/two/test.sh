#!/bin/bash
# 第一个脚本测试
echo "第一个脚本测试"
echo "Are you ready? 输入"
read readin
echo "输入为"
echo $readin
echo ""
xxx1="I love you"
echo $xxx1
xxx2='I love you'
echo $xxx2
xxx3=I_love_you
echo "Tomorrow, I would say '${xxx3}!' to you"
unset xxx3
echo $xxx3
xxx4='test: ${xxx1}'            #使用单引号            [代码1]
echo $xxx4
xxx4="test: ${xxx1}"            #使用双引号，重新赋值xxx4      [代码2]
echo $xxx4
readonly xxx4                    #将变量定义为只读变量
xxx4="True"                      #试图改变只读变量，报错
unset xxx4                        #试图删除只读变量，报错
