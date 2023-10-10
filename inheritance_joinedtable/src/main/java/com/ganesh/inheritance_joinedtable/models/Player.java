package com.ganesh.inheritance_joinedtable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "players")
public class Player extends Human{
    private int stats;
}
