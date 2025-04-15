#!/bin/bash
echo "enter file name:"
read file
echo "enter starting postion"
read starting
echo "enter ending position"
read ending
echo "the lines between $starting and $ending from $file"
if [ $starting -lt $ending ]; then
  n1=$(expr $starting + 1)
  n2=$(expr $ending - 1)
  head -$n2 $file | tail +$n1
elif [ $starting -gt $ending ]; then
  n3=$(expr $starting - 1)
  n4=$(expr $ending + 1)
  head -$n3 $file | tail +$n4
fi
