package com.example.bookMyShow.Service;

import com.example.bookMyShow.dto.ShowDto;

public interface ShowService {

    ShowDto addShow(ShowDto showDto);

    ShowDto getShow(int id);


}
