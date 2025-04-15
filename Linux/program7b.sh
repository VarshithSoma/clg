#!/bin/bash
echo "enter the directory name : "
read dir
cd "$dir"
ls -l | grep "^d"