package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.EntryRequest.MovieEntryDto;
import com.example.bookMyShow.dto.ResponseDto.MovieResponseDto;
import com.example.bookMyShow.model.MovieEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConvertor {
    public static MovieEntity convertDtoToEntity(MovieEntryDto movieEntryDto){

        return MovieEntity.builder().name(movieEntryDto.getName())
                .releaseDate(movieEntryDto.getReleaseDate()).build();
                    }


    public static MovieResponseDto convertEntityToDto(MovieEntity movieEntity){

        return MovieResponseDto.builder().id(movieEntity.getId()).name(movieEntity.getName())
                .releaseDate(movieEntity.getReleaseDate()).build();
    }

}
