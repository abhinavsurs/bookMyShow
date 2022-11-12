package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.UserConvertor;
import com.example.bookMyShow.Repository.UserRepository;
import com.example.bookMyShow.Service.UserService;
import com.example.bookMyShow.dto.UserDto;
import com.example.bookMyShow.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {

        UserEntity userEntity= UserConvertor.convertDtoToEntity(userDto);

        userRepository.save(userEntity);

    }

    @Override
    public UserDto getUser(int id) {

        UserEntity user =new UserEntity();
        UserEntity userEntity=userRepository.findById(id).get();

        UserDto userDto =UserConvertor.convertEntityToDto(userEntity);
        return userDto;
    }
}
