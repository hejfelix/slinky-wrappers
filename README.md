# Demo

See the demo here: https://hejfelix.github.io/slinky-wrappers/

# Maven central
* React router ![React Route](https://maven-badges.herokuapp.com/maven-central/com.lambdaminute/slinky-wrappers-react-router_sjs0.6_2.12/badge.svg)
* Semantic UI ![React Route](https://maven-badges.herokuapp.com/maven-central/com.lambdaminute/slinky-wrappers-semantic-ui_sjs0.6_2.12/badge.svg)
* Material UI ![React Route](https://maven-badges.herokuapp.com/maven-central/com.lambdaminute/slinky-wrappers-material-ui_sjs0.6_2.12/badge.svg)

## Installation

See in [build.sbt](build.sbt) how the demo project is set up using [scalajs-bundler](https://github.com/scalacenter/scalajs-bundler).
For an bigger example using material ui, please see this project: https://github.com/hejfelix/wishr

# slinky-wrappers



These are wrappers that I'm writing for my own projects. Currently, there's somewhat more support for Material UI than Semantic UI. There's an example using it here: https://github.com/hejfelix/wishr

There are some things which are very difficult to model using Scala's type system. Many of these problems could potentially be fixed by Dotty (singleton types, intersection-/unition types, proper enums). 

Furthermore, the intellij support is not (IMHO) amazing when using the @react macro. Hence, I'm not too busy with this project.


