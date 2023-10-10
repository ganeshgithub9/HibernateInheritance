package com.ganesh.inheritance_joinedtable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "animals")
public class Animal extends LivingThing{
    private String color;
}
