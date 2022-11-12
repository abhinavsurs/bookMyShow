package com.example.bookMyShow.model;

import com.example.bookMyShow.Enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "seat_number",nullable = false)
    private String seatNumber;

    @Column(name = "rate",nullable = false)
    private int rate;


    @Column(name = "seat_type")
    private SeatType seatType;


    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;

}
