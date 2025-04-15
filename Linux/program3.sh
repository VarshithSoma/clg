#!/bin/bash
echo "enter dir name: "
read dir
if [ -d $dir ]
 then
  cd "$dir"
  ls > f
  exec < f
  while read line
   do
    if [ -f $line ]
     then
      if [ -r "$dir" -a -w "$dir" -a -x "$dir" ]
       then
        echo "$line has all permissions"
      else
        echo "$line have not all permissions"
      fi
    fi
  done
fi
