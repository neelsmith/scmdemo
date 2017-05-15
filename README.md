# Demo of cross-compiling build for working with `scm`


The [Scala Cite Manager](https://github.com/cite-architecture/scm.git) has a number of dependencies.  Getting versions right in a build set up for working in a cross compiled environment can be a little tricky.  The set up in this repo works with Scala 2.11.8.

## Using interactively

1. `sbt`
2. From the sbt prompt, set the version explicitly: `++ 2.11.8`

From the sbt prompt, you now have the option of running a console in the JVM environment, using `crossedJVM/console`.
