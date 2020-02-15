package com.revature.repositories;

import com.revature.models.SetTime;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SetTimeRepository implements CrudRepository<SetTime> {

    private SessionFactory sessionFactory;

    @Override
    public List<SetTime> findAll() {
        return null;
    }

    @Override
    public SetTime findById(int id) {
        return null;
    }

    @Override
    public SetTime save(SetTime newOjb) {
        return null;
    }

    @Override
    public boolean update(SetTime updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
