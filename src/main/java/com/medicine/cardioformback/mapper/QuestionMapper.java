//package com.medicine.cardioformback.mapper;
//
//import com.medicine.cardioformback.model.QuestionDTO;
//import com.medicine.cardioformback.model.QuestionEntity;
//import com.medicine.cardioformback.model.TagEntity;
//
//import java.util.stream.Collectors;
//
//public class QuestionMapper {
//
//    public static QuestionEntity toEntity(QuestionDTO questionDTO) {
//        if (questionDTO == null) {
//            return null;
//        }
//
//        QuestionEntity questionEntity = new QuestionEntity();
//        questionEntity.setId(questionDTO.getId());
//        questionEntity.setMark(questionDTO.getMark());
//        questionEntity.setDoctorId(questionDTO.getDoctorId());
//        questionEntity.setFileName(questionDTO.getFileName());
//        questionEntity.setImageId(questionDTO.getImageId());
//        questionEntity.setEpoch(questionDTO.getEpoch());
//        questionEntity.setImageType(questionDTO.getImageType());
//
//        if (questionDTO.getTags() != null) {
//            questionEntity.setTags(
//                    questionDTO.getTags().stream()
//                            .map(tagDTO -> {
//                                TagEntity tagEntity = new TagEntity();
//                                tagEntity.setId(tagDTO.getId());
//                                tagEntity.setName(tagDTO.getName());
//                                return tagEntity;
//                            })
//                            .collect(Collectors.toSet())
//            );
//        }
//
//        return questionEntity;
//    }
//}
//
