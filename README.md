# Spring Boot E‑Commerce Demo

A small learning-focused e‑commerce demo application built with **Spring Boot for the backend** and **React for the frontend**.

The goal of this project is to practice **CRUD operations, search functionality, and JPA/JPAQL** usage with an **in‑memory H2 database**, while integrating a **React frontend** *(taken from an existing open-source project)* with a custom backend API.


> **Note:** The frontend was not developed by me. It was taken from an existing GitHub repository and integrated with this backend for learning and practice purposes.

---

## Tech Stack

### Backend (Spring Boot)

- Java 21
- Spring Boot 4.0.1
- Spring Web (REST APIs)
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- VS Code Spring Boot Extension Pack
- VS Code Extension Pack for Java

### Frontend (React)

- React
- Vite
- JavaScript
- npm

---

## Features

### Backend Features

- CRUD operations for products
- Search functionality using JPQL
- RESTful APIs
- In‑memory H2 database for quick setup
- Hot reload using Spring Boot DevTools
- JPA entities and repositories

### Frontend Features

- Product listing
- Search UI
- Create / update / delete products
- Integration with Spring Boot REST APIs

---

## Project Structure
```bash
spring-ecommerce-demo
├──backend/
├────src/
│     ├──main/
│     │   ├──java/com/ecommerce/backend/
│     │   │  ├── controller/
│     │   │  ├── service/
│     │   │  ├── repository/
│     │   │  ├── model/
│     │   │  └── BackendApplication.java
│     │   └──resources/
│     │      ├── application.properties
│     │      └── data.sql (optional)
│     └──test/
├──frontend/
│   ├── public/
│   ├── src/
│   ├── package.json
│   └── vite.config.js
├──pom.xml
└──README.md
```
---

## Lombok Usage

This project uses Lombok to reduce boilerplate code.

Common Lombok annotations used in the project:

- @NoArgsConstructor
- @AllArgsConstructor
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
```bash
spring.datasource.url=jdbc:h2:mem:products
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=ecom
spring.datasource.password=ecom123
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.defer-datasource-initialization=true
```
---

## Hot Reload (DevTools)

Spring Boot DevTools is enabled for faster development.

- Automatically restarts the application when code changes
- Works when the application is started via VS Code or Maven

You should see the following log on startup:
```bash
Devtools property defaults active
```
---

## Running the Application

### Running the Backend (Spring Boot)

The application is developed and run using **VS Code with the Spring Extension Pack**.

Dependencies are downloaded and managed using Maven through VS Code.

Ways to run the application:

#### Using VS Code:
- Open the project in VS Code
- Ensure Spring Extension Pack is installed
- Use the Spring Boot Dashboard to start the application
- Or use the Run button provided by the Spring Boot tools

#### Using terminal:
- Navigate to the backend directory
- Run the following command:
  ```bash 
  mvn spring-boot:run
  ```
Application will start at:

http://localhost:8080

#### H2 Console

Once the backend is running, you can access the H2 console at:

http://localhost:8080/h2-console


### Running the Frontend (React)

The frontend must be started separately.

Steps:
- Open a terminal
- Navigate to the frontend directory:
  ```bash
  cd frontend
  ```
- Install dependencies:
  ```bash
  npm install
  ```
- Start the development server:
  ```bash
  npm run dev
  ```
- The frontend will be available at:

  http://localhost:5173

---

## API Integration

- Frontend communicates with backend APIs exposed on http://localhost:8080
- CRUD and search operations are handled via REST endpoints
- JPQL is used in the backend for search queries

## Learning Objectives

This project was created to practice:
- Spring Boot REST API development
- JPA and JPQL queries
- CRUD operations
- Integrating React with Spring Boot
- Handling CORS and API communication
- Using H2 for fast local development

## Notes

- This project is for learning/demo purposes only
- Uses H2 in-memory database, so data resets on application restart  
- Initial or sample data can be inserted using `data.sql`  
- To ensure `data.sql` runs correctly on startup, keep the following property enabled in `application.properties`:

  `spring.jpa.defer-datasource-initialization=true`
- Frontend code is reused from another repository and adapted for integration testing

---

## License

This project is created for educational purposes and currently does not have a license.
