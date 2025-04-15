#!/bin/bash
echo "enter filename: "
read f
echo "enter word"
read w
grep -v $w $f