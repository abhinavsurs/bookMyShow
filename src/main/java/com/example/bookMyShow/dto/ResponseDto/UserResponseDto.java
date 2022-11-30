package com.example.bookMyShow.dto.ResponseDto;

import com.example.bookMyShow.dto.TicketDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponseDto {

    int id;
    String name;
    String mobNo;

    List<TicketDto> tickets;
}
