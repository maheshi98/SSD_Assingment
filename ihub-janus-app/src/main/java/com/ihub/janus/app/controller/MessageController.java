package com.ihub.janus.app.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.ihub.janus.app.config.Constants;
import com.ihub.janus.app.service.MessageService;
import com.ihub.janus.app.service.UserService;
import com.ihub.janus.data.entity.Message;
import com.ihub.janus.data.entity.User;
import com.ihub.janus.data.view.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/message")
public class MessageController {

    /** The user service. */
    @Autowired
    private MessageService messageService;

    @PostMapping(value = "/", headers = Constants.ApiVersion.V1)
    @JsonView(Views.Role.class)
    public ResponseEntity<Message> create(@Valid @RequestBody Message message) {

        Message obj = messageService.create(message);

        return new ResponseEntity<Message>(obj, HttpStatus.OK);
    }

}
