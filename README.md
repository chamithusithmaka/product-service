# Product Service Microservice

## SLIIT | Department of Computer Science & Software Engineering
Faculty of Computing  
Module: Current Trends in Software Engineering (SE4010) | 2025 | Semester 1  
DevOps Lab – 3

---

## Objective
Create a simple RESTful microservice using Spring Boot, with in-memory H2 database and Swagger (OpenAPI) documentation.

---

## Project Setup

1. **Spring Initializr**: https://start.spring.io
2. **Project**: Maven | **Language**: Java | **Packaging**: Jar
3. **Group**: `com.sliit` | **Artifact**: `product-service`
4. **Dependencies**:
   - Spring Web
   - Spring Data JPA
   - H2 Database
   - Springdoc OpenAPI UI

---

## Features

- Product microservice with CRUD REST endpoints
- In-memory H2 database for runtime persistence
- Swagger UI for API documentation and testing

---

## How to Run

1. **Clone the repository**
2. **Build the project**:
   ```bash
   mvn clean install
   ```
3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
4. **Access the application**:
   - Home: [http://localhost:8080/](http://localhost:8080/)
   - H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## REST API Endpoints

- **POST /products**: Create a new product
- **GET /products**: Get all products
- **GET /products/{id}**: Get product by ID
- **DELETE /products/{id}**: Delete product by ID

### Example Product JSON
```json
{
  "name": "Rice",
  "price": 240
}
```

---

## H2 Database
- In-memory database, data resets on restart
- Access H2 console at `/h2-console`
- Default JDBC URL: `jdbc:h2:mem:productdb`

---

## Swagger (OpenAPI)
- API documentation and testing at `/swagger-ui/index.html`

---

## Submission
Upload your entire project to GitHub and submit the repository link in a `.txt` file named with your IT number.

---

## Author
- [Your Name / IT Number]
