package com.connectServices.addressservice.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id     //primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // database generates the primary key values automatically(how DB generates primary key)
    @Column(name= "id")
    private int id;
    @Column(name= "first_lane")
    private String firstLane;
    @Column(name= "last_lane")
    private String lastLane;
    @Column(name= "zip")
    private long zip;
    @Column(name= "state")
    private String state;
}
