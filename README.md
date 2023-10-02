# Project Name

This project is a Java application that includes a Spring Boot service for managing data entities, a batch job for importing data from CSV to a database, and a controller for searching data entities based on various criteria.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Usage](#usage)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

This Java project aims to provide functionality for managing and searching data entities. It includes the following components:

- **DataEntity**: A model class representing data entities with various attributes.
- **DataService**: A service interface and its implementation (`DataServiceImple`) for persisting and searching data entities.
- **JobController**: A controller for launching a batch job to import data from CSV to the database.
- **InvestigationController**: A new controller for searching data entities based on start year, end year, city, and topic.

## Prerequisites

Before you can run this project, ensure you have the following prerequisites:

- Java JDK 8 or higher
- MySQL database
- Spring Boot

## Getting Started

To get started with this project, follow the steps below:

### Installation


## Usage

To use this Java project, follow the steps below:

1. **Installation**:

    - Clone the repository:

      ```bash
      git clone https://github.com/Amanastel/VisualizationDashboard.git
      cd VisualizationDashboard
      ```

    - Build the project:

      ```bash
      mvn clean install
      ```

2. **Running the Application**:

    - Launch the Spring Boot application by executing the following command:

      ```bash
      java -jar <project_jar_file>.jar
      ```

3. **Using the Application**:

    - After starting the application, you can interact with it based on your requirements.

    - For data entity management, you can utilize the `DataService` and related components.

    - To import data from CSV to the database, you can use the `JobController`.

    - For searching data entities based on criteria, access the `InvestigationController` and provide the necessary parameters.

Feel free to explore and utilize the various features of this application as per your needs.

Please replace `<project_jar_file>` with the actual name of your project's JAR file. This "Usage" section provides users with instructions on how to install, run, and utilize your project.

   
## Project Structure

The project is organized as follows:

- `com.blackcoffer.model`: Contains the `DataEntity` class representing data entities.

- `com.blackcoffer.Service`: Includes the `DataService` interface and its implementation (`DataServiceImple`) for data management.

- `com.blackcoffer.controller`: Contains controllers for batch job (`JobController`) and data searching (`InvestigationController`).

- `application.properties`: Configuration file for database connection and Spring Batch.

- `pom.xml`: Maven configuration file specifying project dependencies.

This structure provides a clear organization of your project's components, making it easier for developers to navigate and understand your codebase.


## Technologies Used

The following technologies, libraries, and frameworks are used in this project:

- **Java**: The primary programming language for developing the application.

- **Spring Boot**: A Java-based framework used for building the service and controllers.

- **MySQL**: The database management system used for storing data.

- **Spring Batch**: A framework for processing large volumes of data, utilized for the batch job.

These technologies work together to create a robust Java application for managing and searching data entities.


## Contact

If you have any questions, suggestions, or need assistance with this project, please feel free to reach out to us. You can contact us via the following methods:

- Email: [amankumar.ak0012@gmail.com](mailto:amankumar.ak0012@gmail.com)
- LinkedIn: [Aman Kumar on LinkedIn](https://www.linkedin.com/in/amanastel/)
- GitHub: [Aman Kumar on GitHub](https://github.com/amanastel)

We welcome feedback and contributions from the community and are happy to assist you with any inquiries related to this project.
