@echo off
title wildfly:deploy

set dev_local=%userprofile%\desktop\dev\
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
cd /d %~dp0

REM mvnw clean install package  -Dspring.profiles.active=prd wildfly:deploy
mvnw clean install package -Dspring.profiles.active=dev wildfly:deploy

exit