package com.ganesh.inheritance_joinedtable.models;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "living_things")
@Inheritance(strategy = InheritanceType.JOINED)
public class LivingThing {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID id;
    private int age,weight,legs;
}
