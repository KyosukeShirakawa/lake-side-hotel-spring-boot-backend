package com.lake_side_hotel.lake_side_hotel.service;

import com.lake_side_hotel.lake_side_hotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface IRoomService {
    Room addRoom(String roomType, BigDecimal roomPrice) throws SQLException, IOException;

//    Room addRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;

//    List<Room> getRooms();
}
