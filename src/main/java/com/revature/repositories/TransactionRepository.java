package com.revature.repositories;

import com.revature.models.Transaction;

import java.util.List;

public class TransactionRepository implements CrudRepository<Transaction> {
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
