# Setup environment

## Clone the repository
```bash
git clone https://gitlab.com/fabszn/td_scala.git
cd td_scala
```

## Install
-  Java 11
- [Sbt](https://www.scala-sbt.org/1.x/docs/Setup.html)

## Sbt commands

Sbt (Simple Build Tool) is the default build tool in the Scala eco-system.

From the root of the repository

- `sbt` runs sbt in interative mode
    - `sbt -v` with verbose startup (checkout Java version)
    - `sbt -java-home <PATH_JAVA_11>` with specific Java version
    - `sbt --java-home <PATH_JAVA_11>` some version require double dash

Note: under some Linux machines *<PATH_JAVA_11>* is `/usr/lib/jvm/java-11-openjdk-amd64`

## Validate your setup

To continue, you must have
- cloned the repository
- move at the top of the repository
- run sbt in interative mode

In Sbt interactive mode,
- You can **list** the sub-projects with

    projects

- **Select** which sub-project to execute with the sbt command `project <project_name>`

    project week1_intro

- **Run** the _runnable_ class of this sub-project with

    run

The following message should appear in the console:

>>>
sbt:intro> run

[info] Running com.td.scala.Intro

Ready to learn!

[success] Total time: 1 s, completed Sep 17, 2019 12:32:47 AM
>>>

- **Test** the code with the unit-tests

    test

You are ready to go on!

[First exercice](../../../../../../../../01_Classes/README.md)
