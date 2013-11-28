#!/bin/bash

set -e
set -x
set -o pipefail

mkdir -p mixed
list=`java -cp lib/junitpoints.jar:lib/junit.jar:. tester.ReadReplace $1 | sort | uniq`
echo "$list" > list;
source list;
rm list;
