package com.revature.services;

import com.revature.exceptions.BadRequestException;
import com.revature.models.Transaction;
import com.revature.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    private TransactionRepository transRepo;

    @Autowired
    public TransactionService(TransactionRepository repo) {
        this.transRepo = repo;
    }

//    @Transactional(readOnly=true)
//    public Transaction getTransactionByUser

    @Transactional
    public void createTransaction(Transaction transaction) {
        if (transaction == null || transaction.getCustomer() == null || transaction.getTickets() <= 0
        || transaction.getTotal() <= 0) {
            throw new BadRequestException("Invalid transaction made!");
        }
        transRepo.save(transaction);
    }

}
