package com.revature.repositories;

import com.revature.models.Customer;

import java.util.List;

public class CustomerRepository implements CrudRepository<Customer> {
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
