package com.example.bookMyShow.dto;

import com.example.bookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.bookMyShow.dto.ResponseDto.UserResponseDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    int id;

    String allotedSeats;

    double amount;

    ShowResponseDto showDto;

    UserResponseDto userDto;
}
