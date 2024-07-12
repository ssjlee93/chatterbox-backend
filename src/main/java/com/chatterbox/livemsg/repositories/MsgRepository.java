package com.chatterbox.livemsg.repositories;

import com.chatterbox.livemsg.entities.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends MongoRepository<Message, String> {
    public Message findByMsg_id();
}
