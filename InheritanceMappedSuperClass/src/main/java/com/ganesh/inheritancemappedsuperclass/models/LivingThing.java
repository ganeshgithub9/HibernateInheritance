package com.ganesh.inheritancemappedsuperclass.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@MappedSuperclass
public abstract class LivingThing {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID id;
    private int age,weight,legs;
}
