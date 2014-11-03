#!/bin/bash

export AUDOSCORE_SECURITY_TOKEN="2c976d0b02898e9eb05155806bb65973";
( ./run_test.sh ) > /dev/null 2> /dev/null

error=0
for i in `find expected/ -type f`; do
	testfile=${i/expected/test.latest}
	sed -i -e 's/Exception(test timed out after \([^ ]*\) milliseconds): [^"]*/TimeoutException after \1 ms/g' $testfile
	sed -i -e 's/StackOverflowError(): [^"]*/StackOverflowError()/g' $testfile
	echo $i
	if [[ "$i" == expected/run*.err ]]; then
		java -cp ../../lib/junitpoints.jar:../../lib/json-simple-1.1.1.jar tools.json_diff.JSONDiff $i $testfile
	else
		diff -u -I '^make' -I '^Makefile:' $i $testfile
	fi
	ec=$?
	error=$((error|ec))
	if [[ $ec -ne 0 ]] && [[ -n "$REBUILD" ]]; then
		cp $testfile $i
	fi
done;

rm -rf $(readlink -f test.latest)
rm test.latest

exit $error
