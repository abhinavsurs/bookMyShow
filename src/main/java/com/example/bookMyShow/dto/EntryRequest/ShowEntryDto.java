package com.example.bookMyShow.dto.EntryRequest;

import com.example.bookMyShow.dto.ResponseDto.MovieResponseDto;
import com.example.bookMyShow.dto.ResponseDto.TheaterResponseDto;
import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder

public class ShowEntryDto {

    @NotNull
    LocalDate showDate;

    @NotNull
    LocalTime showTime;

    @NotNull
    MovieResponseDto movieResponseDto;

    @NotNull
    TheaterResponseDto theaterResponseDto;
}
