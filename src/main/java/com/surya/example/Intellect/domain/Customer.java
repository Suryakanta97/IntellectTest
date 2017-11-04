package com.surya.example.Intellect.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "CUSTOMER")
public class Customer {

    @Id
    @Field("id")
    private int id;

    @NotNull
    @Size(min = 1)
    @Field("fname")
    private String fname;

    @Size(min = 1)
    @Field("lname")
    private String lname;
    
    @NotNull
    @Size(min = 1)
    @Field("pincode")
    private int pincode;
    
    @NotNull
    @Size(min = 1)
    @Field("birthDate")
    private String birthDate;
    
    @NotNull
    @Size(min = 1)
    @Field("isActive")
    private Boolean isActive;
    
    @NotNull
    @Size(min = 1)
    @Field("email")
    private String email;

    public Customer(int id, String fname,String lname,int pincode,String email,boolean isActive,String birthDate) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.pincode = pincode;
        this.birthDate= birthDate;
        this.isActive= isActive; 
    }
}