package com.ganesh.inheritancemappedsuperclass.models;


import jakarta.persistence.Entity;

@Entity(name = "employees")
public class Employee extends Human{
    private int salary;
}
