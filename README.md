# Zoo Management System

This Java application, named "Zoo Management," is designed to help manage a zoo by allowing users to create a zoo, add animals to it, remove animals, and perform various operations related to the zoo.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [How to Use](#how-to-use)
- [Features](#features)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Zoo Management System is a simple Java application that provides functionality for creating and managing zoos. The system consists of three primary classes: `ZooManagement`, `Zoo`, and `Animal`. These classes interact to create, populate, and manage a zoo.

## Prerequisites

To run this application, you need to have the following installed on your system:

- Java Development Kit (JDK)

## How to Use

To run the Zoo Management application, follow these steps:

1. Clone this repository to your local machine.

2. Open a terminal or command prompt and navigate to the root folder of the project.

3. Compile the Java source files using the following command:

   ```bash
   javac -d bin src/tn/esprit/gestionzoo/main/ZooManagement.java
   ```
4. Run the application with the following command:
   ```bash
   java -cp bin tn.esprit.gestionzoo.main.ZooManagement
   ```
5. Follow the on-screen instructions to interact with the Zoo Management System.

## Features

The Zoo Management System is a Java application that offers the following features:

### 1. Create a Zoo

- **Description**: Create a new zoo with a name, location, and a specified number of cages.
- **Usage**: Initialize your zoo and set its properties, such as name, location, and cage capacity.

### 2. Add Animals

- **Description**: Add animals to your zoo.
- **Usage**: Populate your zoo with various animals, specifying their family, name, age, and whether they are mammals.

### 3. Display Zoo Information

- **Description**: View detailed information about your zoo.
- **Usage**: Retrieve and display information such as the zoo's name, location, and the number of cages.

### 4. Display Animals

- **Description**: List all the animals currently residing in your zoo.
- **Usage**: Get a comprehensive list of animals along with their details, including family, name, age, and mammal status.

### 5. Search for Animals

- **Description**: Search for a specific animal within your zoo.
- **Usage**: Look up animals by their name and get their details, or find out if a particular animal is present in the zoo.

### 6. Remove Animals

- **Description**: Remove animals from your zoo.
- **Usage**: Remove unwanted animals from the zoo, based on their name, and free up cage space.

### 7. Check Zoo Capacity

- **Description**: Determine if your zoo is at full capacity.
- **Usage**: Check whether the zoo has reached its maximum number of allowed animals based on the cage capacity.

### 8. Compare Zoos

- **Description**: Compare two different zoos to find the one with the most animals.
- **Usage**: Compare the number of animals in two separate zoos and identify the one with a larger animal population.

## Code Structure

The code for the Zoo Management System consists of three main Java classes:

- `ZooManagement.java`: This is the main class containing the `main` method, demonstrating how to interact with the `Zoo` and `Animal` classes.

- `Zoo.java`: The `Zoo` class includes methods and attributes for managing the zoo, allowing for operations like adding, searching, and removing animals.

- `Animal.java`: The `Animal` class represents individual animals, featuring properties such as family, name, age, and mammal status.

## Contributing

Contributions to this project are welcomed and encouraged. If you'd like to contribute, please follow these guidelines:

1. Fork the repository to your GitHub account.
2. Clone the repository to your local machine.
3. Create a new branch for your feature or bug fix: `git checkout -b feature/your-feature-name` or `bugfix/issue-name`.
4. Make your changes and ensure the code is well-documented.
5. Test your changes to ensure they work as expected.
6. Commit your changes: `git commit -m "Your descriptive commit message"`.
7. Push your changes to your fork: `git push origin feature/your-feature-name`.
8. Create a pull request to the original repository with a clear description of your changes.

Please note that by contributing to this project, you agree to make your contributions available under the project's license.

## License

This project is licensed under the MIT License. You can find the full text of the license in the [LICENSE](LICENSE) file in this repository.


