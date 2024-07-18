# Pet Adoption Agency Management System

## Overview
The Pet Adoption Agency Management System is a Java-based application designed to manage the operations of a pet adoption agency. It provides functionality for administrators to manage users and pets through a PostgreSQL database. This README provides an overview of the application's features, setup instructions, and usage guidelines.

## Features
- **User Management:**
  - Add new users
  - Update user information
- **Pet Management:**
  - Add new pets
  - View pets available for adoption
- **Additional Functionality:**
  - View pets adopted by a specific user

## Tech Stack
- **Java:** Backend API development
- **Javalin:** Lightweight web framework for handling HTTP requests
- **PostgreSQL:** Database management system
- **JDBC:** Java Database Connectivity for interacting with the database
- **Postman:** API testing tool

## Setup
To run this application locally, follow these steps:

1. **Clone the Repository:**
    ```sh
    git clone <repository_url>
    cd pet-adoption-agency
    ```

2. **Database Setup:**
  - Install PostgreSQL and create a database named `PetAgency`.
  - Execute the SQL scripts in `database/PetAgency.sql` to create the necessary tables.

3. **Configure Database Connection:**
  - Update the database connection settings in `src/main/java/com.revature/utils/Connection.java` to match your local PostgreSQL setup.

4. **Build and Run the Application:**
  - Compile and run the Java application using your preferred IDE or build tool.

5. **Testing Endpoints:**
  - Use Postman to send HTTP requests to the API endpoints for testing.

## API Endpoints
- **GET /users**: Retrieve all users.
- **GET /users/{user_id}**: Retrieve a user by ID.
- **POST /users**: Create a new user.
- **PUT /users/{user_id}**: Update an existing user.
- **DELETE /users/{user_id}**: Delete a user.
- **GET /pets**: Retrieve all pets.
- **GET /pets/{pet_id}**: Retrieve a pet by ID.
- **POST /pets**: Add a new pet.

## Usage
- Ensure the application is running locally.
- Use Postman to send HTTP requests to the defined API endpoints.
- Verify responses and functionality according to the project requirements.

## Known Issues
- 

## Future Enhancements
- 

## Contributors
- Luis Vazquez

## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
