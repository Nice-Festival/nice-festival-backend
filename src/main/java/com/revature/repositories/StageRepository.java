package com.revature.repositories;

import com.revature.models.Stage;

import java.util.List;

public class StageRepository implements CrudRepository<Stage> {
    @Override
    public List<Stage> findAll() {
        return null;
    }

    @Override
    public Stage findById(int id) {
        return null;
    }

    @Override
    public Stage save(Stage newOjb) {
        return null;
    }

    @Override
    public boolean update(Stage updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
