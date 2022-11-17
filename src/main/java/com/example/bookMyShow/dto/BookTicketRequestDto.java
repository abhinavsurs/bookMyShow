package com.example.bookMyShow.dto;

import com.example.bookMyShow.Enums.SeatType;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class BookTicketRequestDto {

    Set<String> requestedSeats; // user will give

    int id;

    int showId;

    SeatType seatType;
}
