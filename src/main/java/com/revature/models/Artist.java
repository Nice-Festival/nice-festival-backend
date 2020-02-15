package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

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

    @JoinColumn(nullable=false)
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

    public Artist() {
        super();
    }

    public Artist(User user, String details) {
        this.user = user;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SetTime getSetTime() {
        return setTime;
    }

    public void setSetTime(SetTime setTime) {
        this.setTime = setTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        Artist artist = (Artist) o;
        return id == artist.id &&
                Objects.equals(stage, artist.stage) &&
                Objects.equals(user, artist.user) &&
                Objects.equals(setTime, artist.setTime) &&
                Objects.equals(details, artist.details) &&
                status == artist.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stage, user, setTime, details, status);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", stage=" + stage +
                ", user=" + user +
                ", setTime=" + setTime +
                ", details='" + details + '\'' +
                ", status=" + status +
                '}';
    }
}
