package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.TheaterConvertor;
import com.example.bookMyShow.Enums.SeatType;
import com.example.bookMyShow.Repository.TheaterRepository;
import com.example.bookMyShow.Repository.TheaterSeatRepository;
import com.example.bookMyShow.Service.TheaterService;
import com.example.bookMyShow.dto.EntryRequest.TheaterEntryDto;
import com.example.bookMyShow.dto.ResponseDto.TheaterResponseDto;
import com.example.bookMyShow.model.TheaterEntity;
import com.example.bookMyShow.model.TheaterSeatEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    @Override
    public TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto) {
        TheaterEntity theaterEntity= TheaterConvertor.convertDtoToEntity((theaterEntryDto));

        // creating seats
      List<TheaterSeatEntity>seats = createTheaterSeats();


        // setting theaterId for all these seats

        for(TheaterSeatEntity theaterSeatEntity:seats){
            theaterSeatEntity.setTheater(theaterEntity);
        }
        theaterRepository.save(theaterEntity);

        TheaterResponseDto theaterResponseDto=TheaterConvertor.convertEntityToDto(theaterEntity);

        return theaterResponseDto;
    }

    public List<TheaterSeatEntity> createTheaterSeats(){

        List<TheaterSeatEntity> seats=new ArrayList<>();
        seats.add(getTheaterSeat("1A",100,SeatType.ClassicSeat));
        seats.add(getTheaterSeat("1B",100,SeatType.ClassicSeat));
        seats.add(getTheaterSeat("1C",100,SeatType.ClassicSeat));
        seats.add(getTheaterSeat("1D",100,SeatType.ClassicSeat));
        seats.add(getTheaterSeat("1E",100,SeatType.ClassicSeat));

        seats.add(getTheaterSeat("2A",200,SeatType.Premium));
        seats.add(getTheaterSeat("2B",200,SeatType.Premium));
        seats.add(getTheaterSeat("2C",200,SeatType.Premium));
        seats.add(getTheaterSeat("2D",200,SeatType.Premium));
        seats.add(getTheaterSeat("2E",200,SeatType.Premium));
        theaterSeatRepository.saveAll(seats);

        return seats;
    }

    TheaterSeatEntity getTheaterSeat(String seatName, int rate, SeatType seatType){
        // building TheaterSeats
        return TheaterSeatEntity.builder().seatNumber(seatName).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheaterResponseDto getTheater(int id) {
        // finding theaterEntity and converting it to TheaterDto
        TheaterEntity theaterEntity=theaterRepository.findById(id).get();

        TheaterResponseDto theaterResponseDto=TheaterConvertor.convertEntityToDto(theaterEntity);

        return theaterResponseDto;
    }
}
