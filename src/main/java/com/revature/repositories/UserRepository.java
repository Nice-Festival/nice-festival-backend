package com.revature.repositories;

import com.revature.models.Customer;
import com.revature.models.CustomerFavoriteSetTime;
import com.revature.models.User;
import com.revature.web.dtos.Credentials;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements CrudRepository<User> {

    private SessionFactory sessionFactory;

    public User findUserByCredentials(Credentials creds) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User u where u.username = :un and u.password = :pw", User.class)
                .setParameter("un", creds.getUsername())
                .setParameter("pw", creds.getPassword())
                .getSingleResult();
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public User save(User newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public boolean update(User updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
