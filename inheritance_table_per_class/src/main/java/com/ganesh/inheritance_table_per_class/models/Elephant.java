package com.ganesh.inheritance_table_per_class.models;


import jakarta.persistence.Entity;

@Entity(name = "elephants")
public class Elephant extends Animal{
    private int sound;
}
