# microservices

# Microservices Architecture Project

This project consists of three microservices: **Address Service**, **Employee Service**, and **API Gateway Service**. Each service is designed to handle specific functionalities within the application, promoting modularity and scalability.

---

## Services Overview

### 1. Address Service
The **Address Service** is responsible for managing address-related operations, such as creating, retrieving, updating, and deleting addresses associated with employees.

#### Endpoints
- **`POST /com.amazingcode.in/api/addresses`** : Create a new address.
- **`GET /com.amazingcode.in/api/addresses`** : Retrieve all addresses.
- **`GET /com.amazingcode.in/api/addresses/{employeeId}`** : Retrieve an address by employee ID.
- **`PUT /com.amazingcode.in/api/addresses/{addressId}`** : Update an existing address by ID.
- **`DELETE /com.amazingcode.in/api/addresses/{addressId}`** : Delete an address by ID.

#### Dependencies
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- PostgreSQL Driver
- Spring Boot DevTools

#### Running the Service
1. Navigate to the **Address Service** directory.
2. Run the service with:
   ```bash
   ./gradlew bootRun

### 2. Employee Service
The **Employee Service** manages employee-related operations, such as creating, retrieving, updating, and deleting employee records.

#### Endpoints
- **`POST /com.amazingcode.in/api/employees`** : Create a new employee.
- **`GET /com.amazingcode.in/api/employees`** : Retrieve all employees.
- **`GET /com.amazingcode.in/api/employees/{employeeId}`** : Retrieve an employee by ID.
- **`PUT /com.amazingcode.in/api/employees/{employeeId}`** : Update an existing employee by ID.
- **`DELETE /com.amazingcode.in/api/employees/{employeeId}`** : Delete an employee by ID.

#### Dependencies
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- PostgreSQL Driver
- Spring Boot DevTools

#### Running the Service
1. Navigate to the **Employee Service** directory.
2. Run the service with:
   ```bash
   ./gradlew bootRun

### 3. API Gateway Service
The **API Gateway Service** acts as a single entry point for the clients, routing requests to the appropriate microservice. It simplifies client-side interactions by aggregating multiple services.

#### Configuration
- **Server Port**: 9090
- **Routes**:
  - **Employee Service** : Routes to the Employee Service at `http://localhost:8081`
  - **Address Service** : Routes to the Address Service at `http://localhost:8082`

#### Dependencies
- Spring Boot
- Spring Cloud Gateway

#### Running the Service
1. Navigate to the **API Gateway Service** directory.
2. Run the service with:
   ```bash
   ./gradlew bootRun

## Getting Started

### Prerequisites
- **Java** 11 or higher
- **Gradle** (if not included in the project setup)

### Setup
1. **Clone the repository:**
   ```bash
   git clone <repository-url>

2. **Run each service:** Navigate to each service’s directory and start it with:
   ```bash
   ./gradlew bootRun

### Access
Access the services through the API Gateway at `http://localhost:9090`.

---

## Conclusion
This microservices-based architecture enhances scalability and maintainability. Each service can be developed, deployed, and scaled independently.
