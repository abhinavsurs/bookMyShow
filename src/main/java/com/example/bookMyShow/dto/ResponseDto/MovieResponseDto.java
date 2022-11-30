package com.example.bookMyShow.dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class MovieResponseDto {
    int id;
    String name;
    LocalDate releaseDate;

    //
    List<ShowResponseDto> showDtoList;
}
