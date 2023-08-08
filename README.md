<h1 align = "center"> TASK-TRACKER-API </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java-17-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.2-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>
   
The Task Tracker API is a production-quality RESTful API built using Java and Spring Boot. It allows users to perform CRUD (Create, Read, Update, Delete) operations on tasks, backed by a PostgreSQL database. The API provides comprehensive error handling, data validation, and logging mechanisms.
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* PostgreSQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a PostgreSQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/tasks
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Task Model
```
Id : integer
title : string
description : string
date : localdate
```

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:
* Task Controller
```
-   `POST /tasks`: Create a new task.
-   `GET /tasks/{id}`: Retrieve a task by its ID.
-   `GET /tasks`: Retrieve a list of all tasks.
-   `PUT /tasks/{id}`: Update an existing task by its ID.
-   `DELETE /tasks/{id}`: Delete a task by its ID.
```

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

Error Handling
--------------

The API includes robust error handling with appropriate HTTP status codes and response messages for scenarios such as invalid input data, database errors, and unexpected situations.

Logging
-------

The API uses SLF4J with Logback for logging. Important events, errors, and other relevant information are logged for monitoring and troubleshooting.

## Project Summary

The Task Tracker API is a production-quality RESTful web service built using Java and Spring Boot. It provides users with the ability to manage tasks using CRUD (Create, Read, Update, Delete) operations. The API is backed by a PostgreSQL database for data storage and retrieval.

Key Features:

Create, read, update, and delete tasks with unique identifiers, titles, descriptions, and due dates.
Comprehensive error handling and validation to ensure data integrity.
Utilizes Spring Boot for rapid development and easy configuration.
Uses SLF4J with Logback for logging and capturing important events.
Employs Flyway for managing database schema changes and version control.
Designed with a clean and modular codebase following best practices for Java development.
Developers can easily set up the Task Tracker API, manage tasks, and integrate it into their applications. The API's combination of functionality, error handling, logging, and testing aims to provide a reliable solution for task management needs.




