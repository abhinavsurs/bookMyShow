package com.example.bookMyShow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name",nullable = false)
    private String name;

    @Column(name="release_date",columnDefinition = "DATE",nullable = false)
    private LocalDate releaseDate;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    List<ShowEntity> shows;
}
