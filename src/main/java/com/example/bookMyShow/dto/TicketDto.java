package com.example.bookMyShow.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    int id;

    String allotedSeats;

    double amount;

    ShowDto showDto;

    UserDto userDto;
}
