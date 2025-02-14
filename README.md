# Spring Boot Assignment - API Documentation

## Introduction

This project demonstrates CRUD operations (GET, POST, PUT, DELETE) using a Spring Boot application. It covers functionalities like creating, retrieving, updating, and deleting resources such as Movies and Reviews.

## Endpoints

### Review API

#### 1. Add a Review
- **URL:** `/movies/{movieId}/reviews`
- **Method:** `POST`
- **Description:** Adds a review for a specific movie.

- Example movieId-: 1
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
       "id":1,
      "reviewerName": "jay Jaat",
      "comment": "Super Movie",
      "rating": 3
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
       "id":1,
      "reviewerName": "jay Jaat",
      "comment": "Super Movie",
      "rating": 5
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
       "id":1,
      "title": "Ram Aayenge",
      "genre": "Dharmik",
      "releaseYear": "2023",
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
        "releaseYear": "2023",
        "reviews":[
     {
      "reviewerName": "jay Jaat",
      "comment": "Super Movie",
      "rating": 3
    }
    ]
      },
      {
        "id": 2,
        "title": "Super Movie",
        "genre": "Action",
        "releaseYear": "2022"
      }
    ]
    ```
