package com.ganesh.inheritancemappedsuperclass.models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Human extends LivingThing {
    private int hands;
}
