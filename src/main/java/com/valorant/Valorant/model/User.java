package com.valorant.Valorant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collation = "User")
public class User {

    public static final String FIELD_ID = "_id";
    public static final String FIELD_FIRST_NAME = "fn";
    public static final String FIELD_LAST_NAME = "ln";
    public static final String FIELD_EMAIL = "em";
    public static final String FIELD_HASHED_PASSWORD = "pwd";
    public static final String FIELD_CREATED_AT = "c";
    public static final String FIELD_MODIFIED_AT = "m";

    @Field(FIELD_ID)
    @Id
    private String id;

    @Field(FIELD_FIRST_NAME)
    private String firstName;

    @Field(FIELD_LAST_NAME)
    private String lastName;

    @Field(FIELD_EMAIL)
    private String email;

    @Field(FIELD_HASHED_PASSWORD)
    private String hashedPassword;

    @Field(FIELD_CREATED_AT)
    private Date createdAt;

    @Field(FIELD_MODIFIED_AT)
    private Date modifiedAt;

    public User () {
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getHashedPassword () {
        return hashedPassword;
    }

    public void setHashedPassword (String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public Date getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt (Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt () {
        return modifiedAt;
    }

    public void setModifiedAt (Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
