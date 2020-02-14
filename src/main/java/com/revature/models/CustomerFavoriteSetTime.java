package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="fav_set_gen", sequenceName="fav_set_seq", allocationSize=1)
public class CustomerFavoriteSetTime {

    @Id @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="fav_set_gen")
    private int id;

    @Column(nullable=false,unique=true)
    private String name;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private SetTime setTime;

    // TODO: finish pojos and and then clarify names of parameters to connect and cascade type
    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Stage stage;

    public CustomerFavoriteSetTime() {
        super();
    }

    public CustomerFavoriteSetTime(String name, SetTime setTime, Stage stage) {
        this.name = name;
        this.setTime = setTime;
        this.stage = stage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetTime getSetTime() {
        return setTime;
    }

    public void setSetTime(SetTime setTime) {
        this.setTime = setTime;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFavoriteSetTime that = (CustomerFavoriteSetTime) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(setTime, that.setTime) &&
                Objects.equals(stage, that.stage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, setTime, stage);
    }

    @Override
    public String toString() {
        return "CustomerFavoriteSetTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", setTime=" + setTime +
                ", stage=" + stage +
                '}';
    }
}
