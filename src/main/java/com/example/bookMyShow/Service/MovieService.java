package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.EntryRequest.MovieEntryDto;
import com.example.bookMyShow.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    // Add movie


   MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    // get movie
    MovieResponseDto getMovie(int id);
}
