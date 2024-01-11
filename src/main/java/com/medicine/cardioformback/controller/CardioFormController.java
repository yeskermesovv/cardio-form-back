package com.medicine.cardioformback.controller;

import com.medicine.cardioformback.model.DoctorEntity;
import com.medicine.cardioformback.service.CardioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CardioFormController {

    private final CardioService cardioService;

    @GetMapping
    public String test() {
        return "Hello World";
    }

    @GetMapping("/users")
    public ResponseEntity<?> findAllUsers() {
        return ResponseEntity.ok(cardioService.findAllDoctors());
    }


    @PostMapping("/users")
    public ResponseEntity<?> saveUser(@RequestBody DoctorEntity doctorEntity) {
        return ResponseEntity.ok(cardioService.saveUser(doctorEntity));
    }
}
