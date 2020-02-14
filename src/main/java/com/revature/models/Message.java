package com.revature.models;

import java.sql.Timestamp;
import java.util.Objects;

public class Message {

    private int id;
    private int senderId;
    private int recieverId;
    private String subject;
    private String message;
    private Timestamp sentTime;
    private String status; // enum?

    public Message() {
        super();
    }

    public Message(int senderId, int recieverId, String subject, String message) {
        this.senderId = senderId;
        this.recieverId = recieverId;
        this.subject = subject;
        this.message = message;
    }

    public Message(int senderId, int recieverId, String subject, String message, String status) {
        this.senderId = senderId;
        this.recieverId = recieverId;
        this.subject = subject;
        this.message = message;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(int recieverId) {
        this.recieverId = recieverId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return id == message1.id &&
                senderId == message1.senderId &&
                recieverId == message1.recieverId &&
                Objects.equals(subject, message1.subject) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(sentTime, message1.sentTime) &&
                Objects.equals(status, message1.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, senderId, recieverId, subject, message, sentTime, status);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", recieverId=" + recieverId +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", sentTime=" + sentTime +
                ", status='" + status + '\'' +
                '}';
    }
}
