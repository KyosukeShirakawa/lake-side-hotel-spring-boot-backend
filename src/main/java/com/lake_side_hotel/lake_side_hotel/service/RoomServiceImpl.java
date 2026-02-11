package com.lake_side_hotel.lake_side_hotel.service;

import com.lake_side_hotel.lake_side_hotel.dtos.BookingDto;
import com.lake_side_hotel.lake_side_hotel.dtos.RoomDto;
import com.lake_side_hotel.lake_side_hotel.model.Room;
import com.lake_side_hotel.lake_side_hotel.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements IRoomService{

    @Autowired
    private final RoomRepository roomRepository;

//    @Override
//    public List<Room> getRooms() {
//        return roomRepository.findAll().stream().map((room) -> {
//                return new RoomDto(room.getId(), room.getRoomType(), room.getRoomPrice());
//        }).collect(Collectors.toList());
//    }

    @Override
    public Room addRoom(String roomType, BigDecimal roomPrice) throws SQLException, IOException {

        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
//        if(!photo.isEmpty()) {
//            byte[] photoBytes = photo.getBytes();
//            Blob photoBlob = new SerialBlob(photoBytes);
//        }

        return roomRepository.save(room);
    }
}
