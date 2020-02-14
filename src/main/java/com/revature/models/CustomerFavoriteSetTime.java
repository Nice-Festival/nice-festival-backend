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

    @Column(nullable=false)
    private int setTime;

    // TODO: finish pojos and and then clarify names of parameters to connect and cascade type
    private int stageId;

    public CustomerFavoriteSetTime() {
        super();
    }

    public CustomerFavoriteSetTime(String name, int setTime) {
        this.name = name;
        this.setTime = setTime;
    }

    public CustomerFavoriteSetTime(String name, int setTime, int stageId) {
        this.name = name;
        this.setTime = setTime;
        this.stageId = stageId;
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

    public int getSetTime() {
        return setTime;
    }

    public void setSetTime(int setTime) {
        this.setTime = setTime;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFavoriteSetTime that = (CustomerFavoriteSetTime) o;
        return id == that.id &&
                setTime == that.setTime &&
                stageId == that.stageId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, setTime, stageId);
    }

    @Override
    public String toString() {
        return "CustomerFavoriteSetTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", setTime=" + setTime +
                ", stageId=" + stageId +
                '}';
    }
}
