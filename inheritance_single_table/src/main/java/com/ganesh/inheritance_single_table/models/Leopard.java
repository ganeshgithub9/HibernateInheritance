package com.ganesh.inheritance_single_table.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "leopards")
@DiscriminatorValue(value = "4")
public class Leopard extends Animal{
    private int speed;
}
