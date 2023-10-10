package com.ganesh.inheritance_table_per_class.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "living_things")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class LivingThing {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID id;
    private int age,weight,legs;
}
