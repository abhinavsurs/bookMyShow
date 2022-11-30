package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.EntryRequest.TheaterEntryDto;
import com.example.bookMyShow.dto.ResponseDto.TheaterResponseDto;
import com.example.bookMyShow.model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConvertor {

    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().name(theaterEntryDto.getName())
                .city(theaterEntryDto.getCity()).address(theaterEntryDto.getAddress()).build();
    }

    public static TheaterResponseDto convertEntityToDto(TheaterEntity theaterEntity){

        return TheaterResponseDto.builder().id(theaterEntity.getId()).name(theaterEntity.getName())
                .city(theaterEntity.getCity()).address(theaterEntity.getAddress()).build();
    }
}
