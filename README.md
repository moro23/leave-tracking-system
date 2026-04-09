# Leave Tracking System

A Java-based employee leave management application built using object-oriented programming principles. Developed as part of the **IBM Java Developer Professional Certificate** program.

## Overview

The Leave Tracking System is a console-based application that enables organizations to manage employee time-off requests efficiently. It demonstrates core Java OOP concepts through a real-world business use case.

### Key Features

- **Employee Management** – Create and manage employee profiles with leave balances
- **Leave Request Workflow** – Submit, approve, deny, and cancel leave requests
- **Multiple Leave Types** – Support for vacation, sick leave, personal days, and more
- **Balance Tracking** – Automatic leave balance calculation and validation
- **Data Persistence** – Save and load leave data using file I/O
- **Date Handling** – Leave period calculations with Java date/time API
- **Reporting** – Generate team availability and leave usage reports

## Tech Stack

- **Language:** Java 17+
- **Build Tool:** javac / IDE of choice
- **Paradigm:** Object-Oriented Programming
- **Architecture:** Layered (Model – Service – Application)

## Project Structure

```
leave-tracking-system/
├── src/
│   └── com/
│       └── leavetracker/
│           ├── model/          # Data classes (Employee, LeaveRequest, LeaveType)
│           ├── service/        # Business logic (LeaveService, ReportService)
│           └── app/            # Application entry point (Main)
├── data/                       # Persistent data files (generated at runtime)
├── .gitignore
└── README.md
```

## Modules & Learning Path

This project is developed incrementally across six modules:

| Module | Focus Area | Concepts Covered |
|--------|-----------|-----------------|
| 1 | Basic Classes | Classes, objects, constructors, encapsulation |
| 2 | Inheritance & Polymorphism | Extending leave types, method overriding, abstract classes |
| 3 | Collections | ArrayList, HashMap, managing multiple requests |
| 4 | File I/O | Reading/writing leave data to files |
| 5 | Date Handling | Java Date/Time API, leave period calculations |
| 6 | Full Application | Integrating all components into a working system |

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Git

### Installation

```bash
git clone https://github.com/<your-username>/leave-tracking-system.git
cd leave-tracking-system
```

### Compile & Run

```bash
javac -d out src/com/leavetracker/**/*.java
java -cp out com.leavetracker.app.Main
```

## Usage

Once running, the system presents a menu-driven interface:

```
========================================
   LEAVE TRACKING SYSTEM
========================================
1. Submit Leave Request
2. Check Leave Balance
3. View Request Status
4. Cancel Pending Request
5. Review Requests (Manager)
6. Generate Reports (Manager)
7. Exit
========================================
```

## Development Progress

- [x] Module 1 – Basic Classes (Employee, LeaveRequest)
- [ ] Module 2 – Inheritance & Polymorphism
- [ ] Module 3 – Java Collections
- [ ] Module 4 – File I/O
- [ ] Module 5 – Date Handling
- [ ] Module 6 – Complete Application

## What I Learned

*This section will be updated as I progress through each module.*

- **Module 1:** Classes, constructors, getters/setters, encapsulation, access modifiers

## Author

Built as part of the [IBM Java Developer Professional Certificate](https://www.coursera.org/professional-certificates/ibm-java-developer) program.

## License

This project is for educational purposes as part of the IBM Java Developer certification coursework.
