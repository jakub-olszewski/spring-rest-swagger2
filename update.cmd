@echo off
title Git update

set project=spring-rest-swagger2
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
echo Current path: %dev_local%
echo git path: %git_app%
echo mvn path: %mvn_app%

REM cd /d %dev_local%git\github\%project%
cd /d %dev_path%
%git_app% reset --hard HEAD
%git_app% fetch --all
%git_app% reset --hard origin/master
pause
exit