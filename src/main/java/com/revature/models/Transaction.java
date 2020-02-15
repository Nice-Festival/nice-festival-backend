package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name="trans_gen", sequenceName="trans_seq", allocationSize=1)
public class Transaction {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="trans_gen")
    private int id;

    @JoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Customer customer;

    @Column(nullable=false)
    private int tickets;

    @Column(nullable=false)
    private double total;

    public Transaction() {
        super();
    }

    public Transaction(Customer customer, int tickets, double total) {
        this.customer = customer;
        this.tickets = tickets;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id &&
                tickets == that.tickets &&
                Double.compare(that.total, total) == 0 &&
                Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, tickets, total);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", customer=" + customer +
                ", tickets=" + tickets +
                ", total=" + total +
                '}';
    }
}
