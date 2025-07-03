📘 Spring Boot Course API
This is a simple RESTful API built with Spring Boot that allows you to retrieve course data using various filters such as status, title, ID, and code.

## 🛠 Tech Stack

- **Java 21**
- **Spring Boot**
- **Gradle**

🔗 Base URL
The base URL for all API endpoints is:
http://localhost:8080/api/v1/courses
📌 Endpoints
Here's a breakdown of the available endpoints and how to use them:
- `GET /?status=false`  
  → Get all courses by status

- `GET /title?status=true&title=spring`  
  → Get courses by title and status

- `GET /id/{id}`  
  → Get course by ID

- `GET /code/{code}`  
  → Get course by code

## Example

```json
{
  "id": "5053f6ee-c472-4592-aeaf-b87601f70429",
  "code": "ISTAD-001",
  "title": "Spring Framework",
  "price": 100,
  "status": true
}
