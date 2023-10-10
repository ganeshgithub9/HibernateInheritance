package com.ganesh.inheritance_table_per_class.models;

import jakarta.persistence.Entity;

@Entity(name = "animals")
public class Animal extends LivingThing{
    private String color;
}
