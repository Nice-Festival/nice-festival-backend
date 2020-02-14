package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="set_time_gen", sequenceName="set_time_seq", allocationSize=1)
public class SetTime {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="set_time_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Stage stage;

    @Column(nullable=false)
    private String time;

    // check with team about how to set up time

}
