package com.medicine.cardioformback.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
@Data
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mark")
    private Integer mark;

    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "image_id")
    private String imageId;

    @Column(name = "epoch")
    private String epoch;

    @Column(name = "image_type")
    private String imageType;

    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(
            name = "question_tag",
            joinColumns = { @JoinColumn(name = "question_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") }
    )
    private Set<TagEntity> tags;
}

