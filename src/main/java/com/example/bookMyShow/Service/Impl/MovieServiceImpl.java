package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.MovieConvertor;
import com.example.bookMyShow.Repository.MovieRepository;
import com.example.bookMyShow.Service.MovieService;
import com.example.bookMyShow.dto.EntryRequest.MovieEntryDto;
import com.example.bookMyShow.dto.ResponseDto.MovieResponseDto;
import com.example.bookMyShow.model.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;


public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {

       // if movie is already created then we can throw an exception... movie already exists.

        MovieEntity movieEntity=MovieConvertor.convertDtoToEntity(movieEntryDto);
        movieEntity=movieRepository.save(movieEntity);


        // convert the movieDto to movieEntity


        MovieResponseDto movieResponseDto=MovieConvertor.convertEntityToDto(movieEntity);

       return movieResponseDto;
    }

    @Override
    public MovieResponseDto getMovie(int id) {

        // finding movieEntity and converting to movieDto
        MovieEntity movieEntity=movieRepository.findById(id).get();

        MovieResponseDto movieResponseDto=MovieConvertor.convertEntityToDto(movieEntity);

        return movieResponseDto;
    }
}
