package com.example.bookMyShow.dto.ResponseDto;

import com.example.bookMyShow.Enums.TheaterType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {
    int id;
    String name;
    String address;
    String city;
    TheaterType type;
}
