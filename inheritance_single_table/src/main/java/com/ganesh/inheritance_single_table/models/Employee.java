package com.ganesh.inheritance_single_table.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "employees")
@DiscriminatorValue(value = "5")
public class Employee extends Human{
    private int salary;
}
