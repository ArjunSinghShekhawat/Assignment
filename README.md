# Spring Boot Assignment - API Documentation

## Introduction

This project demonstrates CRUD operations (GET, POST, PUT, DELETE) using a Spring Boot application. It covers functionalities like creating, retrieving, updating, and deleting resources such as Movies and Reviews.

## Endpoints

### Review API

#### 1. Add a Review
- **URL:** `/movies/{movieId}/reviews`
- **Method:** `POST`
- **Description:** Adds a review for a specific movie.
- **Request Body:**
    ```json
    {
      "reviewerName": "jay Jaat",
      "comment": "Super Movie",
      "rating": 3
    }
    ```
- **Response:**
    - Status: `201 Created`
    - Example:
    ```json
    {
      "message": "Review added successfully."
    }
    ```

#### 2. Update a Review
- **URL:** `/movies/reviews/{reviewId}`
- **Method:** `PUT`
- **Description:** Updates an existing review based on the review ID.
- **Request Body:**
    ```json
    {
      "comment": "Super Movie",
      "rating": 5
    }
    ```
- **Response:**
    - Status: `200 OK`
    - Example:
    ```json
    {
      "message": "Review updated successfully."
    }
    ```

### Movie API

#### 1. Create a Movie
- **URL:** `/movies`
- **Method:** `POST`
- **Description:** Creates a new movie record.
- **Request Body:**
    ```json
    {
      "title": "Ram Aayenge",
      "genre": "Dharmik",
      "releaseYear": "2023"
    }
    ```
- **Response:**
    - Status: `201 Created`
    - Example:
    ```json
    {
      "message": "Movie created successfully."
    }
    ```

#### 2. Get All Movies
- **URL:** `/movies`
- **Method:** `GET`
- **Description:** Retrieves a list of all movies.
- **Response:**
    - Status: `200 OK`
    - Example:
    ```json
    [
      {
        "id": 1,
        "title": "Ram Aayenge",
        "genre": "Dharmik",
        "releaseYear": "2023"
      },
      {
        "id": 2,
        "title": "Super Movie",
        "genre": "Action",
        "releaseYear": "2022"
      }
    ]
    ```

## Testing and Usage

1. **Step 1:** Send requests.
   - Use the given `POST`, `GET`, `PUT`, `DELETE` HTTP methods for CRUD operations.
   - Open each request in your Postman collection and click "Send".

2. **Step 2:** View responses.
   - Check the response tab for status codes, response time, and size.

3. **Step 3:** Send new Body data.
   - Update or add data in the "Body" section of `POST` and `PUT` requests.

4. **Step 4:** Update the variable.
   - Replace the `base_url` with your own API endpoint in the Postman collection.

## Example Requests

### Add Review Example Request (Postman)

```json
{
  "reviewerName": "John Doe",
  "comment": "Amazing movie!",
  "rating": 4
}
