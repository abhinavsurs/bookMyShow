package com.example.bookMyShow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Movie")
@Builder
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name",nullable = false)
    private String name;

    @Column(name="release_date",nullable = false)
    private LocalDate releaseDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    List<ShowEntity> shows;
}
