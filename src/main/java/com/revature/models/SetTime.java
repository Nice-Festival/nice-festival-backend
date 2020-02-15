package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="set_time_gen", sequenceName="set_time_seq", allocationSize=1)
public class SetTime {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="set_time_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Stage stage;

    @Column(nullable=false)
    private String time;

    public SetTime() {
        super();
    }

    public SetTime(Stage stage, String time) {
        this.stage = stage;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetTime setTime = (SetTime) o;
        return id == setTime.id &&
                Objects.equals(stage, setTime.stage) &&
                Objects.equals(time, setTime.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stage, time);
    }

    @Override
    public String toString() {
        return "SetTime{" +
                "id=" + id +
                ", stage=" + stage +
                ", time='" + time + '\'' +
                '}';
    }
}
