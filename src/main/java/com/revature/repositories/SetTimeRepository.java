package com.revature.repositories;

import com.revature.models.CustomerFavoriteSetTime;
import com.revature.models.Message;
import com.revature.models.SetTime;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SetTimeRepository implements CrudRepository<SetTime> {

    private SessionFactory sessionFactory;

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
    public boolean update(SetTime updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
