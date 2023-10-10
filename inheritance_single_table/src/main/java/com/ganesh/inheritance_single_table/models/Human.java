package com.ganesh.inheritance_single_table.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@Entity(name = "humans")
@DiscriminatorValue(value = "2")
public class Human extends LivingThing {
    private int hands;
}
