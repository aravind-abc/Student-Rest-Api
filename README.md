# Student REST API

A beginner-friendly REST API built using Java 21 and Spring Boot.

## Features
- Welcome endpoint
- Get student by ID
- Find student by name
- Create a student using JSON

## Tech Stack
- Java 21
- Spring Boot
- Maven
- REST API
- Postman

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/welcome` | Welcome message |
| GET | `/students/{id}` | Get student ID |
| GET | `/students?name=Aravind` | Find student by name |
| POST | `/students` | Create a student response |

## How to Run

1. Clone the repository.
2. Open the project in VS Code or IntelliJ.
3. Run `StudentApiApplication.java`.
4. Test the endpoints using Postman.

## Note
This is a learning project. Student data is not persisted to a database yet.