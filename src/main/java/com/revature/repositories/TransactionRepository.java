package com.revature.repositories;

import com.revature.models.Tent;
import com.revature.models.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository implements CrudRepository<Transaction> {

    private SessionFactory sessionFactory;

    @Override
    public List<Transaction> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Transaction", Transaction.class).getResultList();
    }


    @Override
    public Transaction findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Transaction.class, id);
    }

    @Override
    public Transaction save(Transaction newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
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
