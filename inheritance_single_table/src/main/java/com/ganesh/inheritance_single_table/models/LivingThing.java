package com.ganesh.inheritance_single_table.models;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "living_things")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ObjectType",discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "0")
public class LivingThing {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID id;
    private int age,weight,legs;
}
