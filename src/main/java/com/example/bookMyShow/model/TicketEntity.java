package com.example.bookMyShow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="alloted_seats",nullable = false)
    private String allottedSeats;

    @Column(name="amount",nullable = false)
    private double amount;

    @CreatedDate
    @Column(name="booked_at",nullable = false)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private UserEntity user;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;

}
