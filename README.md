# Assistant Manager Backend Application

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen?style=flat-square&logo=spring-boot)
![Java](https://img.shields.io/badge/Java-17-blue?style=flat-square&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0.23-blue?style=flat-square&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-3.6.3-blue?style=flat-square&logo=apache-maven)

## Overview

This is a backend application developed using Java and Spring Boot, with MySQL as the database. The application provides CRUD operations for managing assistant records.

## Technology Stack

- **Programming Language**: Java 17 ![Java](https://img.shields.io/badge/Java-17-blue?style=flat-square&logo=java) 💻
- **Framework**: Spring Boot 3.2.5 ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen?style=flat-square&logo=spring-boot) 🌱
- **Database**: MySQL ![MySQL](https://img.shields.io/badge/MySQL-8.0.23-blue?style=flat-square&logo=mysql) 🗄️
- **Build Tool**: Maven ![Maven](https://img.shields.io/badge/Maven-3.6.3-blue?style=flat-square&logo=apache-maven) 🛠️
- **Tools**: Postman for API testing ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat-square&logo=postman) 📬, OBS Studio for demo recording ![OBS Studio](https://img.shields.io/badge/OBS%20Studio-302E31?style=flat-square&logo=obs) 🎥

## Features

- Create a new assistant ➕
- Retrieve details of an assistant by ID 🔍
- Update the salary and calculate in-hand salary for an assistant 💸
- List all assistants 📋
- Delete an assistant record 🗑️

## Getting Started

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/dishank-agarwal/assistant-manager.git
    cd assistant-manager
    ```

2. **Configure the database**:
   - Create a MySQL database named `assistant`.
   - Update the database configuration in `src/main/resources/application.properties` with the following properties:
     - `spring.datasource.url=jdbc:mysql://localhost:3306/assistant`
     - `spring.datasource.username=yourusername`
     - `spring.datasource.password=yourpassword`
     - `spring.jpa.hibernate.ddl-auto=update`

3. **Build and run the application**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

   The application will start on `http://localhost:8080`.

### Dependencies

The project uses the following dependencies:

1. **Spring Boot Starter Data JPA**: For using JPA to interact with the database.
2. **Spring Boot Starter Web**: For building web, including RESTful, applications using Spring MVC.
3. **MySQL Connector/J**: JDBC driver for MySQL.
4. **Lombok**: For reducing boilerplate code for model objects.
5. **Spring Boot Starter Test**: For testing Spring Boot applications.

## API Endpoints

### Create a new Assistant

- **URL**: `/api/assistants`
- **Method**: `POST`
  
![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/e950f25b-cf28-42a2-b109-018d46c85eda)

### Get Assistant by ID

- **URL**: `/api/assistants/{id}`
- **Method**: `GET`

![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/4304dbb7-2ce6-46e1-b648-fc0609d7bc9e)

### Apply Salary Hike

- **URL**: `/api/assistants/{id}/hike`
- **Method**: `PUT`

![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/1e5eb295-6a12-417e-95ce-5c8c5ae44128)

### Calculate In-Hand Salary

- **URL**: `/api/assistants/{id}/inHandSalary`
- **Method**: `PUT`

![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/28f8f8a4-1cfc-4e97-bd53-0d426df3da63)

### Get All Assistants

- **URL**: `/api/assistants`
- **Method**: `GET`

![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/1fc99d3f-c998-49ca-bab0-4f5646326ea1)

### Delete Assistants

- **URL**: `/api/assistants/{id}`
- **Method**: `Delete`

![image](https://github.com/dishank-agarwal/assistant-manager/assets/121570212/998ee803-ba98-458d-b9a2-9b6e9627e53e)


## Postman Collection

A Postman collection is included in the repository to facilitate testing of the API endpoints.

### Import the collection:

1. Open Postman and click on **Import**.
2. Select the `AssistantManager.postman_collection.json` file from the repository.
3. The collection will appear in your Postman workspace.

### Use the collection:

The collection contains requests for all the API endpoints. You can test each endpoint by clicking on the request and hitting the **Send** button.

## Demo Video

A demo video showcasing the functionality of the backend application is available at https://drive.google.com/file/d/1P4pDPQvH7N9gl-TD7seJJS63-q8LxALV/view?usp=sharing. 🎥

## Contributing

If you wish to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
