package com.revature.repositories;

import com.revature.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SetTimeRepository implements CrudRepository<SetTime> {

    private SessionFactory sessionFactory;

    @Autowired
    public SetTimeRepository(SessionFactory factory) {
        super();
        this.sessionFactory = factory;
    }
    public Vendor assignTent(Vendor arr, Tent tent) {
        Session session = sessionFactory.getCurrentSession();
        Vendor retrievedVendor = session.load(Vendor.class,arr.getId());
        retrievedVendor.setTent(tent);
        return retrievedVendor;
    }


    @Override
    public List<SetTime> findAll() {

        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from SetTime", SetTime.class).getResultList();
    }

    @Override
    public SetTime findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(SetTime.class, id);
    }

    @Override
    public SetTime save(SetTime newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public SetTime update(SetTime updatedObj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
