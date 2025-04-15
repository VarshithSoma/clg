#!/bin/bash
for fname in $*
do
if [ -f $fname ]
then
echo "$fname is a file"
echo "no of lines in $fname "
wc -l $fname
elif [ -d $fname ]
then 
echo "$fname is directory"
else
echo "does not exists"
fi
done