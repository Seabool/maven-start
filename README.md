# maven-start
 Repository used when I was learning Maven. Contains the most important things that I collected while learning Maven.

### **pom.xml** Template
Use this to create a Maven project:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

	<modelVersion>4.0.0</modelVersion>
	<groupId>seabool</groupId>
	<artifactId>maven-start</artifactId>
	<version>1.0</version>

	<properties>
		<maven.compiler.source>1.7</maven.compiler.source>
		<maven.compiler.target>1.7</maven.compiler.target>
	</properties>
	
</project>
```

Then simply write in command shell:
```sh
$ mvn
```

### Add Dependencies
To add dependencies, you need to add:
```xml
<dependencies>
	[...]
</dependencies>
```
to your **pom.xml** file. Then you can just put e.g.:
```xml
<dependency>
	<groupId>org.apache.commons</groupId>
	<artifactId>commons-lang3</artifactId>
	<version>3.11</version>
</dependency>
```
inside of `<dependencies>` tag.

### JUnit Testing
Add this to your **pom.xml**:
```xml
<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.13.1</version>
	<scope>test</scope>
</dependency>
```
Dependency scope is used to limit the transitivity of a dependency and to determine when a dependency is included in a classpath.
Then simply run:

```sh
$ mvn test
```


### Useful Commands
This command cleans the maven project by deleting the target directory.
```sh
$ mvn clean
```

It’s used to compile the source Java classes of the project.
```sh
$ mvn compile
```

This command builds the maven project and packages them into a JAR, WAR, etc.
```sh
$ mvn package
```

This command builds the maven project and installs the project files (JAR, WAR, pom.xml, etc) to the local repository.
```sh
$ mvn install
```

This command builds the maven project and runs all tests.
```sh
$ mvn verify
```