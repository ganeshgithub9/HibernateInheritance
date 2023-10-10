package com.ganesh.inheritance_single_table.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "players")
@DiscriminatorValue(value = "6")
public class Player extends Human{
    private int stats;
}
