package com.revature.repositories;

import com.revature.models.CustomerFavoriteSetTime;

import java.util.List;

public class CustomerFavoriteRepository implements CrudRepository<CustomerFavoriteSetTime> {
    @Override
    public List<CustomerFavoriteSetTime> findAll() {
        return null;
    }

    @Override
    public CustomerFavoriteSetTime findById(int id) {
        return null;
    }

    @Override
    public CustomerFavoriteSetTime save(CustomerFavoriteSetTime newOjb) {
        return null;
    }

    @Override
    public boolean update(CustomerFavoriteSetTime updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
