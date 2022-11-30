package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.EntryRequest.UserEntryDto;
import com.example.bookMyShow.dto.ResponseDto.UserResponseDto;

public interface UserService {
   // Designig Part
   void addUser(UserEntryDto userDto);
    UserResponseDto getUser(int id);
}
