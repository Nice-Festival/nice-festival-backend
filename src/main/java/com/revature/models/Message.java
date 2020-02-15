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
    @OneToMany(cascade=CascadeType.ALL)
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

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getSentTime() {
        return sentTime;
    }

    public void setSentTime(Timestamp sentTime) {
        this.sentTime = sentTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
