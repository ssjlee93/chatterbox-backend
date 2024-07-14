package com.chatterbox.livemsg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Msg {
    private String from;
    private String text;
}
