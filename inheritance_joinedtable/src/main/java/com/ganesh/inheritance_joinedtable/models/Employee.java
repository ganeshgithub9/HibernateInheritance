package com.ganesh.inheritance_joinedtable.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "employees")
public class Employee extends Human{
    private int salary;
}
