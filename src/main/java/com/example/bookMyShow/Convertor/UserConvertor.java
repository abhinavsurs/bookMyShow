package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.EntryRequest.UserEntryDto;
import com.example.bookMyShow.dto.ResponseDto.UserResponseDto;
import com.example.bookMyShow.model.UserEntity;


public class UserConvertor {
    public static UserEntity convertDtoToEntity(UserEntryDto userDto){
        // we are creating userEntity

        return UserEntity.builder().name(userDto.getName())
                .mobileNo(userDto.getMobNo()).build();

    }

    public static UserResponseDto convertEntityToDto(UserEntity userEntity){

        return UserResponseDto.builder().id(userEntity.getId()).name(userEntity.getName())
                .mobNo(userEntity.getMobileNo()).build();
    }
}
