# Demo of cross-compiling build for working with `scm`


The [Scala Cite Manager](https://github.com/cite-architecture/scm.git) has a number of dependencies, so getting versions right in a build set up for working in a cross compiled environment can be a little tricky.  The set up in this repo works with Scala 2.11.8.

To demonstrate how to use CITE libraries in cross-compiled environments, the repository includes a script you can load in an interactive JVM console (`testworks.sc`), and a Main class you can run in a ScalaJS environment (you can see the source in `js/src/main/scala/Main.scala`).

The two scripts run through an identical sequence of actions.

## Running the JVM script

1. `sbt`
2. From the sbt prompt, set the version explicitly: `++ 2.11.8`, then start a console `crossedJVM/console`.
3. In the JVM console, load the script: `:load testworks.sc`


## Running the ScalaJS program


1. `sbt`
2. From the sbt prompt, set the version explicitly: `++ 2.11.8`
3. From the sbt prompt, run `crossedJS/run`
