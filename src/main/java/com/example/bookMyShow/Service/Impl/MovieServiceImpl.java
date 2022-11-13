package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.MovieConvertor;
import com.example.bookMyShow.Repository.MovieRepository;
import com.example.bookMyShow.Service.MovieService;
import com.example.bookMyShow.dto.MovieDto;
import com.example.bookMyShow.model.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;



public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieDto addMovie(MovieDto movieDto) {

        if(movieDto.getId()<0){
            throw new EntityNotFoundException("Movie can't be found");
        }


        // convert the movieDto to movieEntity


        MovieEntity movieEntity=MovieConvertor.convertDtoToEntity(movieDto);

        movieRepository.save(movieEntity);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {

        // finding movieEntity and converting to movieDto
        MovieEntity movieEntity=movieRepository.findById(id).get();

        MovieDto movieDto=MovieConvertor.convertEntityToDto(movieEntity);

        return movieDto;
    }
}
