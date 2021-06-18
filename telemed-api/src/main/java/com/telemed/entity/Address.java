package com.telemed.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String suite;
    private String city;
    private String state;
    private String zipCode;

}
