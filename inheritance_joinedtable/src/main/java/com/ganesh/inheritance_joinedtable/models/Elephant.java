package com.ganesh.inheritance_joinedtable.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "elephants")
public class Elephant extends Animal{
    private int sound;
}
