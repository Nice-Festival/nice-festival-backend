package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="customer_gen", sequenceName="customer_seq", allocationSize=1)
public class Customer {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_gen")
    private int id;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String city;

    @Column(nullable=false)
    private String state;

    @JoinColumn(nullable=false)
    @OneToOne(cascade=CascadeType.ALL)
    private User user;

}
