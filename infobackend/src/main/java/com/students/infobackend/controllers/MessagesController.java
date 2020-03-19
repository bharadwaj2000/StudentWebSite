package com.students.infobackend.controllers;

import com.students.infobackend.dao.MessagesDao;
import com.students.infobackend.models.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class MessagesController {

    @Autowired
    public MessagesDao messagesDao;

    @PostMapping(path = "/messages/post")
    public @ResponseBody
    Messages addMessage(@RequestBody Messages message){
        messagesDao.save(message);
        return message;
    }
}
