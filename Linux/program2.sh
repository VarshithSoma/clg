#!/bin/bash
echo "Enter a word to be deleted: "
read word
echo "Enter a filename"
read filename
echo "Line in $filename after deleting $word are : "
grep -v $word $filename