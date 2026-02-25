# Unary gRPC Communication – Employee Service 🚀

This module demonstrates **Unary RPC** communication using gRPC and Spring Boot.

In Unary RPC:
- Client sends one request
- Server returns one response

This example fetches employee details by name.

## 📌 Features

- gRPC Unary communication
- Spring Boot based client and server
- Protocol Buffers contract
- Employee service example
- Centralized configuration

## Tech Stack

- Java
- Spring Boot
- gRPC
- Protocol Buffers (Protobuf)
- Maven
- Spring Data JPA (Server Side)

---

## 📂 Module Structure


unary-service/

├── employee-client/

  └── gRPC client

├── employee-server/

  └── gRPC server

## How It Works

1.Client sends employee name

2.Server receives request

3.Server prepares employee details

4.Server sends response back

5.Client prints result

## 📜 Proto Definition

```proto
service EmployeeService {
  rpc GetEmployeeByName(GetEmployeeByNameRequest)
      returns (GetEmployeeByNameResponse);
}
```
## How to Run the Project

1️⃣ Start  Server

```
cd employee-server
mvn spring-boot:run
```

Server will start on:
localhost:9090

2️⃣ Start the Client

```
cd employee-client
mvn spring-boot:run
```

## SampleOutput
You will see output like:

Employee Client Application Started

Employee Details: name: "Amit Kumar"

email: "amit kumar@example.com"

phone: 1234567890

department: "Engineering"
