package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="stage_gen", sequenceName="stage_seq", allocationSize=1)
public class Stage {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="stage_gen")
    private int id;

    @Column(nullable=false)
    private String name;

    public Stage() {
        super();
    }

    public Stage(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return id == stage.id &&
                Objects.equals(name, stage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
