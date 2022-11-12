package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.UserDto;
import com.example.bookMyShow.model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConvertor {
    public static UserEntity convertDtoToEntity(UserDto userDto){
        // we are creating user
        return UserEntity.builder().name(userDto.getName()).mobileNo(userDto.getMobileNo()).build();
    }

    public static UserDto convertEntityToDto(UserEntity userEntity){

        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName())
                .mobileNo(userEntity.getMobileNo()).build();
    }
}
