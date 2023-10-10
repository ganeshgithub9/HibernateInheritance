package com.ganesh.inheritance_table_per_class.models;

import jakarta.persistence.Entity;

@Entity(name = "leopards")
public class Leopard extends Animal{
    private int speed;
}
