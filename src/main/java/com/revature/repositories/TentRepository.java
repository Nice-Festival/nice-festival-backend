package com.revature.repositories;

import com.revature.models.Message;
import com.revature.models.Tent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TentRepository implements CrudRepository<Tent> {

    private SessionFactory sessionFactory;

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
    public boolean update(Tent updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
