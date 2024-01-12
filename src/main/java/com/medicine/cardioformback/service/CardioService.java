package com.medicine.cardioformback.service;

import com.medicine.cardioformback.model.DoctorEntity;
import com.medicine.cardioformback.model.QuestionEntity;
import com.medicine.cardioformback.model.QuestionRequest;
import com.medicine.cardioformback.repository.QuestionRepository;
import com.medicine.cardioformback.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CardioService {

    private final UserRepository userRepository;
    private final QuestionRepository questionRepository;

    public DoctorEntity saveUser(DoctorEntity doctorEntity) {
        return userRepository.save(doctorEntity);
    }

    public List<DoctorEntity> findAllDoctors() {
        return userRepository.findAll();
    }

    public Object saveQuestions(QuestionRequest request) {
        questionRepository.saveAll(request.getQuestions());
        log.info("questionss", request);
        return null;
    }
}
