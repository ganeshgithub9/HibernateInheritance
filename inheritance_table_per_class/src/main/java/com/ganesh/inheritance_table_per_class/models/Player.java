package com.ganesh.inheritance_table_per_class.models;

import jakarta.persistence.Entity;

@Entity(name = "players")
public class Player extends Human{
    private int stats;
}
