# Setup environment

## Install Sbt
Sbt (Simple Build Tool) is the default build tool in the Scala eco-system.

[Sbt is required for the exercises](https://www.scala-sbt.org/1.x/docs/Setup.html)

## Validate your setup

**Requires** Java 11 (or 8)

At top of the project, run the following command:

    sbt

Force the java version with
    sbt -java-home <PATH_JAVA_11>
or (for some OS)
    sbt --java-home <PATH_JAVA_11>

The path <PATH_JAVA_11> under the university machines is /usr/lib/jvm/java-11-openjdk-amd64

When sbt console is loaded, run the following command:

    project 01_intro

and run your first program:

    run

The following message should appear in the console:

    sbt:intro> run
    [info] Running com.td.scala.Intro
    Ready to learn!
    [success] Total time: 1 s, completed Sep 17, 2019 12:32:47 AM

You are ready to go on!

*Tips*: to see all available modules, use: `sbt projects`

[First exercice](../../../../../../../../01_Classes/README.md)
