package com.revature.repositories;

import com.revature.models.Message;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository implements CrudRepository<Message> {

    private SessionFactory sessionFactory;

    @Override
    public List<Message> findAll() {
        return null;
    }

    @Override
    public Message findById(int id) {
        return null;
    }

    @Override
    public Message save(Message newOjb) {
        return null;
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
