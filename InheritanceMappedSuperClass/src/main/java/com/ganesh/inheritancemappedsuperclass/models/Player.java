package com.ganesh.inheritancemappedsuperclass.models;

import jakarta.persistence.Entity;

@Entity(name = "players")
public class Player extends Human{
    private int stats;
}
