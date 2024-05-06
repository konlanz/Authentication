# Spring Boot PostgreSQL Docker Compose Extendable Login/Registration with Activation and JWT Authentication

## Overview
This project provides a Spring Boot application with PostgreSQL database, packaged with Docker Compose. It implements a basic login and registration system with email activation using Spring Boot. Additionally, it utilizes JWT (JSON Web Tokens) for stateless authentication and includes role-based access control.

## Prerequisites
- Docker
- Docker Compose

## Setup Instructions
1. Clone the repository:

git clone https://github.com/konlanz/Authentication.git
cd authcode


2. Configure the application:
- Navigate to `src/main/resources/application.yml` and the `src/main/resources/application-dev.yml`
- Modify the database configuration to match your PostgreSQL setup.
3. Build the Docker image:



4. Start the Docker containers:

docker-compose up -d


5. Access the application:
- Once the containers are up and running, the Spring Boot application will be available at `http://localhost:8088`.

## Usage
1. Registration:
- Navigate to `http://localhost:8088/api/v1/auth/register`.
- Fill in the registration form with required details.
- Upon successful registration, an activation email will be sent to the provided email address.

2. Activation:
- Check your email inbox for the activation email.
- Click on the activation link provided in the email.
- Once activated, you will be able to log in to the application.

3. Login:
- Navigate to `http://localhost:8088/api/v1/auth/authenticate`.
- Enter your credentials and click "Login".
- Upon successful login, a JWT token will be provided in the response.

4. JWT Authentication:
- Include the JWT token in the Authorization header for subsequent requests.
- Example header: `Authorization: Bearer <JWT_token>`.
- The JWT token will be validated for authentication.

5. Role-based Access Control:
- The application supports role-based access control.
- Users can have different roles such as "USER" and "ADMIN".
- Define role-based permissions within the application and enforce them based on the user's role.

6. Extendability:
- This application can be extended to add more features like password recovery, social login integration, etc.
- Explore the project structure and the existing codebase to understand how to extend functionality.

## Troubleshooting
- If you encounter any issues, check the Docker logs for both the Spring Boot application and PostgreSQL containers.
- Ensure that the database configuration in `application-dev.yml` matches the PostgreSQL setup.
- Make sure that Docker and Docker Compose are installed correctly and running.

## Additional Notes
- This is a basic implementation meant for demonstration purposes. Consider implementing security best practices and additional features for production use.
- The application might require further customization depending on your specific requirements.

