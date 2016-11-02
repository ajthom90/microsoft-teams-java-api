# Microsoft Teams Java API

[![Release](https://jitpack.io/v/com.andrewthom/microsoft-teams-java-api.svg)](https://jitpack.io/#com.andrewthom/microsoft-teams-java-api)

This is a start of a Java API for the Microsoft Teams platform.  It currently supports sending messages as Incoming Webhooks to channels in Microsoft Teams.

To use, add the following repository to your Maven configuration: 

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

And add the following dependency: 

```
<dependency>
  <groupId>com.andrewthom</groupId>
  <artifactId>microsoft-teams-java-api</artifactId>
  <version>0.1</version> <!-- Replace with whatever the current version is -->
</dependency>
```

The version number can be any release as defined on GitHub.  To always keep up to date with the latest branch, set the version to ```master-SNAPSHOT```.

## Prerequisites
This utility requires Spring Security, and also the Spring JDBC JAR on the build path.  At this time, the utility will only log to a database via JDBC, but in the future it may support other datastores.  If you have an idea for another datastore, please submit an issue (or, even better, download the source code, add support, and submit a pull request!!).  

## Database Table Layout
The database table layout is fairly simple (four columns, using a GUID as the primary key).  Sample DDL for MySQL can be found in [src/main/java/com/github/ajthom/springsecurityloginlogger/service](https://github.com/ajthom90/spring-security-login-logger/blob/master/spring-security-login-logger/src/main/java/com/github/ajthom90/springsecurityloginlogger/service/mysql_table_layout.sql).
