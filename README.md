# UserAPI

This api provides functionality related to managing users in the e-commerce system. It allows for user registration, authentication, profile management, and other user-related operations.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- User registration
- User authentication
- User profile management
- User role management
- Password reset
- Email verification

## Technologies Used

- Java
- SpringBoot
- MySQL
- JWT (JSON Web Tokens)

## Getting Started

### Prerequisites

- Java installed on your local machine
- MySQL installed and running locally

### Installation


API Endpoints
The API exposes the following endpoints:

POST /api/users/register: Register a new user.
POST /api/users/login: Log in an existing user.
GET /api/users/profile: Get user profile information.
PUT /api/users/profile: Update user profile information.
PUT /api/users/password-reset: Reset user password.
POST /api/users/verify-email: Verify user email address.
POST /api/users/forgot-password: Initiate the password reset process.
POST /api/users/reset-password: Complete the password reset process.

For detailed information on request and response formats, refer to the API documentation or OpenAPI specification.

Contributing
Contributions are welcome! Please follow the contribution guidelines to contribute to this project.

License
This project is licensed under the GPL-3.0.
