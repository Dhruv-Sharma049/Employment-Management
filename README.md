# Manager-Intern System

## Overview
This project is a Java-based employee management system that allows managers to oversee interns, assign tasks, track progress, and manage salaries. It includes implementations for:
- **Manager**: Assigns tasks, manages projects, and provides feedback.
- **SDE Intern**: Software development intern who receives tasks and reports progress.
- **Cloud Intern**: Cloud-based intern handling cloud-specific tasks.
- **GlobalData**: Singleton class to track and manage interns.

## Features
- Managers can assign tasks and provide feedback to interns.
- Interns can complete tasks and request feedback.
- Secure PIN-based salary viewing for interns.
- Singleton pattern used for managing global data.
- Exception handling for robustness.

## Object-Oriented Programming (OOP) Concepts Used
This project effectively utilizes OOP principles, including:
- **Encapsulation**: Data members are kept private and accessed through getter and setter methods.
- **Abstraction**: Interfaces like `Employee` and `Intern` define common behaviors for different types of employees.
- **Inheritance**: `SDE_intern` and `Cloud_intern` inherit from the `Intern` interface to ensure consistency.
- **Polymorphism**: Methods are overridden to provide specific implementations for different intern types.
- **Singleton Pattern**: The `GlobalData` class ensures a single instance is used for managing all interns.

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo.git
   ```
2. Navigate to the project directory:
   ```sh
   cd your-repo
   ```
3. Compile the Java files:
   ```sh
   javac -d bin src/employment/*.java
   ```
4. Run the program:
   ```sh
   java -cp bin employment.Main
   ```

## Usage
1. Create a manager and interns.
2. Assign interns to a manager.
3. Assign work and track progress.
4. Handle salary increments and feedback.

## Contributing
Contributions are welcome! Follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-branch
   ```
3. Commit your changes:
   ```sh
   git commit -m "Add new feature"
   ```
4. Push to your fork:
   ```sh
   git push origin feature-branch
   ```
5. Open a Pull Request.



