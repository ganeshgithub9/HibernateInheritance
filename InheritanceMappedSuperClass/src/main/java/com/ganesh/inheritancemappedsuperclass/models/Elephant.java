package com.ganesh.inheritancemappedsuperclass.models;


import jakarta.persistence.Entity;

@Entity(name = "elephants")
public class Elephant extends Animal{
    private int sound;
}
