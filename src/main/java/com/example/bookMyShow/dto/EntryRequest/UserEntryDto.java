package com.example.bookMyShow.dto.EntryRequest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {
    String name;
    String mobNo;
}
