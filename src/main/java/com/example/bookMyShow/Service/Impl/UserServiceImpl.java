package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.UserConvertor;
import com.example.bookMyShow.Repository.UserRepository;
import com.example.bookMyShow.Service.UserService;
import com.example.bookMyShow.dto.EntryRequest.UserEntryDto;
import com.example.bookMyShow.dto.ResponseDto.UserResponseDto;
import com.example.bookMyShow.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntryDto) {

        UserEntity userEntity= UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

    }

    @Override
    public UserResponseDto getUser(int id) {

        UserEntity user =new UserEntity();
        UserEntity userEntity=userRepository.findById(id).get();

        UserResponseDto userResponseDto =UserConvertor.convertEntityToDto(userEntity);
        return userResponseDto;
    }
}
