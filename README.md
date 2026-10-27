# SafeRoute — Campus Emergency Response Simulator

## Project Overview

SafeRoute is a beginner-friendly Java console application developed as an Object-Oriented Programming (OOPS) micro project. It simulates a campus emergency reporting system for medical, fire, and security incidents.

The application collects incident details, assigns a simulated priority level, and displays a suggested response action based on the emergency type.

## Problem Statement

Campus emergencies require different response procedures depending on the nature of the incident. SafeRoute provides a simple way to categorize emergency reports and suggest appropriate response actions while demonstrating the practical application of inheritance in Java.

## Objectives

- Demonstrate inheritance in Java.
- Reuse common fields and methods through a parent class.
- Represent different emergency types using child classes.
- Accept and validate user input.
- Generate and display emergency reports.

## OOPS Concept Used

**Inheritance**

The project uses a parent class named `Emergency` and three child classes:

- `MedicalEmergency`
- `FireEmergency`
- `SecurityEmergency`

Each child class inherits common attributes and methods from the parent class and provides its own emergency type, priority, and response action.

The project also demonstrates abstract classes, method overriding, and runtime polymorphism.

## Technologies Used

- Java
- Java Development Kit (JDK)
- Visual Studio Code
- Git and GitHub

## Features

- Report medical emergencies.
- Report fire emergencies.
- Report security emergencies.
- Enter incident location and description.
- Display emergency priority and suggested actions.
- View all reports created during the current session.
- Validate invalid menu selections and empty fields.

## Project Structure

```text
SafeRoute/
├── SafeRoute.java
└── README.md
```

## How to Run

### Prerequisites

Install a Java Development Kit (JDK) and ensure that `java` and `javac` are available in your terminal.

### Steps

1. Clone or download this repository.
2. Open the project folder in Visual Studio Code or a terminal.
3. Compile the Java program:

   ```bash
   javac SafeRoute.java
   ```

4. Run the application:

   ```bash
   java SafeRoute
   ```

5. Follow the console menu to report emergencies and view reports.

## Sample Output

```text
===== SAFEROUTE =====
1. Report an Emergency
2. View All Reports
3. Exit
Enter your choice: 1

Select Emergency Type:
1. Medical
2. Fire
3. Security
Enter type: 2

Enter location: Campus Laboratory
Enter description: Smoke detected

Report submitted successfully!

----- EMERGENCY REPORT -----
Report ID: 1
Type: Fire Emergency
Location: Campus Laboratory
Description: Smoke detected
Priority: CRITICAL
Suggested Action: Raise the alarm, evacuate safely, and contact the fire service.
```

## Testing

The application can be tested with the following scenarios:

| Test Case | Expected Result |
|---|---|
| Report a medical emergency | Medical report with HIGH priority |
| Report a fire emergency | Fire report with CRITICAL priority |
| Report a security emergency | Security report with HIGH priority |
| View saved reports | All session reports are displayed |
| Enter an invalid menu choice | Error message is displayed |
| Submit empty incident details | Report is rejected |

Record the actual results after running these tests.

## Limitations

- Reports are stored only in memory.
- Data is lost when the program exits.
- The application does not send real alerts or contact emergency services.
- Priority levels and response suggestions are predefined for demonstration purposes.

## Future Enhancements

- Add permanent database storage.
- Develop a graphical user interface.
- Add report search and filtering.
- Integrate authorized emergency notifications.

## Conclusion

SafeRoute demonstrates how inheritance can organize related emergency types under a common parent class while allowing each child class to define specialized behavior. The project provides a practical introduction to Java OOPS concepts through a simple campus safety simulation.

## Author

**Kruba Ragav M U**

B.Tech Computer Science and Engineering

## References

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)
- [Java Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Java Abstract Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
