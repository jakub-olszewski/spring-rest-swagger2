@echo off
title mvn

set dev_local=%userprofile%\desktop\dev\
echo Current path: %dev_local%
set desktop_path=%userprofile%\desktop\
set dev_local=%userprofile%\desktop\dev\
set PATH=%PATH%;%dev_local%apps\apache-maven-3.5.2\bin
set PATH=%PATH%;%dev_local%apps\git\bin
set PATH=%PATH%;%dev_local%java\jdk1.8.0_152
set JAVA_HOME=%dev_local%java\jdk1.8.0_152

cd /d %~dp0

call mvn clean package install
timeout /t 3
exit