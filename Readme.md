# spring boot run
mvn spring-boot:run

# with profile
mvn spring-boot:run -Drun.arguments="--spring.profiles.active=dev"

# Link to swagger2
http://localhost:8080/swagger-ui.html#/

# Link to rest - spring boot
http://localhost:8080/rest/user/

# Maven
Deploy to wildfly on localhost:9990

# wildfly deploy
mvnw clean install package wildfly:deploy

# on wildfly localhost deployed
http://localhost:8080/application/rest/user/
http://localhost:8080/application/swagger-ui.html#/

# spring boot to war deployed on wildfly
use SpringBootServletInitializer 
link : http://www.mastertheboss.com/jboss-frameworks/spring/spring-boot-hello-world-on-wildfly