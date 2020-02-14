package com.revature.repositories;

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
//        return session.createQuery("from User u where u.username = :un and u.password = :pw", User.class)
//                .setParameter("un", creds.getUsername())
//                .setParameter("pw", creds.getPassword())
//                .getSingleResult();
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User save(User newOjb) {
        return null;
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
