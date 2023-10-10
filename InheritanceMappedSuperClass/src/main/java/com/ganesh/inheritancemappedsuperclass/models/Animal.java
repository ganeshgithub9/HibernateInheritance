package com.ganesh.inheritancemappedsuperclass.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Animal extends LivingThing{
    private String color;
}
