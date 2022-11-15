package com.ihub.janus.data.repository;

import com.ihub.janus.data.entity.Attachment;
import com.ihub.janus.data.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
