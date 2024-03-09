# Library Management Web Application

### Overview

> Our CSET109 project is officially wrapped up! I teamed up with [name], we’ve nailed it using a mix of Java technologies like swing, jsp, Struts, etc. The project's good to go, and we’re eager to show it off.
> 
> **The Library Management Web Application** is a Java-based project that provides a comprehensive solution for managing book inventories in a library setting. The application incorporates various technologies such as Java, Spring Boot, Hibernate, and Spring Security to create a robust and secure system.

#
## - Technologies Used:
    * Java: Core language for application development.
    * Swing: For the desktop application part.
    * Servlet: Handles HTTP requests and responses.
    * JDBC: Manages database connectivity.
    * JSP (JavaServer Pages): To create dynamic web pages.
    * Struts: Framework for developing Java web applications.
    * Hibernate: ORM (Object-Relational Mapping) for database interaction.
    * Spring: For dependency injection and broader application architecture.
    * Spring Boot: Simplifies the development of Spring applications.

## - Project Structure:
```
LibraryManagement
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── config
│   │   │   │   └── WebSecurityConfig.java
│   │   │   ├── controller
│   │   │   │   └── BookController.java
│   │   │   ├── dao
│   │   │   │   └── BookDAO.java
│   │   │   ├── model
│   │   │   │   └── Book.java
│   │   │   ├── service
│   │   │   │   ├── BookService.java
│   │   │   │   └── impl
│   │   │   │       └── BookServiceImpl.java
│   │   │   ├── swing
│   │   │   │   └── SwingLibraryApp.java
│   │   │   └── LibraryApplication.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── templates
│   │   │       ├── books.jsp
│   │   │       └── addBook.jsp
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── views
│   │       │       ├── books.jsp
│   │       │       └── addBook.jsp
└── target

```
#
### Dependencies:

* Spring Boot Starter Web
* Spring Boot Starter Data JPA
* Hibernate Core
* MySQL Connector Java

#
## Project Overview:

### 1. Purpose:

The Library Management Web Application is designed to assist librarians and library staff in managing the inventory of books in a library.

### 2. Key Components:

Model (model.Book):
* Represents the data structure of a book with attributes such as title, author, and an automatically generated ID.
* Utilizes Hibernate annotations for ORM (Object-Relational Mapping).

DAO (dao.BookDAO):
* Provides Data Access Object interfaces for book-related operations.
* Implements methods for CRUD operations (Create, Read, Update, Delete) using Hibernate for database interaction.

Service (service.BookService):
* Defines service interfaces for managing books.
* Implements business logic for book-related operations, serving as an intermediary between the controller and DAO.

Controller (controller.BookController):
* Handles HTTP requests and manages the flow of the application.
* Utilizes Spring annotations for request mapping and dependency injection.
* Coordinates with the service layer to perform book-related actions.

Configuration (config.WebConfig):
* Configures various settings for the application.
* In the case of WebSecurityConfig, provides security configurations using Spring Security, allowing for authentication and authorization.

Application Entry Point (LibraryApplication):
* Contains the main method to launch the Spring Boot application.

Views (templates/books.jsp, templates/addBook.jsp):
* JSP templates for rendering HTML views.
* Display book information and forms for adding new books.

Resources (application.properties):
* Configuration file for database and other application settings.
* Includes database connection details and Hibernate properties.

### 3. Technologies Used:



- Java:
Core programming language for application development.

- Spring Boot:
Simplifies the development of Spring applications.
Provides features like auto-configuration and embedded web server.

- Hibernate:
ORM framework for mapping Java objects to database entities.
Manages database interactions in a Java-friendly way.

- Spring Security:
Provides authentication and authorization mechanisms for securing the application.

- JSP (JavaServer Pages):
Technology for creating dynamic web pages using Java.

- MySQL:
Database management system for storing book information.

### 4. Flow of the Application:
The application starts with the LibraryApplication class, which serves as the entry point.
Spring Boot auto-configures the application and launches the embedded web server.
The BookController handles incoming HTTP requests and interacts with the BookService.
The BookService contains the business logic and communicates with the BookDAO for database operations.
Views are rendered using JSP templates (books.jsp and addBook.jsp), allowing users to view, add, edit, and delete books.
Spring Security in WebSecurityConfig ensures that certain URLs require authentication before access.

#

### How to Use:
#### 1- Clone the repository:
```
git clone https://github.com/your-username/LibraryManagement.git
cd LibraryManagement
```

#### 2- Configure the database connection:

Open src/main/resources/application.properties.
Update the database connection details as per your MySQL setup.

#### 3- Run the application:

Execute the LibraryApplication class.
Access the application at http://localhost:8080.

#### 4- Access the application:

Open a web browser and navigate to http://localhost:8080.
Explore the functionality to view, add, edit, and delete books.

#

### Additional Considerations:
Ensure that you have Java and Maven installed on your system.
This project assumes a MySQL database. Adjust the application.properties file if using a different database.
Customize the project structure or add additional features based on your specific requirements.

#

### Conclusion:
The Library Management Web Application is a comprehensive project that integrates various Java technologies to create a functional and secure system for managing a library's book inventory. From data modeling with Hibernate to web development with Spring Boot and Spring Security, the project covers a range of aspects crucial for building robust Java web applications.

## Authors:

- [Aditi Singh](https://github.com/Aditi-Singh-15)

## License:
- This project is licensed under the [MIT License](LICENSE).
