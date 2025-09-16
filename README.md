[![CI • Tests (Maven)](https://github.com/jcheron/e-commerce/actions/workflows/ci-tests.yml/badge.svg)](https://github.com/jcheron/e-commerce/actions/workflows/ci-tests.yml)

### E-commerce api with Spring Boot
This is a simple e-commerce API built using Spring Boot. It provides basic functionalities for managing products, categories, and orders.

### Features
- CRUD operations for products and categories
- Order management
- Basic authentication and authorization
- RESTful API design
- Integration with a relational database (e.g., MySQL, PostgreSQL)
- Unit and integration tests
- API documentation using Swagger
- Docker support for easy deployment
- Pagination and sorting for product listings
- Error handling and validation
- Logging and monitoring
- Sample data initialization
- CORS support for frontend integration
- Environment-specific configurations

### Technologies Used
- Spring Boot
- Spring Data JPA
- Spring Security
- Hibernate
- Maven
- MySQL/PostgreSQL
- Swagger
- JUnit
- Docker

### Getting Started
#### Prerequisites
- Java 17 or higher
- Maven
- MySQL/PostgreSQL
- Docker (optional)
- Git
- IDE (e.g., IntelliJ, Eclipse)
- Postman (for API testing)
- cURL (for command-line API testing)
- GitHub CLI (for repository management)

#### Installation
1. Clone the repository:
   ```bash
   git clone
    cd e-commerce
    ```
2. Configure the database connection in `application.properties` or `application.yml`.
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
    mvn spring-boot:run
    ```
5. Access the API at `http://localhost:8080`.
6. Access Swagger UI at `http://localhost:8080/swagger-ui.html`.
7. (Optional) Run the application using Docker:
   ```bash
   docker build -t e-commerce .
   docker run -p 8080:8080 e-commerce
   ```
### Usage
- Use Postman or cURL to interact with the API endpoints.
- Refer to the Swagger documentation for available endpoints and request/response formats.
- Use the provided sample data for testing purposes.
