package com.chatterbox.livemsg.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("messages")
@Data
@Builder
public class Message {

    @Id // using Spring data annotation because jakarta is used for relational databases
    private String msg_id;
    private String sender_id;
    private String content;
    private LocalDateTime updated_time;
    @CreatedDate
    private LocalDateTime created_time;


}
