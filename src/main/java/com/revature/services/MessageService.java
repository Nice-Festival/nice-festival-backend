package com.revature.services;

import com.revature.models.Message;
import com.revature.models.User;
import com.revature.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageService {

    private MessageRepository messageRepo;

    @Autowired
    public MessageService(MessageRepository repo) {
        this.messageRepo = repo;
    }

    @Transactional(readOnly=true)
    public List<Message> getMessagesByReceiver(User user) {
        // return messageRepo.findByUser
        return null;
    }

//    @Transactional
//    public boolean sendNewMessage(Message message, User receiver) {
//        if (receiver != null || message != null || ) {
//
//        }
//    }

}
