📘 Spring Boot Course API
This is a simple RESTful API built with Spring Boot that allows you to retrieve course data using various filters such as status, title, ID, and code.

🔗 Base URL
The base URL for all API endpoints is:

Bash

http://localhost:8080/api/v1/courses
📌 Endpoints
Here's a breakdown of the available endpoints and how to use them:

1. ✅ Get All Courses by Status
Retrieve a list of courses filtered by their active status.

Request:

Bash

GET /api/v1/courses?status=false
Example Response:

JSON

[
  {
    "id": "939541e4-261b-489f-a063-5a8c6e72ff21",
    "code": "ISTAD-002",
    "title": "Next js",
    "price": 200,
    "status": false
  },
  {
    "id": "31e4bb28-46e4-4350-b7e9-79169fa2ef5c",
    "code": "ISTAD-004",
    "title": "Spring Web MVC",
    "price": 50,
    "status": false
  }
]
2. 🔍 Get Courses by Title and Status
Find courses matching a specific title (case-insensitive) and status.

Request:

Bash

GET /api/v1/courses/title?status=true&title=spring
Example Response:

JSON

[
  {
    "id": "5053f6ee-c472-4592-aeaf-b87601f70429",
    "code": "ISTAD-001",
    "title": "Spring Framework",
    "price": 100,
    "status": true
  },
  {
    "id": "90c7973f-3b14-491f-b318-52ff3118a0a0",
    "code": "ISTAD-003",
    "title": "Spring Boot",
    "price": 23,
    "status": true
  }
]
3. 🆔 Get Course by ID
Get a single course by its unique identifier.

Request:

Bash

GET /api/v1/courses/id/939541e4-261b-489f-a063-5a8c6e72ff21
Example Response:

JSON

{
  "id": "939541e4-261b-489f-a063-5a8c6e72ff21",
  "code": "ISTAD-002",
  "title": "Next js",
  "price": 200,
  "status": false
}
4. 🔤 Get Course by Code
Retrieve a single course by its course code.

Request:

Bash

GET /api/v1/courses/code/ISTAD-001
Example Response:

JSON

{
  "id": "5053f6ee-c472-4592-aeaf-b87601f70429",
  "code": "ISTAD-001",
  "title": "Spring Framework",
  "price": 100,
  "status": true
}
Would you like me to convert this information into a Swagger/OpenAPI format for interactive documentation, or a Postman collection for easy testing?
