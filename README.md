let-there-be-light
=========

![Screenshot](https://github.com/natedawg1013/let-there-be-light/raw/dev/img/screenshot1.png)

Overview
--------
An open source light controller that takes input from a microphone, or from sound playing through a computer, and uses it to control a DMX lighting system based on user presets.

Downloads
---------
**under construction**

Windows (32-bit and 64-bit) Installer

Linux (32-bit and 64-bit) Installer

Mac OS X Installer

Standalone (portable, Windows, Linux, Mac)


Usage Notes
--------
###Windows###

###Linux###

###Mac###

Run ltbl using "run.command"

#####Common Mac problems#####
>```
Sorry, try again.
>```
>This can happen when "run.command" attempts to set proper permissions on the RXTX libraries, but can't because it was unable to acquire administrator privilages. You may have typed your password incorrectly or you may not be an administrator.
>If you are an administrator and you do not have a password, you will unfortunately need to assign a password to your account or use an administrator account that has a password.

>https://support.apple.com/en-au/HT202035

#

>```
open() failed with errno=13
	at java.lang.ClassLoader$NativeLibrary.load(Native Method)
>```
>This is caused when the RXTX libraries do not have access to shared memory or the permissions are not set for execution.
>To fix this, use "run.command" as an administrator

#

>```
java.lang.UnsatisfiedLinkError: no rxtxSerial in java.library.path thrown while loading gnu.io.RXTXCommDriver
>```
>This is caused when the RXTX library is not allowed to be executed in terminal.
>To fix this, you may need to use terminal and run this command
>```
>chmod -x ./lib/Mac_OS_X/$(uname -m)/librxtxSerial.jnilib"
>```

#

>```
>Exception in thread "main" java.lang.UnsupportedClassVersionError: ltbl/control/Runner : Unsupported major.minor version 51.0",
>```
>This is caused because Let There Be Light was designed for Java 7 and uses the terminal to call Java. On Mac OS X, to call Java from the terminal, you must have both JRE and JDK installed.
>To fix this, download the latest JRE and JDK for your system.

>JRE: https://www.java.com/en/download/

>JDK: http://www.oracle.com/technetwork/java/javase/downloads/index.html

#
>If you are running Mac OS X 10.5.8 or earlier and any of the above issues persist, it could be because you are typing your password wrong when prompted, your account is not an administrator, or that your account does not have a password.
>If you do not have a password, you will unfortunately need to assign a password to your account or use an administrator account that has a password.

>https://support.apple.com/en-au/HT202035

TODO
----
*Get Sound-based effects working

Change Log
----------
...
