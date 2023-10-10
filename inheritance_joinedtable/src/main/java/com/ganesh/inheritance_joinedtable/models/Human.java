package com.ganesh.inheritance_joinedtable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "humans")
public class Human extends LivingThing {
    private int hands;
}
