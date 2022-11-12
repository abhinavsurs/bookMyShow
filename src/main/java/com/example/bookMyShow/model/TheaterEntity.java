package com.example.bookMyShow.model;

import com.example.bookMyShow.Enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Theaters")
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     private int id;

    @Column(name = "name",nullable = false)
     private String name;
    @Column(name = "city",nullable = false)
     private String city;


    @Column(name = "address",nullable = false)
     private String address;


     @OneToMany(cascade = CascadeType.ALL)
     @JsonIgnore
     private List<TheaterSeatEntity> seats;
}
