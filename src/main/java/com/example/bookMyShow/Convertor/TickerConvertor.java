package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.TicketDto;
import com.example.bookMyShow.model.TicketEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TickerConvertor {

    public static TicketEntity convertDtoToEntity(TicketDto ticketDto){

        return TicketEntity.builder().id(ticketDto.getId()).allottedSeats(ticketDto.getAllotedSeats())
                .amount(ticketDto.getAmount()).build();
    }

    public static TicketDto convertEntityToDto(TicketEntity ticketEntity){
         return TicketDto.builder().id(ticketEntity.getId()).amount(ticketEntity
                 .getAmount()).allotedSeats(ticketEntity.getAllottedSeats()).build();
    }
}
