package com.swe.hw3.models;


import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Data
@Table(name="surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    private String streetAddress;

    private String city;

    private String state;

    private int zip;

    private String telephone;

    private String email;

    private String dateOfSurvey;

    private List<String> likes;

    private String interests;

    private String recommendUni;
}
