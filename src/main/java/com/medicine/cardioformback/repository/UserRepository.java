package com.medicine.cardioformback.repository;

import com.medicine.cardioformback.model.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DoctorEntity, Long > {

}
