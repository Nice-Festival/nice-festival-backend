package com.revature.repositories;

import com.revature.models.Tent;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TentRepository implements CrudRepository<Tent> {

    private SessionFactory sessionFactory;

    @Override
    public List<Tent> findAll() {
        return null;
    }

    @Override
    public Tent findById(int id) {
        return null;
    }

    @Override
    public Tent save(Tent newOjb) {
        return null;
    }

    @Override
    public boolean update(Tent updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
