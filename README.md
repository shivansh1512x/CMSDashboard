# MediCare AI — Personal Clinic Backend

Spring Boot backend for the Personal Clinic frontend.

## Stack
- Java 17
- Spring Boot 3.5.5
- Spring Web
- Spring Data JPA
- MySQL
- Maven

## 1. Create database

Open MySQL Workbench:

```sql
CREATE DATABASE medicare_clinic;
```

## 2. Configure MySQL

Open:

`src/main/resources/application.properties`

Change:

```properties
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

## 3. Run

From the project folder:

```bash
mvn spring-boot:run
```

or run `PersonalClinicApplication.java` from IntelliJ / Eclipse / VS Code.

Backend:

`http://localhost:8080`

## API endpoints

### Patients
GET `/api/patients`
GET `/api/patients/{id}`
GET `/api/patients/search?name=Priya`
POST `/api/patients`
PUT `/api/patients/{id}`
DELETE `/api/patients/{id}`

### Appointments
GET `/api/appointments`
GET `/api/appointments/today`
GET `/api/appointments/{id}`
POST `/api/appointments`
PUT `/api/appointments/{id}`
DELETE `/api/appointments/{id}`

### Medical Records
GET `/api/medical-records`
GET `/api/medical-records/patient/{patientId}`
POST `/api/medical-records`
PUT `/api/medical-records/{id}`
DELETE `/api/medical-records/{id}`

### Reports
GET `/api/reports`
GET `/api/reports/patient/{patientId}`
POST `/api/reports`
PUT `/api/reports/{id}`
DELETE `/api/reports/{id}`

### Billing
GET `/api/billing`
GET `/api/billing/{id}`
POST `/api/billing`
PUT `/api/billing/{id}`
DELETE `/api/billing/{id}`

### Messages
GET `/api/messages`
GET `/api/messages/patient/{patientId}`
POST `/api/messages`

### Reviews
GET `/api/reviews`
POST `/api/reviews`
DELETE `/api/reviews/{id}`

## Frontend connection

The frontend JavaScript uses:

`http://localhost:8080/api`

So start this backend before using the real database data.

## Current scope

This is the core clinic-management backend. Login/authentication, WhatsApp integration, SMS, payment gateway, file upload/storage, email service, AI assistant, and production security are intentionally not included yet.
