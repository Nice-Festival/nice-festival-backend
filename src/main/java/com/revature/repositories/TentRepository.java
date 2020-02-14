package com.revature.repositories;

import com.revature.models.Tent;

import java.util.List;

public class TentRepository implements CrudRepository<Tent> {
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
