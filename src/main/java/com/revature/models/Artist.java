package com.revature.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@SequenceGenerator(name="artist_gen", sequenceName="artist_seq", allocationSize=1)
public class Artist {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="artist_gen")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column
    private StageType stage;

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
    private SetTimeType time;

    @Enumerated(EnumType.STRING)
    @Column
    private ApplicationStatus status;

    public Artist() {
        super();
    }

    public Artist(User user, String details) {
        this.user = user;
        this.details = details;
    }

    public Artist(int id, StageType stage, SetTime setTime, SetTimeType time) {
        this.id = id;
        this.stage = stage;
        this.setTime = setTime;
        this.time = time;
    }

    public Artist(StageType stage, SetTime setTime, ApplicationStatus status,  SetTimeType time) {
        this.stage = stage;
        this.setTime = setTime;
        this.status = status;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StageType getStage() {
        return stage;
    }

    public void setStage(StageType stage) {
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

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public SetTimeType getTime() {
        return time;
    }

    public void setTime(SetTimeType time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return id == artist.id &&
                stage == artist.stage &&
                Objects.equals(user, artist.user) &&
                Objects.equals(setTime, artist.setTime) &&
                Objects.equals(details, artist.details) &&
                time == artist.time &&
                status == artist.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stage, user, setTime, details, time, status);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", stage=" + stage +
                ", user=" + user +
                ", setTime=" + setTime +
                ", details='" + details + '\'' +
                ", time=" + time +
                ", status=" + status +
                '}';
    }
}
