#!/bin/bash
echo "enter the number"
read n
fact=1
count=1 
while [ $n -gt $count ]
do
    count=`expr $count + 1 `
    fact=`expr $fact \* $count `
done
echo "ans is $fact"