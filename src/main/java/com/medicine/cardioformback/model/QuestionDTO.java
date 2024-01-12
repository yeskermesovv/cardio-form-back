package com.medicine.cardioformback.model;

import lombok.Data;

import java.util.Set;

@Data
public class QuestionDTO {
    private Long id;
    private Integer mark;
    private Integer doctorId;
    private String fileName;
    private String imageId;
    private String epoch;
    private String imageType;
    private Set<String> tags;
}
