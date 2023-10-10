package com.ganesh.inheritance_single_table.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@Entity(name = "animals")
@DiscriminatorValue(value = "1")
public class Animal extends LivingThing{
    private String color;
}
