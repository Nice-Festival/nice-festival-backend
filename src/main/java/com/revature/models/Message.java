package com.revature.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
@SequenceGenerator(name="message_gen", sequenceName="message_seq", allocationSize=1)
public class Message {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="message_gen")
    private int id;

    @Column
    private String correspondingId;

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

    public Message(User sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
    }

    public Message(String correspondingId, User sender, String subject, String message) {
        this.correspondingId = correspondingId;
        this.sender = sender;
        this.subject = subject;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorrespondingId() {
        return correspondingId;
    }

    public void setCorrespondingId(String correspondingId) {
        this.correspondingId = correspondingId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return id == message1.id &&
                correspondingId == message1.correspondingId &&
                Objects.equals(sender, message1.sender) &&
                Objects.equals(receiver, message1.receiver) &&
                Objects.equals(subject, message1.subject) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(sentTime, message1.sentTime) &&
                status == message1.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correspondingId, sender, receiver, subject, message, sentTime, status);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", correspondingId=" + correspondingId +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", sentTime=" + sentTime +
                ", status=" + status +
                '}';
    }
}
