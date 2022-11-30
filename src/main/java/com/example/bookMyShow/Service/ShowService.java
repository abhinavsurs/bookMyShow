package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.EntryRequest.ShowEntryDto;
import com.example.bookMyShow.dto.ResponseDto.ShowResponseDto;

public interface ShowService {



    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    ShowResponseDto getShow(int id);


}
