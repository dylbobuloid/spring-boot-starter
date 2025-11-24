# spring-boot-starter
The purpose of this repository is to document what I learned and to practice building a small Spring Boot application from scratch


## What I learned

###1. Spring Framework vs Spring Boot
   Spring Framework is a modular toolbox that is used for building Java Applications
     Including:
   - Dependancy injection
   - web MVC
   - Data access (SQL, NoSQL)
   - AOP
   - Security
   - Testing

     On top of that Spring Boot removes the boilerplate providing:
     - Auto configuration
     - Embedded web servers (Tomcat)
     - Starter dependancies
     - A fast way to get projects running quickly
    
###2. Project Setup / Structure
   - Install JDK (v23 used in tutorial)
   - Use IntelliJ IDEA Ultimate to generate a Spring Boot project
   - Understand Maven Wrapper (mvnw)
   - Understand pom.xml and how Spring Boot manages dependency versions
   Navigate folders:
   - src/main/java – Java code
   - src/main/resources – properties, static files
   - application.properties

###3. Spring Boot Starters and Dependency Management
   - How starter dependencies bundle multiple libraries together
     > Spring MVC
     > Jackson(JSON)
     > Tomcat
   - How maven resolves any unknown dependancies
   - Why we often omit version numbers - Springs POM manages compatible versions

###4. Building a basic model view controller (Spring MVC)
    - Learned how spring resolves view names and static resources

###5. RUnning and Debugging the Application
  - Running the application using a maven wrapper
  - Bugging techniques: breakpoints, stepping through code, inspecting variables
  - automatic restart using Spring Boot DevTools

###6. Application Configuration
  - using application.properties
  - Standard and custom configuration values
  - Injecting configuration

###7. Dependency injection and inversion of control
- Understanding tight coupling vs loose coupling
- Using interfaces to reduce coupling
- Constrcutor injection
- Setter injection

###8. IOC container and application context
- Spring Boot automatically creates beans through component scanning
  Retrieving beans using:
  ApplicationContext context = SpringApplication.run(...);
  OrderService orderService = context.getBean(OrderService.class);

###9. Open/Closed Principle
- Classes should be open for extension but closed for modification
- Implemented a PaymentService interface with multiple implementations:
- StripePaymentService
- PayPalPaymentService
- Injected different implementations without changing business logic
