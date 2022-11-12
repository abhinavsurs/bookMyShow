package com.example.bookMyShow.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    int id;

    String name;
    String mobileNo;
}
