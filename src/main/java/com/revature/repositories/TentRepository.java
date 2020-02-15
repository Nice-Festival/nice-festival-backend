package com.revature.repositories;

import com.revature.models.Message;
import com.revature.models.Tent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TentRepository implements CrudRepository<Tent> {

    private SessionFactory sessionFactory;

    @Autowired
    public TentRepository(SessionFactory factory) {
        super();
        this.sessionFactory = factory;
    }
    @Override
    public List<Tent> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Tent", Tent.class).getResultList();
    }

    @Override
    public Tent findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Tent.class, id);
    }

    @Override
    public Tent save(Tent newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public Tent update(Tent updatedObj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
