package com.medicine.cardioformback.model;

import lombok.Data;

import java.util.List;

@Data
public class QuestionRequest {
    List<QuestionEntity> questions;
}
