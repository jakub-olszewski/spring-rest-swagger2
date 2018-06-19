@echo off
title Run

set dev_local=%userprofile%\desktop\dev\
echo Current path: %dev_local%
set desktop_path=%userprofile%\desktop\
set dev_local=%userprofile%\desktop\dev\
set PATH=%PATH%;%dev_local%apps\apache-maven-3.5.2\bin
set PATH=%PATH%;%dev_local%apps\git\bin
set PATH=%PATH%;%dev_local%java\jdk1.8.0_152\bin
set JAVA_HOME=%dev_local%java\jdk1.8.0_152

cd /d %~dp0
call mvn clean install package
call mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=prd"
REM  java -jar -Dspring.profiles.active=prd target/spring-rest-swagger2-*.war
timeout /t 3
REM exit