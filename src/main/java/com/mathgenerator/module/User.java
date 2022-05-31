package com.mathgenerator.module;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name ="users")
public class User {

    @Id
    @Column(name="id", nullable = false)
    private UUID id;
    @Column(name="name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    public User(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public User(UUID id) {
        this.id = id;
        this.name=name;
        this.email=email;
        this.password=password;
    }
}
