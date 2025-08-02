# Cognizant Java FSE Practice Assignments by Abhinav Rai
# Superset ID : 6366471
# Uni Roll: 2200290120003
# KIET Group of Institutions, Delhi NCR

This repository contains solutions for weekly Java Full Stack Engineer (FSE) hands-on assignments as part of Cognizant’s DN 4.0 program.

# Instructions
- Each week has its own folder.
- Each exercise/topic is organized in a separate subfolder.
- Only `.java` files are required for submission.

## 📝 Week 1 Assignments

| Exercise                   | Description                                                      |
|----------------------------|------------------------------------------------------------------|
| Singleton Pattern          | Implementation of the Singleton design pattern in Java.          |
| Factory Method Pattern     | Demonstrates the Factory Method pattern using notifications.     |
| E-Commerce Search          | Product search functionality with user input using Scanner.      |
| Financial Forecasting      | Sales forecasting using averages from user-entered sales data.   |


## 📝 Week 2 Assignment – PL/SQL, Java TDD & Mockito 

| Exercise                        | File/Class Name / SQL File          | Description                                        |
|----------------------------------|-------------------------------------|----------------------------------------------------|
| PL/SQL Control Structures        | Control_Structures.sql              | Demonstrates use of loops and IF in PL/SQL         |
| PL/SQL Stored Procedure          | Stored_Procedure_Add_Numbers.sql    | Adds two numbers using a PL/SQL stored procedure   |
| JUnit Assertions                 | CalculatorAssertionTest.java        | Basic assertions (`assertEquals`, etc.) in JUnit   |
| Arrange-Act-Assert Pattern       | CalculatorAAATest.java              | Tests structured with the AAA pattern              |
| Parameterized Tests              | CalculatorParamTest.java            | JUnit 5 parameterized tests                        |
| Mockito Mocking/Stubbing         | UserServiceTest.java                | Using Mockito to mock and stub dependencies        |
| Mockito Verifying Interactions   | UserServiceTest.java                | Verifying method calls using Mockito               |

## 📝 Week 3 Assignment – Spring Core and Spring Data JPA

| Exercise                          | File/Class Name                     | Description                                                        |
|-----------------------------------|-------------------------------------|--------------------------------------------------------------------|
| Spring Core Basic App             | App.java, HelloWorld.java           | Console-based Spring app using manual bean creation via annotations |
| Spring Dependency Injection       | AppConfig.java, MessageService.java, UserService.java | Demonstrates constructor-based DI using `@Configuration` and `@Bean` |
| Maven Project Configuration       | pom.xml                             | Configured with `exec-maven-plugin` to run Spring Core classes     |
| Spring Data JPA (Entity & Repo)   | User.java, UserRepository.java      | Created entity and repository for DB operations via Spring Data JPA |
| Spring Boot + REST API            | UserController.java, UserService.java | Exposed REST endpoints for CRUD operations  

## 📝 Week 4 Assignment – Spring REST + Security + JWT

| Exercise                              | File/Class Name                          | Description                                                               |
|---------------------------------------|------------------------------------------|---------------------------------------------------------------------------|
| Hello World REST API                  | HelloController.java                     | Basic `@RestController` with `/hello` endpoint                           |
| Country API (Static Data)            | Country.java, CountryController.java     | Returns country details using REST                                        |
| Get Country by Code                  | CountryController.java                   | REST endpoint: `/country/{code}`                                          |
| Spring Core with XML Configuration   | App.java, beans.xml                      | XML-based Spring context with bean injection                             |
| JWT Login Endpoint                   | AuthController.java, JwtUtil.java        | Authenticates users and returns a JWT using hardcoded credentials         |
| Security Configuration               | SecurityConfig.java                      | Configured Spring Security filters to enable authentication using JWT     |

## 📝 Week 5 Assignment – Microservices with Spring Boot and Spring Cloud

| Exercise                | File/Class Name / Module Name | Description                                                             |
| ----------------------- | ----------------------------- | ----------------------------------------------------------------------- |
| Eureka Discovery Server | `eureka_server`               | Spring Boot project with `@EnableEurekaServer`. Runs on port `8761`.    |
| Account Microservice    | `account_service`             | REST microservice exposing `/account` endpoint. Registers with Eureka.  |
| Loan Microservice       | `loan_service`                | REST microservice exposing `/loan` endpoint. Registers with Eureka.     |
| API Gateway             | `api_gateway`                 | Routes `/account/**` to account service and `/loan/**` to loan service. |



---


## 🚀 How to Run

1. Clone this repository: git clone https://github.com/AbhinavJD7/cognizant-practice.git
2. Navigate to the specific exercise folder.
3. Compile & Run the Java files using:
    javac Main.java    (Here "Main" is the name of java file which is to be compiled)
    java Main
4. All tests should pass if setup correctly.


## Thank You ##