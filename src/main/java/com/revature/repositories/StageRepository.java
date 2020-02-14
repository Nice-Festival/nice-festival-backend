package com.revature.repositories;

import com.revature.models.Stage;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StageRepository implements CrudRepository<Stage> {

    private SessionFactory sessionFactory;

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
