package dev.stella.appi_ticket.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found")
public class UserNotFoundException extends UserException {
    public UserNotFoundException(String message){
        super(message);

    }
    public UserNotFoundException(String message, Throwable cause){
        super(message,cause);
    }
}
