package com.revature.repositories;

import com.revature.models.Tent;
import com.revature.models.Transaction;
import com.revature.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository implements CrudRepository<Transaction> {
//findAllByCustomer
    private SessionFactory sessionFactory;

    @Autowired
    public TransactionRepository(SessionFactory factory) {
        super();
        this.sessionFactory = factory;
    }
    public Transaction findTransactionByUserId(User user) {
        Session session = sessionFactory.getCurrentSession();
        int id = user.getId();
        return session.get(Transaction.class, id);
    }

    public List<Transaction> findAllTransactionsByUserId(User user) {
        Session session = sessionFactory.getCurrentSession();
        int id = user.getId();
        return session.createQuery("from Transaction where customer.id = :id", Transaction.class)
                .setParameter("id", id)
                .getResultList();
    }

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
    public Transaction update(Transaction updatedObj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
