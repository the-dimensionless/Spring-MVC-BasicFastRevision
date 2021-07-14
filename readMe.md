# Fundamentals of Spring MVC (using SpringBoot)

### WAR vs Self Contained JARs
WebServer vs Application Server
Configure a build Application Server (TomCat)

? Change packaging to war from jar ?
<packaging>war</packaging>

-----
for static items, under main > webapp directory

----
### Spring Mvc Configuration

1. pom.xml (like from spring initializer)
2. Configuration (Java, XML, web.xml, Annotations , Combo)
3. Java (Files like controllers, models, etc)
4. View (REST Services, JSPs, thymeleaf)

### Views

####  Traditionally Served from the webapp directory
src > main > webapp > WEB-INF > jsp
Create jsp pages here

#### Setup configuration of Spring boot as
1. Main class MvcApplication extends SpringBootServletInitializer 
to set configurations like in a traditional webapp
(resolve jsp, jstl, etc).
   
2. embedded tomcat in spring boot is packaged like JAR by default (won't resolve JSPs for render). After changing
it's packaging to war in pom.xml, we can setup an external tomcat server and define our
   build configuration like done in traditional java webapps.
   Or conversely, add tomcat-embed-jasper and jstl dependencies in pom.xml
