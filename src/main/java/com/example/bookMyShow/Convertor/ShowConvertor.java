package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.ShowDto;
import com.example.bookMyShow.model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConvertor {

    public static ShowEntity convertDtoToEntity(ShowDto showDto){

        return ShowEntity.builder().showDate(showDto.getShowDate()).showTime(showDto.getShowTime())
                .build();
    }

    public static ShowDto convertEntityToDto(ShowEntity showEntity){

        return ShowDto.builder().id(showEntity.getId()).showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate()).build();
    }
}
