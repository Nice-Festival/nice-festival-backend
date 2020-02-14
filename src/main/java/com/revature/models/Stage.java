package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="stage_gen", sequenceName="stage_seq", allocationSize=1)
public class Stage {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="stage_gen")
    private int id;

    @Column(nullable=false)
    private String name;

}
