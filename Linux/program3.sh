#!/bin/bash
echo "enter directory name "
read dir
if [ -d "$dir" ]
then
  cd "$dir"
  ls > f
  exec < f
  while read line
  do
  if [ -f "$line" ]
  then
    if [ -r "$line" -a -w "$line" -a -x "$line" ]
      then
        echo "$line has all permissons"
      else 
        echo "$line has no permissons"
      fi
    fi
  done
fi