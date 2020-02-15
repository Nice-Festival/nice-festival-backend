package com.revature.services;

import com.revature.exceptions.BadRequestException;
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
        if (user == null) {
            throw new BadRequestException("Invalid user information sent!");
        }
        return messageRepo.findAllByReceiverId(user.getId());
    }

    @Transactional(readOnly=true)
    public List<Message> getMessagesBySender(User user) {
        if (user == null) {
            throw new BadRequestException("Invalid user information sent!");
        }
        return messageRepo.findAllBySenderId(user.getId());
    }

    @Transactional
    public void sendNewMessage(Message message, User receiver) {
        if (receiver != null || message != null || message.getMessage() == null || message.getSubject() == null
        || message.getMessage().equals("") || message.getMessage().equals("")) {
            throw new BadRequestException("Invalid message or user sent");
        }
        message.setReceiver(receiver);
        messageRepo.save(message);

    }

}
