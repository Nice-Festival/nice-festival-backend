package com.revature.repositories;

import com.revature.models.SetTime;

import java.util.List;

public class SetTimeRepository implements CrudRepository<SetTime> {
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
