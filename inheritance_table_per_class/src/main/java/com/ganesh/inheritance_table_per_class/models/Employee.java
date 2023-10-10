package com.ganesh.inheritance_table_per_class.models;


import jakarta.persistence.Entity;

@Entity(name = "employees")
public class Employee extends Human{
    private int salary;
}
