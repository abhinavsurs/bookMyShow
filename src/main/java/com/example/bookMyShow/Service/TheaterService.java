package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.EntryRequest.TheaterEntryDto;
import com.example.bookMyShow.dto.ResponseDto.TheaterResponseDto;

public interface TheaterService {

    TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto);

    TheaterResponseDto getTheater(int id);

}
