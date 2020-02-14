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

    @Enumerated(EnumType.STRING)
    @Column
    private VendorType type; // enum?

    @Column(nullable=false)
    private String details;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status; // enum?

}
