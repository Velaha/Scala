# Setup environment

## Clone the repository
```bash
git clone https://gitlab.com/fabszn/td_scala.git
cd td_scala
```

## Install
-  Java 11
- [Sbt](https://www.scala-sbt.org/1.x/docs/Setup.html)

## Start Sbt

Sbt (Simple Build Tool) is the default build tool in the Scala eco-system.

From the root of the repository

- `sbt` runs sbt in interative mode
    - `sbt -v` with verbose startup (checkout Java version)
    - `sbt -java-home <PATH_JAVA_11>` with specific Java version
    - `sbt --java-home <PATH_JAVA_11>` some version require double dash

Note: under some Linux machines *<PATH_JAVA_11>* is `/usr/lib/jvm/java-11-openjdk-amd64`

### Typical Sbt structure
    build.sbt                               // the build description file
    project/                                // configuration of the build
        build.properties                    // sbt.version
        plugin.sbt                          // plugins for sbt (ex: scalafmt for formatting code)
    src/
        main/
            resources/                      // main files to include main in jar
            scala/                          // main Scala sources
            java/                           // main Java sources
        test/
            resources                       // files to include in test jar
            scala/                          // test Scala sources
            java/                           // test Java sources

In this repository, there are multiple `src` placed in different directory `week1_intro`, ... that correspond to sub-modules as defined in `build.sbt`.

## Validate your setup

To continue, you must have
- cloned the repository
- move at the top of the repository
- run sbt in interative mode

### List sub-projects
```
projects
```

### Select a sub-project
```
project week1_intro
```

### Run the main class of this sub-project
```
run
```

The following message should appear in the console
>>>
sbt:intro> run

[info] Running com.td.scala.Intro

Ready to run the tests!

[success] Total time: 1 s, completed Sep 17, 2019 12:32:47 AM
>>>

### Test the code
```
test
```

The following message should appear in the console
>>>
sbt:TD Scala> week1_intro/test

[info] IntroTest:

[info] A test

[info] - should always pass

[info] Run completed in 344 milliseconds.

[info] Total number of tests run: 1

[info] Suites: completed 1, aborted 0

[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0

[info] All tests passed.

[success] Total time: 1 s, completed 2 Oct 2020, 21:54:44
>>>

### Alternatives
- In interative mode `<project_name>/run` or `<project_name>/test`
- From batch, `sbt "run"`, `sbt "<project_name>/run"`, ...


# Next

Before you continue,
- note that compiled classes have been generated to `/target`
- you can use the sbt command `scalafmt` (added via a plugin) to format the source code

You are ready to go on!

[First exercice](../../../../../../../../01_Classes/README.md)
