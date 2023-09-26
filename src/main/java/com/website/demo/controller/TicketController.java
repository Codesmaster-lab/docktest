package com.website.demo.controller;


import com.website.demo.dao.TicketDao;


import java.util.List;

import com.website.demo.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @GetMapping("/test")
    public String test()
    {
        return "Success";
    }

    @Autowired
    public final TicketDao dao;
    public  TicketController(TicketDao dao){
        this.dao=dao;
    }


    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets) {
        for(int i=0;i<tickets.size();i++)
            dao.save(tickets.get(i));

        return "ticket booked : " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>) dao.findAll();
    }

}