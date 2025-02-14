package com.assignment.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reviewerName;

    private String comment;

    private int rating;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    @JsonIgnore
    private Movies movie;
}

