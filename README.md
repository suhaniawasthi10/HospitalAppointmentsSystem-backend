# Hospital Appointment System

A Spring Boot application for managing hospital appointments, doctors, and patient authentication. This system allows patients to book appointments with doctors, manage their schedules, and authenticates users via JWT.

## 🚀 Features

*   **User Authentication**: Secure registration and login using JWT (JSON Web Tokens).
*   **Doctor Management**: 
    *   Add new doctors (Admin).
    *   View all doctors.
    *   Filter doctors by specialization.
    *   Pagination support for listing doctors.
*   **Appointment Management**:
    *   Book appointments with specific doctors.
    *   Cancel existing appointments.
    *   View booked appointments.
    *   Doctor-specific view of appointments.
    *   Analytics for appointment status.
*   **Health Check**: Simple endpoint to verify system status.
*   **Rate Limiting**: Implemented using Bucket4j (implied by dependency).
*   **Email Notifications**: Integration for sending emails (implied by implementation).
*   **API Documentation**: Integrated with Swagger/OpenAPI.

## 🛠️ Technology Stack

*   **Framework**: Spring Boot 3.5.x
*   **Language**: Java 17
*   **Database**: PostgreSQL
*   **Security**: Spring Security, JWT (jjwt)
*   **Documentation**: SpringDoc OpenAPI (Swagger UI)
*   **Build Tool**: Maven

## ⚙️ Setup & Configuration

### Prerequisites
*   Java 17 or higher
*   Maven
*   PostgreSQL database

### 1. Clone the repository
```bash
git clone <repository-url>
cd hospital
```

### 2. Configure the Database & Secrets
This project uses sensitive configuration (database credentials, JWT secrets, etc.) which is **git-ignored**.

1.  Locate the example configuration file:  
    `src/main/resources/application.example.yaml`
2.  Copy it to create the actual configuration file:  
    `cp src/main/resources/application.example.yaml src/main/resources/application.yaml`
3.  Open `src/main/resources/application.yaml` and update the values with your actual credentials:
    *   `spring.datasource.url`
    *   `spring.datasource.username`
    *   `spring.datasource.password`
    *   `spring.mail.*`
    *   `jwt.secret`

### 3. Run the Application
```bash
./mvnw spring-boot:run
```

The application will start on **port 8081** (as configured in `application.yaml`).

## 📚 API Documentation

Once the application is running, you can access the interactive Swagger API documentation at:

```
http://localhost:8081/swagger-ui/index.html
```

## 🔐 Security Note

The file `src/main/resources/application.yaml` is included in `.gitignore` to prevent sensitive credentials from being committed. Always use environment variables or a secure vault for production secrets.

## 🤝 Contributing

1.  Fork the project.
2.  Create your feature branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.
