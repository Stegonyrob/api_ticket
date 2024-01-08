package dev.stella.appi_ticket.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

   @GetMapping("/ticket")
   public String getTicket() {
       return "Hello, Ticket!";
   }
}
