package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.MovieDto;
import com.example.bookMyShow.model.MovieEntity;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class MovieConvertor {
    public static MovieEntity convertDtoToEntity(MovieDto movieDto){

        return MovieEntity.builder().id(movieDto.getId()).name(movieDto.getName())
                .releaseDate(movieDto.getReleaseDate()).build();
                    }


    public static MovieDto convertEntityToDto(MovieEntity movieEntity){

        return MovieDto.builder().id(movieEntity.getId()).name(movieEntity.getName())
                .releaseDate(movieEntity.getReleaseDate()).build();
    }

}
