📘 Spring Boot Course API
A simple RESTful API built with Spring Boot that allows you to retrieve course data using filters like status, title, ID, and code.

🔗 Base URL
bash
Copy
Edit
http://localhost:8080/api/v1/courses
📌 Endpoints
1. ✅ Get All Courses by Status
Request:

bash
Copy
Edit
GET /api/v1/courses?status=false
Response:

json
Copy
Edit
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
Request:

bash
Copy
Edit
GET /api/v1/courses/title?status=true&title=spring
Response:

json
Copy
Edit
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
Request:

bash
Copy
Edit
GET /api/v1/courses/id/939541e4-261b-489f-a063-5a8c6e72ff21
Response:

json
Copy
Edit
{
  "id": "939541e4-261b-489f-a063-5a8c6e72ff21",
  "code": "ISTAD-002",
  "title": "Next js",
  "price": 200,
  "status": false
}
4. 🔤 Get Course by Code
Request:

bash
Copy
Edit
GET /api/v1/courses/code/ISTAD-001
Response:

json
Copy
Edit
{
  "id": "5053f6ee-c472-4592-aeaf-b87601f70429",
  "code": "ISTAD-001",
  "title": "Spring Framework",
  "price": 100,
  "status": true
}
Let me know if you’d like me to convert this into a Markdown file, Swagger/OpenAPI format, or Postman collection for testing!
