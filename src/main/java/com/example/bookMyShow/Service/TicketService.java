package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.BookTicketRequestDto;
import com.example.bookMyShow.dto.TicketDto;

public interface TicketService {

    TicketDto getTicket(int id);

    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
