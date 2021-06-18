package com.telemed.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class User {

    private long id;

    private String title;

    private String firstName;

    private String lastName;

    private String medicalAbbreviations;

    private String primaryEmail;

    private String secondaryEmail;

    private String phone;

    @Embedded
    private Address address;

    private String bio;

    // role could be sadmin, admin, cadmin, pcp or specialist
    private String role;


}
