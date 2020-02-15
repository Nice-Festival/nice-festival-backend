package com.revature.repositories;

import com.revature.models.Message;
import com.revature.models.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StageRepository implements CrudRepository<Stage> {

    private SessionFactory sessionFactory;

    @Autowired
    public StageRepository(SessionFactory factory) {
        super();
        this.sessionFactory = factory;
    }
    @Override
    public List<Stage> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Stage", Stage.class).getResultList();
    }

    @Override
    public Stage findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Stage.class, id);
    }

    @Override
    public Stage save(Stage newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public Stage update(Stage updatedObj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
