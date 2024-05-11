# Core Spring Framework
- It's a bean factory for creating and managing beans in factory context.
- Aspect Oriented Programming (AOP). Create application wide services (logging, security, transactions). And we can apply these services to our objects.
- Data access layer: JDBC, ORM, JMS
- Web layer: Servlet, WebSocket

## Spring projects
- [Spring projects](spring.io/projects) modules that help you to build your application. Add only what you need.

## Maven
- Maven is a project management tool
- Tell Maven the dependencies your application have, Maven will download these JAR files and add them to the build/class path during runtime.
- Standard project structure, so Maven projects are portable, we can share project between IDEs

## Project structure
- pom.xml: your shopping list, Maven will download JAR files based on this file.
- Maven wrapper files: mvnw allows you to run a Maven project, you don't need to install Maven locally
- application.properties: property values can be injected to application using @Value annotation
- java: java source code
- resources: properties and config files used by your app
- test: testing code
- target: destination directory for compiled code

### POM file
- project metadata: Project name, version, output file type (JAR, WAR) etc...
- dependencies: Projects that we depended on (e.g. Hibernate, Spring)
- plug ins: Additional custom tasks to run (e.g. generate Junit test reports etc...)

#### Project Coordinates
- Unique address to identify a project
  ```
    <groupId>com.atlassian.smarts</groupId> // package address
    <artifactId>user-recommendations</artifactId> // project name
    <version>1.0-SNAPSHOT</version> // version
  ```
  we can find similar structure for other dependencies
  ```
    <groupId>io.atlassian.micros.contrib</groupId>
    <artifactId>micros-spring-boot-bom</artifactId>
    <version>6.11.3</version>
  ```
  Version is optional to add a dependency, but it's recommended to always add it.

- Where to find these project coordinates when I want to add a dependency? 
  - Maven has a [central repository](https://central.sonatype.com/) that you can search for a project details.
- Spring starter devtools gives you the ability to rebuild the application automatically after changing the code.

## Spring Boot Actuator
- Exposes endpoints to monitor and manage your application
- You easily get DevOps functionality out-of-the-box
- simply add the dependency to your POM file
- REST endpoints are automatically added to your application. All Actuator endpoints starts with `/actuator` prefix

### Health endpoint
- `/health` checks the status of your application
- Normally used by monitoring apps to see if your app is up or down

### Info endpoint
- `/info` endpoint is not by default exposed, we need to specify that in the application.properties file
- other properties starts with `info` in the application.properties file will be displayed 

### Other endpoints
- `/auditevents` audit events for your application
- `/beans` list of all beans registered in the Spring application context
- `/mappings` list of all @RequestMapping paths