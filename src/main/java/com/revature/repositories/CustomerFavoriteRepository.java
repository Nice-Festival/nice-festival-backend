package com.revature.repositories;

import com.revature.models.Artist;
import com.revature.models.CustomerFavoriteSetTime;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerFavoriteRepository implements CrudRepository<CustomerFavoriteSetTime> {
    private SessionFactory sessionFactory;
    @Autowired
    public CustomerFavoriteRepository(SessionFactory factory) {
        super();
        this.sessionFactory = factory;
    }
    @Override
    public List<CustomerFavoriteSetTime> findAll() {

        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from CustomerFavoriteSetTime", CustomerFavoriteSetTime.class).getResultList();
    }

    @Override
    public CustomerFavoriteSetTime findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(CustomerFavoriteSetTime.class, id);
    }

    @Override
    public CustomerFavoriteSetTime save(CustomerFavoriteSetTime newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public CustomerFavoriteSetTime update(CustomerFavoriteSetTime updatedObj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
