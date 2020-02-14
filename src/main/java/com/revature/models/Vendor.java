package com.revature.models;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="vendor_gen", sequenceName="vendor_seq", allocationSize=1)
public class  Vendor {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private User user;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private VendorType type; // enum?

    @Column(nullable=false)
    private String details;

    @Column(nullable=false)
    private Status status; // enum?

}
