package com.website.demo.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.*;
//
//@Data
//@Entity
//@Table(name = "Tickets")
//public class Ticket {
//    @Id
//    @GeneratedValue
//    private int id;
//    private double amount;
//    private String catagory;
//
//}


import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @GeneratedValue
    private int id;
    private double amount;
    private String catagory;


}
