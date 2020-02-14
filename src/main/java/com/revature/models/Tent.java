package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="tent_gen", sequenceName="tent_seq", allocationSize=1)
public class Tent {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tent_gen")
    private int id;

    @Column(nullable=false)
    private String name;

}
