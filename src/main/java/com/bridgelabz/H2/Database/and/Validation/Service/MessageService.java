package com.bridgelabz.H2.Database.and.Validation.Service;

import com.bridgelabz.H2.Database.and.Validation.DTO.MessageDTO;
import com.bridgelabz.H2.Database.and.Validation.Exception.CustomException;
import com.bridgelabz.H2.Database.and.Validation.Model.Message;
import com.bridgelabz.H2.Database.and.Validation.Repository.MessageRepo;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;

    public Message addMessage(MessageDTO messageDTO) {
        Message messageData =new Message(messageDTO);
        return messageRepo.save(messageData);
    }

    public Message getById(int id) {
        return messageRepo.findById(id).orElseThrow(() -> new CustomException("Message With Id:"+id + " Not Present"));
    }

    public Message updateMessage(int id, MessageDTO messageDTO) {
        Message messageData = getById(id);
        if (messageData != null){
            messageData.updateMessage(messageDTO);
            return messageRepo.save(messageData);
        }
        return null;
    }

    public List<Message> findAll() {
        return messageRepo.findAll();
    }

    public boolean deleteMessage(int id) {
        // Check if the message exists
        if (messageRepo.existsById(id)) {
            messageRepo.deleteById(id);
            return true; // Deletion successful
        }
        return false; // Message not found
    }

}
