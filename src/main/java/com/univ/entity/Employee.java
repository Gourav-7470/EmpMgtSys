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
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id", nullable=false)
    private Long id;
    
    @Column(name="name", nullable=false)
    private String name;
    
    @Column(name="mobileNo", nullable=false)
    private String mobileNo;
    
    @Column(name="cityName", nullable=false)
    private String cityName;

   
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
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="mobileNo", nullable=false)
    private String mobileNo;

    @Column(name="cityName", nullable=false)
    private String cityName;

    // ====== Constructors ======

    // No-argument constructor (JPA ke liye required)
    public Employee() {
    }

    // Constructor with all fields except ID (for creating new employee)
    public Employee(String name, String mobileNo, String cityName) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.cityName = cityName;
    }

    // Constructor with all fields including ID
    public Employee(Long id, String name, String mobileNo, String cityName) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.cityName = cityName;
    }

    // ====== Getters and Setters ======

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // Optional: toString for debugging
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
} */
