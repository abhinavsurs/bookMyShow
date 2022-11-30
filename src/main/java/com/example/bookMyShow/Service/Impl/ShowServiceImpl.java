package com.example.bookMyShow.Service.Impl;

import com.example.bookMyShow.Convertor.ShowConvertor;
import com.example.bookMyShow.Repository.MovieRepository;
import com.example.bookMyShow.Repository.ShowRepository;
import com.example.bookMyShow.Repository.ShowSeatsRepository;
import com.example.bookMyShow.Repository.TheaterRepository;
import com.example.bookMyShow.Service.ShowService;
import com.example.bookMyShow.dto.EntryRequest.ShowEntryDto;
import com.example.bookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.bookMyShow.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShowServiceImpl implements ShowService {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    ShowSeatsRepository showSeatsRepository;

    @Autowired
    ShowRepository showRepository;


    @Override
    public ShowResponseDto addShow(ShowEntryDto showEntryDto) {

        ShowEntity showEntity= ShowConvertor.convertDtoToEntity(showEntryDto);
        // we have made the partial show entity object
        // now we need to set the movie and the theater entities not DTO's

        // movie Entity

        MovieEntity movieEntity =movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();

        // TheaterEntity
        TheaterEntity theaterEntity=theaterRepository.findById(showEntryDto.getTheaterResponseDto()
                .getId()).get();

        // we need to pass the list of theater seats

        generateShowEntitySeats(theaterEntity.getSeats(),showEntity);
        showRepository.save(showEntity);

        ShowResponseDto showResponseDto=ShowConvertor.convertEntityToDto(showEntity);


        return showResponseDto;
    }
    public void generateShowEntitySeats(List<TheaterSeatEntity>theaterSeatEntityList,ShowEntity showEntity){

        List<ShowSeatsEntity>showSeatEnitiyList=new ArrayList<>();

        for(TheaterSeatEntity tse:theaterSeatEntityList) {
            // we will create showseat enitiy

            ShowSeatsEntity showSeatsEntity = ShowSeatsEntity.builder().seatNumber(tse.getSeatNumber())
                    .seatType(tse.getSeatType()).rate(tse.getRate()).build();

            showSeatEnitiyList.add(showSeatsEntity);
        }

            // we need to set the show Entity for each of the ShowSeat
            for(ShowSeatsEntity showSeatsEntity:showSeatEnitiyList){
                showSeatsEntity.setShow(showEntity);
            }

            showSeatsRepository.saveAll(showSeatEnitiyList);
        }


    @Override
    public ShowResponseDto getShow(int id) {
        ShowEntity showEntity=showRepository.findById(id).get();

        ShowResponseDto showResponseDto=ShowConvertor.convertEntityToDto(showEntity);
        return showResponseDto;
    }
}
