#!/bin/bash
TARGET=demo/target/scala-2.12/scalajs-bundler/main
mkdir -p deploy
cp -v $TARGET/demo-fastopt-library.js ./deploy
cp -v $TARGET/launcher-library.js ./deploy
cp -v demo/public/index-fastopt.html ./deploy
mv -v ./deploy/index-fastopt.html ./deploy/index.html