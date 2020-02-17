package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="tent_gen", sequenceName="tent_seq", allocationSize=1)
public class Tent {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tent_gen")
    private int id;

    @Column(nullable=false)
    private String name;

    public Tent() {
        super();
    }

    public Tent(String name) {
        this.name = name;
    }

    public Tent(int id, String name) {
        this.id = id;
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
        Tent tent = (Tent) o;
        return id == tent.id &&
                Objects.equals(name, tent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Tent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
