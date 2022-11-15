package com.ihub.janus.app.service;

import com.ihub.janus.data.entity.Attachment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface AttachmentService {

    Attachment create(Attachment attachment);
}
