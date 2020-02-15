package com.revature.repositories;

import com.revature.models.Message;
import com.revature.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository implements CrudRepository<Message> {

    private SessionFactory sessionFactory;

    public List<Message> findAllBySenderId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Message m where m.sender = :mes", Message.class)
                .setParameter("mes", id)
                .getResultList();
    }

    public List<Message> findAllByReceiverId(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Message m where m.receiver = :mes", Message.class)
                .setParameter("mes", id)
                .getResultList();
    }

    @Override
    public List<Message> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Message", Message.class).getResultList();
    }

    @Override
    public Message findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Message.class, id);
    }

    @Override
    public Message save(Message newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
    }

    @Override
    public boolean update(Message updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
