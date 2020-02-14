package com.revature.models;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@SequenceGenerator(name="message_gen", sequenceName="message_seq", allocationSize=1)
public class Message {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="message_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private User sender;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private User receiver;

    @Column(nullable=false)
    private String subject;

    @Column(nullable=false)
    private String message;

    @Column(nullable=false)
    private Timestamp sentTime;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status; // enum?

}
