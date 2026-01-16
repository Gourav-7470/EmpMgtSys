/*package com.univ.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id", nullable=false)
    private Long id;
    
    @Column(name="username", nullable=false, unique=true)
    private String username;
    
    @Column(name="password", nullable=false)
    private String password;
    
    @Column(name="role", nullable=false)
    private String role;

    
}*/

package com.univ.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Long id;

    @Column(name="username", nullable=false, unique=true)
    private String username;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="role", nullable=false)
    private String role = "USER"; 
}
/*
package com.univ.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Long id;

    @Column(name="username", nullable=false, unique=true)
    private String username;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="role", nullable=false)
    private String role = "USER"; // default role

    // ====== Getters and Setters ======

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // ====== Constructors ======

    // No-argument constructor (needed by JPA)
    public User() {
    }

    // Constructor with username and password (role will default to "USER")
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "USER";
    }

    // Constructor with all fields
    public User(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
*/

