package com.chatterbox.backend.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("messages")
@Data
public class Message {

    @Id // using Spring data annotation because jakarta is used for relational databases
    private String msg_id;
    private String sender_id;
    private String content;
    @UpdateTimestamp
    private LocalDateTime updated_time;
    @CreationTimestamp
    private LocalDateTime created_time;


}
