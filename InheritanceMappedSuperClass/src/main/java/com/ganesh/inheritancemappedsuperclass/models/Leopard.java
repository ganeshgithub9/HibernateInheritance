package com.ganesh.inheritancemappedsuperclass.models;

import jakarta.persistence.Entity;

@Entity(name = "leopards")
public class Leopard extends Animal{
    private int speed;
}
