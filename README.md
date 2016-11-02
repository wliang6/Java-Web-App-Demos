# Java-Web-App-Demos
Projects for practice.


# Spring MVC Maven Demo
A practice using Spring MVC framework along with Maven to perform a
Hello program.

1. Create Maven Project (war)
2. Create a Server instance using Apache Tomcat 8 to deploy our Spring
MVC app.
3. Build project path to use Tomcat for Server Runtime.
4. Configure Spring dependencies in pom.xml
5. Configure DispatcherServlet in web.xml under WEB-INF dir.
6. Create a dispatcher-servlet.xml under WEB-INF dir for Mapping
Requests.
7. Create HelloController class
8. Add hello.jsp file under /WEB-INF/views
9. Run as -> Tomcat server which deploys the project to an output visit
at http://localhost8080/HelloSpringDemo/. Displays “Hello World”

###/WEB-INF/view/web.xml
Configures DispatcherServlet by indicating servlet-name, servlet-class and its servlet-mapping by url-pattern.
```
  <servlet>
  	<servlet-name>dispatcher</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  <servlet-mapping>
	  <servlet-name>dispatcher</servlet-name>
	  <url-pattern>/</url-pattern>
  </servlet-mapping>
```

###dispatcher-servlet.xml
```
	<context:component-scan base-package = "com.hellospringdemo" /> <!-- scan this package for beans, services, controllers in order to create instances of them-->
	<!-- When app is deployed, request is sent to server. Request points to Controller in root folder,
	finds RequestMapping with the name and go through the method home() -->
	<mvc:annotation-driven /> <!-- declares that the program uses annotations within java classes -->
<!-- Method leads to printing the String "home" and sends to viewResolver. ViewResolver prepends prefix and appends suffix to the String "home". -->
<!-- Scans the files for /WEB-INF/view/home.jsp. System then compiles the jsp file into plain html code to send to browser -->
	<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
		<property name="prefix" value="/WEB-INF/view/"/>
		<property name="suffix" value=".jsp"/>
	</bean>
```

###HomeController.java
```
@Controller //tells the system that this java class is a controller
//Registers this Java class as a Spring bean from dispatcher-servlet.xml
public class HomeController {
	@RequestMapping("/") // '/' is the default root context path
	//A HTTP request points to root context path of the app, it maps to the following function
	public String home() { 
		return "home";
	}
}
```

Resource: http://stacktips.com/tutorials/java/spring/creating-spring-mvc-helloworld-using-maven-in-eclipse-tomcat

#Model View Controller concept graph
![MVC](http://oi63.tinypic.com/2che2h.jpg)

#Spring MVC Framework concept graph
![SpringMVCFramework](http://oi67.tinypic.com/30aq7pt.jpg)
