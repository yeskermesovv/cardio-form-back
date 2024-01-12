package com.medicine.cardioformback.repository;

import com.medicine.cardioformback.model.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long > {

}
