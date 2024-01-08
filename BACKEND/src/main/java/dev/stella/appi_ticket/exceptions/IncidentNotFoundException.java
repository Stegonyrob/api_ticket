package dev.stella.appi_ticket.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Incident not found")

public class IncidentNotFoundException extends RuntimeException {
    


   public IncidentNotFoundException(String message) {
       super(message);
   }
}
