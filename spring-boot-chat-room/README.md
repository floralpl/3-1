# Spring Boot Chat Room

This project is a simple chat room application built with Spring Boot. It includes user registration and login features, as well as real-time chat functionality using WebSockets.

## Features

- User registration and authentication
- Real-time chat messaging
- Multi-threaded handling of connected users
- User-friendly chat interface

## Project Structure

```
spring-boot-chat-room
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── chatroom
│   │   │               ├── ChatRoomApplication.java
│   │   │               ├── controller
│   │   │               │   ├── AuthController.java
│   │   │               │   └── ChatController.java
│   │   │               ├── model
│   │   │               │   ├── User.java
│   │   │               │   └── Message.java
│   │   │               ├── service
│   │   │               │   ├── UserService.java
│   │   │               │   └── ChatService.java
│   │   │               └── config
│   │   │                   └── WebSocketConfig.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           ├── login.html
│   │           └── chat.html
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd spring-boot-chat-room
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application:**
   ```
   mvn spring-boot:run
   ```

4. **Access the application:**
   Open your web browser and navigate to `http://localhost:8080`.

## Usage

- **Registration:** Navigate to the login page and create a new account.
- **Login:** Enter your credentials to access the chat room.
- **Chat:** Use the chat interface to send and receive messages in real-time.

## Dependencies

This project uses the following dependencies:

- Spring Boot Starter Web
- Spring Boot Starter WebSocket
- Spring Boot Starter Security
- Spring Boot Starter Thymeleaf
- Spring Data JPA (if using a database)

## License

This project is licensed under the MIT License.