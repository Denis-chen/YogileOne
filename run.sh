#!/bin/sh

javac -d bin string/hello.java
cd bin
java hello
cd ..
