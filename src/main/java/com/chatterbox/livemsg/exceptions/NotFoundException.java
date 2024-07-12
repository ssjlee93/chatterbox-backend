package com.chatterbox.livemsg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such data")
public class NotFoundException extends RuntimeException {

    public NotFoundException(String orderId) {
        super(orderId + " not found");
    }
}
