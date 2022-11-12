package com.example.bookMyShow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @Column(name="show_Date",columnDefinition ="DATE",nullable = false)
    private LocalDate showDate;
    @Column(name="show_time",columnDefinition = "TIME",nullable = false)
    private LocalTime showTime;
    @Column(name = "created_At")
    private Date createdAt;
    @Column(name = "updated_At")
    private Date updatedAt;

    @ManyToOne
    @JsonIgnore
    private MovieEntity movie;

    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TicketEntity> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity>seats;
}
