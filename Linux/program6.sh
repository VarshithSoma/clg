#!/bin/bash
for fname in $*
do
    if [ -f $fname  ]
    then 
        echo "$fname is a file"
        echo "no words are "
        wc -l "$fname"
    elif [ -d $fname ]
    then
        echo "$fname is a directory"
    else 
        echo "$fname doesnt exists"
    fi
done