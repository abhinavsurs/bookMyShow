package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.UserDto;

public interface UserService {
   // Designig Part
   void addUser(UserDto userDto);
    UserDto getUser(int id);
}
