package com.ganesh.inheritance_single_table.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "elephants")
@DiscriminatorValue(value = "3")
public class Elephant extends Animal{
    private int sound;
}
