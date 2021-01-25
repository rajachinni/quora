package com.teamtwo.quora.quorasocial.services;

import com.teamtwo.quora.quorasocial.Entity.Answer;
import com.teamtwo.quora.quorasocial.dto.AnswerDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswerService {


    void addAnswer(int questionId,String userId,String answerString);
    Answer findById(int questionId);
    Answer save(Answer answer);
    List<AnswerDto> getAnswerDto(String userId, int questionId);

}
