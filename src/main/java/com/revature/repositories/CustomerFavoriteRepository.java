package com.revature.repositories;

import com.revature.models.CustomerFavoriteSetTime;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerFavoriteRepository implements CrudRepository<CustomerFavoriteSetTime> {
    private SessionFactory sessionFactory;

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
