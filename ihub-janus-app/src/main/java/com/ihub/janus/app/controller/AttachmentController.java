package com.ihub.janus.app.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.ihub.janus.app.config.Constants;
import com.ihub.janus.app.service.AttachmentService;
import com.ihub.janus.data.entity.Attachment;
import com.ihub.janus.data.entity.Message;
import com.ihub.janus.data.view.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping(value = "/", headers = Constants.ApiVersion.V1)
    @JsonView(Views.Role.class)
    public ResponseEntity<Attachment> create(@Valid @RequestBody Attachment attachment) {

        Attachment obj = attachmentService.create(attachment);

        return new ResponseEntity<Attachment>(obj, HttpStatus.OK);
    }
}
