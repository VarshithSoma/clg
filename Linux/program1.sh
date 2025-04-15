#!/bin/bash

echo "Enter file name"
read f
echo "Enter the starting position"
read s
echo "Enter the ending postion"
read e
if [ $s -lt $e ]
then
n1=` expr $s + 1 `
n2=` expr $e - 1 `
head -$n2 $f|tail -$n1
else
n1=` expr $e + 1 `
n2=` expr $s - 1 `
head -$n2 $f|tail -$n1
fi

