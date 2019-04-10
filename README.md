## Step 04
- Create a login controller which returns login.jsp (localhost:8080/login)
- Use spring.mvc.view.prefix and suffix to map login controller to a matching jsp.
- jsp files are traditionally stored in /src/main/webapp/WEB-INF/jsp/
- tomcat-embed-jasper artifact is required to enable jsp support in embedded tomcat server

```
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>

```

```
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
logging.level.org.springframework.web: DEBUG

```

- create controller package

