#!/bin/sh

javac Sifreleyici.java
if [ $# -eq 4 ]
  then
  java -cp . Sifreleyici encrypt $1 $2 $3
  java -cp . Sifreleyici decrypt $3 $2 $4
  diff $1 $4
else
  java -cp . Sifreleyici encrypt $1 $2 $3
  cat $3
fi
