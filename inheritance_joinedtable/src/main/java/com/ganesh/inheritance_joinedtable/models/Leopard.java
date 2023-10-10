package com.ganesh.inheritance_joinedtable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "leopards")
public class Leopard extends Animal{
    private int speed;
}
