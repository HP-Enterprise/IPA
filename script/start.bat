@echo off
set "JAVA_OPTS= -Xmx1g "
set "DIR=%~dp0%"

echo Using Duser.dir: %DIR%
echo Using CLASSPATH: %DIR%lib
echo Using JAVA_OPTS: %JAVA_OPTS%

java -Duser.dir=%DIR% %JAVA_OPTS% -classpath ipa.jar com.cmos.ipa.IPAEngine 2>&1
pause