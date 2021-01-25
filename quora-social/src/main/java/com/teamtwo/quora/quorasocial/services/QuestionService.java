package com.teamtwo.quora.quorasocial.services;

import com.teamtwo.quora.quorasocial.Entity.Question;
import com.teamtwo.quora.quorasocial.dto.QuestionDto;
import org.springframework.data.repository.query.Param;

public interface QuestionService {


    void addQuestion(String userId,String categoryId, String questionString);

    Question findById(int questionId);

    Question save(Question question);

    QuestionDto getQuestionDto(String userId, int questionId);

}
