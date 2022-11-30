package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.TickerConvertor;
import com.example.bookMyShow.Repository.ShowRepository;
import com.example.bookMyShow.Repository.TicketRepository;
import com.example.bookMyShow.Repository.UserRepository;
import com.example.bookMyShow.Service.TicketService;
import com.example.bookMyShow.dto.BookTicketRequestDto;
import com.example.bookMyShow.dto.ResponseDto.TicketResponseDto;
import com.example.bookMyShow.dto.TicketDto;
import com.example.bookMyShow.model.ShowEntity;
import com.example.bookMyShow.model.ShowSeatsEntity;
import com.example.bookMyShow.model.TicketEntity;
import com.example.bookMyShow.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TicketServiceImpl implements TicketService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public TicketResponseDto getTicket(int id) {

        TicketEntity ticketEntity= ticketRepository.findById(id).get();

        TicketResponseDto ticketResponseDto =TickerConvertor.convertEntityToDto(ticketEntity);

        return  ticketResponseDto;

    }

    @Override
    public TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {

        UserEntity userEntity= userRepository.findById(bookTicketRequestDto.getId()).get();

        ShowEntity showEntity=showRepository.findById(bookTicketRequestDto.getId()).get();

        Set<String> requestedSeats=bookTicketRequestDto.getRequestedSeats();

        List<ShowSeatsEntity>showSeatsEntityList=showEntity.getSeats();

        List<ShowSeatsEntity>bookedSeats=showSeatsEntityList
                .stream().filter(seat ->seat.getSeatType().equals(bookTicketRequestDto.getSeatType())
                        &&!seat.isBooked()&& requestedSeats.contains(seat.getSeatNumber()))
                .collect(Collectors.toList());

        // option 2

//        List<ShowSeatsEntity>bookedSeats1=new ArrayList<>();
//
//        for(ShowSeatsEntity seat:showSeatsEntityList){
//            if(!seat.isBooked()&& seat.getSeatType().equals(bookTicketRequestDto.getSeatType())
//            && requestedSeats.contains(seat.getSeatNumber()))
//            {
//                bookedSeats1.add(seat);
//            }
//        }
//

        if(bookedSeats.size()!=requestedSeats.size()){
            throw new Error("All Seats not available");
        }

        // step 2 building ticket Entity

        TicketEntity ticketEntity=TicketEntity.builder().user(userEntity).show(showEntity).seats(bookedSeats)
                .build();

        // step 3

        double amount=0;
        for(ShowSeatsEntity showSeatsEntity:bookedSeats){
            showSeatsEntity.setBooked(true);
            showSeatsEntity.setBookedAt(new Date());
            showSeatsEntity.setTicket(ticketEntity);

            amount+=showSeatsEntity.getRate();
        }
        ticketEntity.setAllottedSeats(bookedSeats.toString());
        ticketEntity.setAmount(amount);

        ticketRepository.save(ticketEntity);

        return TickerConvertor.convertEntityToDto(ticketEntity);


    }
}
