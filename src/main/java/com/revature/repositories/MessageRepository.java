package com.revature.repositories;

import com.revature.models.Message;

import java.util.List;

public class MessageRepository implements CrudRepository<Message> {
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
