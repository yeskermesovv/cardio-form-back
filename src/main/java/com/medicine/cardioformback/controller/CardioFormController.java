package com.medicine.cardioformback.controller;

import com.medicine.cardioformback.model.DoctorEntity;
import com.medicine.cardioformback.model.QuestionEntity;
import com.medicine.cardioformback.model.QuestionRequest;
import com.medicine.cardioformback.service.CardioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/tags")
    public ResponseEntity<?> findAllTags() {
        return ResponseEntity.ok(cardioService.findAllTags());
    }

    @PostMapping("/users")
    public ResponseEntity<?> saveUser(@RequestBody DoctorEntity doctorEntity) {
        return ResponseEntity.ok(cardioService.saveUser(doctorEntity));
    }

    @PostMapping("/questions")
    public ResponseEntity<?> saveQuestions(@RequestBody QuestionRequest request) {
        return ResponseEntity.ok(cardioService.saveQuestions(request));
    }
}
