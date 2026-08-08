# Job Portal

A full-stack Job Portal application built using Spring Boot, React, and MySQL.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- React
- Vite

## Features (Planned)
- User Registration & Login
- Recruiter Dashboard
- Job Posting
- Job Search
- Apply for Jobs
- JWT Authentication
- Admin Dashboard

## Project Status
🚧 Currently in development.

## Progress

✅ Day 1: Spring Boot project setup, Maven dependencies, and MySQL configuration.
✅ Day 2:
  - Created the `User` entity.
  - Added JPA annotations (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`).
  - Used Lombok to reduce boilerplate code.
  - Created `UserRepository` using `JpaRepository`.
  - Successfully generated the `users` table in the `job_portal` database.
🟩 Day 3: Created User Registration API using Controller, Service, Repository, and tested successfully with Thunder Client.

✅ Day 4:
- User Login API
- Email-based authentication
- Password validation
- Custom repository method using findByEmail()
- Thunder Client testing

Technologies Used
- Spring Boot
- Spring Data JPA
- MySQL
- Thunder Client

- ✅ Day 5:
  Features Completed
- Job Entity
- Job Repository
- Job Service
- Job Controller
- Job Registration API
- Saved Job details into MySQL
Technologies Used-
- Spring Boot
- Spring Data JPA
- MySQL
- Thunder Client


✅ Day 6 Completed
- Added Get All Jobs API
- Added Get Job By ID API
- Successfully tested both APIs using Thunder Client

✅ Day 7
✅ Created Job entity
✅ Implemented JobRepository
✅ Implemented JobService
✅ Added APIs:
- Create Job
- Get All Jobs
- Get Job By ID
✅ Successfully tested APIs using Thunder Client.
Current Progress:
- User Registration ✔️
- User Login ✔️
- Job Create ✔️
- Job List ✔️
- Job Details ✔️
✅ Day 9
 Implemented Delete Job API

 Added `deleteJob()` method in JobService

 Added DELETE endpoint:
`DELETE /api/jobs/{id}`

 Tested Delete Job API using Thunder Client

 Verified deleted job using Get All Jobs API