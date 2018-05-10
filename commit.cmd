@echo off
title Git commit 

set dev_path=%~dp0
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
echo Current path: %dev_local%
echo git path: %git_app%
echo mvn path: %mvn_app%

cd /d %dev_path%
REM %git_app% remote set-url origin https://github.com/jakub-olszewski/minecraft-game.git
%git_app% config credential.helper "" 
%git_app% status 
%git_app% add -A
%git_app% config --global user.email j.b.olszewski@gmail.com
%git_app% config --global user.name "Jakub Olszewski"
%git_app% config --global user.username jakub-olszewski
set /p comment="Comment: "
%git_app% commit -a -m "%comment%"
%git_app% push -u origin master

%git_app% config credential.helper "" 
pause
exit