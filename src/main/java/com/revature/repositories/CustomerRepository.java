package com.revature.repositories;

import com.revature.models.Customer;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements CrudRepository<Customer> {

    private SessionFactory sessionFactory;

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public Customer save(Customer newOjb) {
        return null;
    }

    @Override
    public boolean update(Customer updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
