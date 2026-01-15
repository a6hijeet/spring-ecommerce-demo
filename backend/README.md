# E-Commerce Backend (Spring Boot)

This is a test / learning project built using Spring Boot 4.0.1 to understand and implement a simple e-commerce backend flow.

The project currently focuses on product management and will be extended in the future to support user authentication, cart management, and persistent databases.

---

## Tech Stack

- Java 21
- Spring Boot 4.0.1
- Spring Web (REST APIs)
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- VS Code Spring Boot Extension Pack
- VS Code Extension Pack for Java

---

## Features

- Add product
- Update product
- Delete product
- View product(s)
- RESTful API design
- In-memory database using H2
- Hot reload using Spring Boot DevTools

---

## Planned Features

- User authentication and login
- Shopping cart functionality
- Order management
- Role-based access (Admin / User)
- Persistent database (MySQL or PostgreSQL)
- Spring Security integration

---

## Project Structure
```bash
backend/
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/backend/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── BackendApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql (optional)
│   └── test/
├── pom.xml
└── README.md
```
---

## Lombok Usage

This project uses Lombok to reduce boilerplate code.

Common Lombok annotations used in the project:

- @Getter
- @Setter
- @NoArgsConstructor
- @AllArgsConstructor
- @Builder
- @Data

Note:
- Lombok works at compile time through annotation processing
- The application builds and runs correctly using Maven

---

## H2 Database Configuration

The project uses an H2 in-memory database.
Data will be lost when the application restarts.

H2 Console URL:
http://localhost:8080/h2-console

Default configuration used in application.properties:

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

---

## Hot Reload (DevTools)

Spring Boot DevTools is enabled for faster development.

- Automatically restarts the application when code changes
- Works when the application is started via VS Code or Maven

You should see the following log on startup:

Devtools property defaults active

---

## Running the Application

The application is developed and run using **VS Code with the Spring Extension Pack**.

Dependencies are downloaded and managed using Maven through VS Code.

Ways to run the application:

Using VS Code:
- Open the project in VS Code
- Ensure Spring Extension Pack is installed
- Use the Spring Boot Dashboard to start the application
- Or use the Run button provided by the Spring Boot tools

Using terminal:
- Navigate to the backend directory
- Run the following command:

mvn spring-boot:run

Application will start at:

http://localhost:8080

---

## Testing

Testing support is provided using spring-boot-starter-test and JUnit 5.

Run tests using:

mvn test

---

## Notes

- This project is for learning and experimentation
- Not production ready
- Uses in-memory database only

---

## License

This project is created for educational purposes and currently does not have a license.
