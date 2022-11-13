package com.example.bookMyShow.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="mobile",nullable = false)
    private String mobileNo;

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)

    private List<TicketEntity> listOfTickets;



}
