package com.ganesh.inheritance_table_per_class.models;

import jakarta.persistence.Entity;

@Entity(name = "humans")
public class Human extends LivingThing {
    private int hands;
}
