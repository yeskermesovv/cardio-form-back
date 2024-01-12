package com.medicine.cardioformback.repository;

import com.medicine.cardioformback.model.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long > {

}
