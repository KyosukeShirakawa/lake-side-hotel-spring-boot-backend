package com.lake_side_hotel.lake_side_hotel.dtos;

import com.lake_side_hotel.lake_side_hotel.model.Room;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDto {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int NumOfAdults;
    private int NumOfChildren;
    private int totalNumOfGuests;
    private String bookingConfirmationCode;
    private Room room;

    public BookingDto(Long id, LocalDate checkInDate, LocalDate checkOutDate) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
