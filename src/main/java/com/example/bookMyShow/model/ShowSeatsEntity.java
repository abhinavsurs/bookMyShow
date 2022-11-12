package com.example.bookMyShow.model;

import com.example.bookMyShow.Enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seat_number",nullable = false)
    private String seatNumber;

    @Column(name = "rate",nullable = false)
    private int rate;

    @Column(name="seat_type",nullable = false)
    private SeatType seatType;

    @Column(name="is_booked",columnDefinition = "bit(1) default 0",nullable = false)
    private boolean booked;

    @Column(name = "booked_at")
    private Date bookedAt;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;
    @ManyToOne
    @JsonIgnore
    private TicketEntity ticket;
}
