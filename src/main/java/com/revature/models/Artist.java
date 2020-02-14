package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="artist_gen", sequenceName="artist_seq", allocationSize=1)
public class Artist {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="artist_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Stage stage;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private User user;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private SetTime setTime;

    @Column(nullable=false)
    private String details;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status; // enum?

}
