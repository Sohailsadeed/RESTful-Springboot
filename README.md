# 🎓 Spring Boot Student Management REST API

A **Spring Boot RESTful API** that performs CRUD operations on a `Student` entity.  
This project demonstrates layered architecture and backend development fundamentals using Spring Boot.

---

## 🚀 Project Overview

This application allows clients to:

- ➕ Add new students  
- 📋 Retrieve all students  
- 🔍 Get student details by ID  
- ✏️ Update student information  
- ❌ Delete student records  

The project follows a clean **Controller → Service → DAO** architecture.

---

## 🛠 Tech Stack

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Maven (Maven Wrapper included)  
- MySQL (or any relational database)  
- Postman (for API testing)

---

## 🏗 Project Structure

```
src/main/java/com.practice.main/
│
├── controllers     → Handles HTTP requests
├── services        → Contains business logic
├── dao             → Repository layer (database interaction)
├── beans           → Entity class (Student)
```

This layered architecture improves maintainability and separation of concerns.

---

## 📌 API Endpoints

### 🔹 1️⃣ Add Student

**POST** `/student`

Request Body:

```json
{
  "id": 1,
  "name": "Sohail",
  "gender": "Male",
  "city": "Hyderabad"
}
```

Returns the saved student object.

---

### 🔹 2️⃣ Get All Students

**GET** `/student`

Returns a list of all students.

---

### 🔹 3️⃣ Get Student By ID

**GET** `/student/{id}`

Example:
```
GET /student/1
```

Returns student details.

---

### 🔹 4️⃣ Update Student

**PUT** `/student`

Request Body:

```json
{
  "id": 1,
  "name": "Sohail Ahmed",
  "gender": "Male",
  "city": "Hyderabad"
}
```

Returns updated student object.

---

### 🔹 5️⃣ Delete Student

**DELETE** `/student/{id}`

Example:
```
DELETE /student/1
```

Returns `true` if deletion is successful.

---

## ▶ How to Run the Project

### Option 1: Using Maven Wrapper (Recommended)

Windows:
```
mvnw.cmd spring-boot:run
```

Linux / Mac:
```
./mvnw spring-boot:run
```

### Option 2: Using IDE
- Import as Maven project
- Run as Spring Boot Application

---

## 🧠 Key Concepts Practiced

- RESTful API development
- HTTP methods (GET, POST, PUT, DELETE)
- Path Variables
- Request Body handling
- Layered architecture
- Spring Data JPA usage
- Optional handling in service layer
- Basic exception handling

---

## 📈 Future Improvements

- Add validation using `@Valid`
- Implement Global Exception Handling
- Use `ResponseEntity` for better HTTP responses
- Add pagination & sorting
- Implement DTO pattern
- Secure endpoints using Spring Security

---

## 🎯 Purpose

This project was built to:

- Strengthen backend fundamentals
- Practice database-driven REST API development
- Understand layered architecture in Spring Boot
- Prepare for backend interviews and placements
