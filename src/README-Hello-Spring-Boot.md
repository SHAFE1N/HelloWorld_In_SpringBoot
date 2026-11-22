# Hello Spring Boot

**Student Name:** Shahrier Mokammel  
**Student ID:** IT24050  
**Project:** Hello World in Spring Boot

Java · Spring Boot 3.5.0 · Maven · IntelliJ IDEA

---

## 01. Project Overview

This project is a simple **Hello World** web application developed using Spring Boot. It demonstrates how to initialize a Spring Boot application, start an embedded web server, and return a text response in a browser.

When the application starts, it prints `Hello, World!` in the console. It also exposes a web endpoint at `/` that returns the same message.

## 02. Objectives

- Create and run a Spring Boot application.
- Understand the role of the main application class.
- Create a REST endpoint using `@RestController` and `@GetMapping`.
- Run the application locally with Maven and IntelliJ IDEA.

## 03. Technologies Used

| Technology | Version / Purpose |
|---|---|
| Java | 17 |
| Spring Boot | 3.5.0 |
| Maven | Project build and dependency management |
| Spring Web | HTTP endpoint and embedded web server |
| IntelliJ IDEA | Development environment |
| JUnit / Spring Boot Test | Application context test |

## 04. Project Structure

```text
hello-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/hello/
│   │   │   ├── HelloSpringbootApplication.java
│   │   │   └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/hello/
│           └── HelloSpringbootApplicationTests.java
├── pom.xml
└── README.md
```

## 05. Source Code

### `HelloSpringbootApplication.java`

This is the main entry point. `@SpringBootApplication` enables Spring Boot configuration and component scanning. The `main` method starts the application. The `CommandLineRunner` prints a greeting to the console after startup.

```java
package com.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
    }

    @Bean
    CommandLineRunner printHello() {
        return args -> System.out.println("Hello, World!");
    }
}
```

### `HelloController.java`

This controller handles HTTP GET requests sent to `/`. It returns the text `Hello, World!` as the HTTP response.

```java
package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
```

### `application.properties`

```properties
spring.application.name=hello-springboot
server.port=8080
```

The configuration sets the application name and tells the embedded server to use port `8080`.

## 06. Run the Application

### Requirements

- JDK 17 or later
- IntelliJ IDEA
- Maven

### Run using IntelliJ IDEA

1. Extract the project ZIP file.
2. Open the project folder in IntelliJ IDEA.
3. Allow IntelliJ IDEA to import the Maven project and download dependencies.
4. Open `HelloSpringbootApplication.java`.
5. Run the `main` method.

### Run using the terminal

From the project root (the folder containing `pom.xml`), run:

```bash
mvn spring-boot:run
```

To build the project:

```bash
mvn clean package
```

## 07. Application Screenshots

### IntelliJ IDEA — Application Execution

![IntelliJ IDEA output](<Output/Screenshot 2026-11-22 103722.png>)

### Browser — Spring Boot Localhost Output

![Spring Boot localhost 8080 output](<Output/WhatsApp Image 2026-11-22 at 10.47.38 AM.jpeg>)

> These images are loaded directly from the existing `Output` folder in this GitHub repository.

## 08. Test

The project includes `HelloSpringbootApplicationTests`, which checks that the Spring application context loads successfully.

Run the tests with:

```bash
mvn test
```

---

**Submitted by:** Shahrier Mokammel  
**Student ID:** IT24050
