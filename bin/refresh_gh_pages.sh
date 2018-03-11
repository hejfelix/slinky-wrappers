#!/bin/bash
TARGET=demo/target/scala-2.12/scalajs-bundler/main
cp -v $TARGET/demo-fastopt-library.js .
cp -v $TARGET/launcher-library.js .
cp -v demo/public/index-fastopt.html .
mv -v index-fastopt.html index.html