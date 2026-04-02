# 🚀 Routing Microservices - Spring Boot API Gateway Project

> 🚀 A microservices-based routing system using Spring Cloud API Gateway for centralized request handling.

---

## 📖 Introduction

This project demonstrates how to implement **routing in microservices** using **Spring Cloud API Gateway**.

In a microservices architecture, multiple services run independently. Instead of calling each service directly, we use an API Gateway to:

* Route requests to appropriate services
* Provide a single entry point
* Handle cross-cutting concerns like logging and security

---

## 🧠 Concepts Used

### 🔹 API Gateway

API Gateway acts as a single entry point for all client requests. It routes incoming requests to the correct microservice.

### 🔹 Routing

Routing is the process of forwarding client requests to the appropriate service based on defined rules.

Example:

* `/users/**` → User Service
* `/orders/**` → Order Service

### 🔹 Load Balancing

Requests can be distributed across multiple instances of a service using service discovery.

---

## 💡 Example Flow

1. Client sends request to API Gateway
2. Gateway checks route configuration
3. Request is forwarded to the appropriate microservice
4. Response is sent back to the client

Example:

* Request → `/users` → routed to User Service
* Request → `/orders` → routed to Order Service

---

## 🌍 Real-Life Analogy

Think of a shopping mall:

* Mall entrance = API Gateway
* Different shops = Microservices
* Security guard = Routing logic

You don’t go directly to the shop from outside.
You enter through the main gate, and then you're guided to the correct store.

---

## 📂 Project Structure

```id="9jk21x"
Routing-Microservices/
│
├── api-gateway/
│   └── (Spring Cloud Gateway - Routing logic)
│
├── user-service/
│   └── (Handles user-related requests)
│
├── order-service/
│   └── (Handles order-related requests)
│
└── README.md
```

---

## ⚙️ How to Run the Project

### Step 1: Start Microservices

* Run user-service on port `8081`
* Run order-service on port `8082`

### Step 2: Start API Gateway

* Run api-gateway on port `8080`

### Step 3: Test Routing

Call via Gateway:

* http://localhost:8080/users
* http://localhost:8080/orders

### Step 4: Verify Routing

Requests should be automatically routed to respective services

---

## 🔀 Sample Routing Configuration

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: user-service
          uri: http://localhost:8081
          predicates:
            - Path=/users/**

        - id: order-service
          uri: http://localhost:8082
          predicates:
            - Path=/orders/**
```

---

## 🚀 Advantages

* Single entry point for all services
* Simplifies client communication
* Centralized routing logic
* Easy to add security and filters
* Improves scalability and maintainability

---

## 🛠️ Applications

* Microservices architecture
* Backend for frontend (BFF)
* Cloud-native applications
* Enterprise systems
* API management systems

---

## 🧰 Technologies Used

* Java
* Spring Boot
* Spring Cloud Gateway
* Maven
* REST APIs

---

## 🧑‍💻 Author

**Vishal Gavali**
Computer Engineering Student

---
