package com.example.bookMyShow.dto;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    int id;
    LocalDate showDate;

    LocalTime showTime;


    MovieDto movieDto;

    TheaterDto theaterDto;

}
