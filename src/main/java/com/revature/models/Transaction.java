package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="trans_gen", sequenceName="trans_seq", allocationSize=1)
public class Transaction {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="trans_gen")
    private int id;

    @JoinColumn
    @OneToMany(cascade=CascadeType.ALL)
    private Customer customer;

    @Column(nullable=false)
    private int tickets;

    @Column(nullable=false)
    private double total;

}
