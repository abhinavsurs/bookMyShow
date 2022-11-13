package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.UserDto;

import com.example.bookMyShow.model.UserEntity;
import lombok.experimental.UtilityClass;


public class UserConvertor {
    public static UserEntity convertDtoToEntity(UserDto userDto){
        // we are creating userEntity

        return UserEntity.builder().id(userDto.getId()).name(userDto.getName())
                .mobileNo(userDto.getMobileNo()).build();

    }

    public static UserDto convertEntityToDto(UserEntity userEntity){

        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName())
                .mobileNo(userEntity.getMobileNo()).build();
    }
}
