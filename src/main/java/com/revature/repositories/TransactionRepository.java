package com.revature.repositories;

import com.revature.models.Transaction;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository implements CrudRepository<Transaction> {

    private SessionFactory sessionFactory;

    @Override
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    public Transaction findById(int id) {
        return null;
    }

    @Override
    public Transaction save(Transaction newOjb) {
        return null;
    }

    @Override
    public boolean update(Transaction updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
