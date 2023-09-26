package com.website.demo.dao;

import com.website.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket,Integer> {

}
