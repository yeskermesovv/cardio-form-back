package com.medicine.cardioformback.service;

import com.medicine.cardioformback.model.DoctorEntity;
import com.medicine.cardioformback.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardioService {

    private final UserRepository userRepository;

    public DoctorEntity saveUser(DoctorEntity doctorEntity) {
        return userRepository.save(doctorEntity);
    }

    public List<DoctorEntity> findAllDoctors() {
        return userRepository.findAll();
    }
}
