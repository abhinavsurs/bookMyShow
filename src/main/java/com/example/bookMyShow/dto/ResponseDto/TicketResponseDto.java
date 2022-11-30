package com.example.bookMyShow.dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketResponseDto {
    int id;

    String alltoedSeats;
    double amount;
}
