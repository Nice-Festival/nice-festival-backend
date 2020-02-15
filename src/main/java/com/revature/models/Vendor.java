package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="vendor_gen", sequenceName="vendor_seq", allocationSize=1)
public class  Vendor {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_gen")
    private int id;

    @JoinColumn(nullable=false)
    @OneToOne(cascade=CascadeType.ALL)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column
    private VendorType type;

    @Column(nullable=false)
    private String details;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    public Vendor() {
        super();
    }

    public Vendor(User user, VendorType type, String details) {
        this.user = user;
        this.type = type;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public VendorType getType() {
        return type;
    }

    public void setType(VendorType type) {
        this.type = type;
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
        Vendor vendor = (Vendor) o;
        return id == vendor.id &&
                Objects.equals(user, vendor.user) &&
                type == vendor.type &&
                Objects.equals(details, vendor.details) &&
                status == vendor.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, type, details, status);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", user=" + user +
                ", type=" + type +
                ", details='" + details + '\'' +
                ", status=" + status +
                '}';
    }
}
