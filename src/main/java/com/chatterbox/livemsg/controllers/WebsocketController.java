package com.chatterbox.livemsg.controllers;

import com.chatterbox.livemsg.dto.Msg;
import com.chatterbox.livemsg.entities.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/*
    * This class is a controller for the websocket.
 */
@Controller
@Slf4j
public class WebsocketController {
    @MessageMapping("/chat")
    @SendTo("/topic/message")
    public Msg chat(Msg msg) throws Exception {
        log.info("starting WebsocketController - chat()");
        log.info("Received {} from {}", msg.getText(), msg.getFrom());
        return new Msg("System", String.format("Hello, returning your message : {}", msg.getText()));
    }
}
