#!/bin/bash
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"

javac Trans.java && \
java Trans
