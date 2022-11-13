package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.MovieDto;

public interface MovieService {

    // Add movie

    MovieDto addMovie(MovieDto movieDto);

    // get movie
    MovieDto getMovie(int id);
}
