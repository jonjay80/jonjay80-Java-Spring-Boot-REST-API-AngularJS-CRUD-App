# Java-Spring-Boot-REST-API-AngularJS-CRUD-App  

DockerHub links to the images:  

*Note: You need to have a Docker engine running.*

Frontend:  
``` docker pull jonjay80/angular-frontend-spring-boot-rest-api ```  
```docker run -p 80:80 jonjay80/angular-frontend-spring-boot-rest-api```  

Backend:   
``` docker pull jonjay80/java-spring-boot-rest-api ```  
```docker run -p 8080:8080 jonjay80/java-spring-boot-rest-api```  

A demonstration of containerized Java Spring Boot REST API backend using Hibernate, JPA, and H2 with MVC design pattern with Angular CRUD Frontend.


------------------------------------------------------------------------------------------------------------------------

If you want to run locally, just clone repo and run the following commands:

While in the restcrud directory: 
``` mvn spring-boot:run ```

While in the angular directory: 
``` npm start ```


In the browser:
``` localhost:4200 ```
