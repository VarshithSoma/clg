#/bin/bash
echo "enter filename : "
read f
echo "enter start line : "
read st
echo "enter end line : "
read end
if [ $st -lt $end ]
then
    n1=`expr $st + 1`
    n2=`expr $end - 1`
    head -$n2 $f|tail +$n1
else
    n1=`expr $end + 1`
    n2=`expr $start - 1`
    head -$n2 $f|tail +$n1
fi
