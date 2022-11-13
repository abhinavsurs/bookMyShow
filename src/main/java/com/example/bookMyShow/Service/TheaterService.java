package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.TheaterDto;

public interface TheaterService {

    TheaterDto addTheater(TheaterDto theaterDto);

    TheaterDto getTheater(int id);

}
