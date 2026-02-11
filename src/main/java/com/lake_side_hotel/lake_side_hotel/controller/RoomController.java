package com.lake_side_hotel.lake_side_hotel.controller;

import com.lake_side_hotel.lake_side_hotel.dtos.RoomDto;
import com.lake_side_hotel.lake_side_hotel.model.Room;
import com.lake_side_hotel.lake_side_hotel.repository.RoomRepository;
import com.lake_side_hotel.lake_side_hotel.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final IRoomService roomService;


//    @GetMapping
//    public ResponseEntity<List<RoomDto>> getRooms() {
//        return ResponseEntity<List<RoomDto>>(getRooms());
//    }

    @PostMapping("/add/new-room")
    public ResponseEntity<RoomDto> addRoom(@RequestBody RoomDto roomDto) throws SQLException, IOException {

        Room savedRoom = roomService.addRoom(roomDto.getRoomType(), roomDto.getRoomPrice());
        RoomDto responseDto = new RoomDto(savedRoom.getId(), savedRoom.getRoomType(), savedRoom.getRoomPrice());

        return ResponseEntity.ok(responseDto);
    }
}
