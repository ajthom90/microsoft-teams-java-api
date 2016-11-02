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

## How To Use
This utility will pull in all of its required dependencies.  In order to use, pass the ```MicrosoftTeams``` class a class that implements the ```Webhook``` interface.  The only method on the interface is one that returns the URL of the Webhook as provided by Microsoft Teams.  The ```Webhook``` interface can be easily implemented by an Enum if desired to provide a static location for all of your channels.

A very simple implementation is as follows:

```
MicrosoftTeams.forUrl(new Webhook()
			{
				@Override
				public String getUrl()
				{
					return "https://outlook.office365.com/webhook/......."; //$NON-NLS-1$
				}
			}).sendMessage(sb.toString());
```
