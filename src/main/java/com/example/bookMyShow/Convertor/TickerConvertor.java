package com.example.bookMyShow.Convertor;

import com.example.bookMyShow.dto.ResponseDto.TicketResponseDto;
import com.example.bookMyShow.dto.TicketDto;
import com.example.bookMyShow.model.TicketEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TickerConvertor {

    public static TicketEntity convertDtoToEntity(TicketDto ticketDto){

        return TicketEntity.builder().id(ticketDto.getId()).allottedSeats(ticketDto.getAllotedSeats())
                .amount(ticketDto.getAmount()).build();
    }

    public static TicketResponseDto convertEntityToDto(TicketEntity ticketEntity){
         return TicketResponseDto.builder().id(ticketEntity.getId()).amount(ticketEntity
                 .getAmount()).alltoedSeats(ticketEntity.getAllottedSeats()).build();
    }
}
