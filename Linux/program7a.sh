 #!/bin/bash
if [ $# -eq  0 ]
then
    echo "no arguments"
else
    tr " " "\n" < $1 > temp
    shift
    y=`wc -l < temp`
    for i in $*
    do
        tr " " "\n" < $i > temp1
        j=1
        while [ $j -le $y ]
        do
            x=`head -$j temp | tail -1`
            c=`grep -c "$x" temp1`
            echo $x $c
            j=`expr $j + 1`
        done
    done
fi