#!/bin/bash
# local directory support from http://stackoverflow.com/questions/13861192/unable-to-access-jarfile-from-a-script-on-mac
SOURCE="${BASH_SOURCE[0]}"
DIR="$( dirname "$SOURCE" )"
while [ -h "$SOURCE" ]
do 
  SOURCE="$(readlink "$SOURCE")"
  [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE"
  DIR="$( cd -P "$( dirname "$SOURCE"  )" && pwd )"
done
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"

cd "$DIR"
# chmod 0100 ./lib/Mac_OS_X/librxtxSerial64.jnilib

OSTYPE=$(uname -m)
sudo chown root:wheel /lib/Mac_OS_X/$OSTYPE/librxtxSerial.jnilib
sudo chmod 755 /lib/Mac_OS_X/$OSTYPE/librxtxSerial.jnilib