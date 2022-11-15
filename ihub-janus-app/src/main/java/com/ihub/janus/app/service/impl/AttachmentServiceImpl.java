package com.ihub.janus.app.service.impl;

import com.ihub.janus.app.service.AttachmentService;
import com.ihub.janus.data.entity.Attachment;
import com.ihub.janus.data.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    @Override
    public Attachment create(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }
}
