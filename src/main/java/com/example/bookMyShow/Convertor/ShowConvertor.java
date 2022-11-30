package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.EntryRequest.ShowEntryDto;
import com.example.bookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.bookMyShow.model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConvertor {

    public static ShowEntity convertDtoToEntity(ShowEntryDto showEntryDto){

        return ShowEntity.builder().showDate(showEntryDto.getShowDate()).showTime(showEntryDto.getShowTime())
                .build();
    }

    public static ShowResponseDto convertEntityToDto(ShowEntity showEntity){

        return ShowResponseDto.builder().id(showEntity.getId()).showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate()).build();
    }
}
