package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.BookTicketRequestDto;
import com.example.bookMyShow.dto.ResponseDto.TicketResponseDto;
import com.example.bookMyShow.dto.TicketDto;

public interface TicketService {

    TicketResponseDto getTicket(int id);

    TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
