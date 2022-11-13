package com.example.bookMyShow.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterDto {

    int id;
    String name;
    String city;
    String address;

    ShowDto showDto;
}
