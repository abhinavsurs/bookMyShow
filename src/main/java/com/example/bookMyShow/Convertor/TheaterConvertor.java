package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.TheaterDto;
import com.example.bookMyShow.model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConvertor {

    public static TheaterEntity convertDtoToEntity(TheaterDto theaterDto){

        return TheaterEntity.builder().id(theaterDto.getId()).name(theaterDto.getName())
                .city(theaterDto.getCity()).address(theaterDto.getAddress()).build();
    }

    public static TheaterDto convertEntityToDto(TheaterEntity theaterEntity){

        return TheaterDto.builder().id(theaterEntity.getId()).name(theaterEntity.getName())
                .city(theaterEntity.getCity()).address(theaterEntity.getAddress()).build();
    }
}
