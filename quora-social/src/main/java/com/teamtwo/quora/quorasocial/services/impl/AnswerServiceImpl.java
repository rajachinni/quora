package com.teamtwo.quora.quorasocial.services.impl;

import com.teamtwo.quora.quorasocial.Entity.Answer;
import com.teamtwo.quora.quorasocial.dto.AnswerDto;
import com.teamtwo.quora.quorasocial.repository.AnswerRepository;
import com.teamtwo.quora.quorasocial.services.AnswerService;
import com.teamtwo.quora.quorasocial.services.CommentService;
import com.teamtwo.quora.quorasocial.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    SocialService socialService;

    @Autowired
    CommentService commentService;


    @Override
    public Answer save(Answer answer){
        return  answerRepository.save(answer);
    }

    @Override
    public Answer findById(int questionId){
        return answerRepository.findById(questionId).get();
    }

    @Override
    public void addAnswer(int questionId, String userId, String answerString) {

        answerRepository.addAnswer(questionId, userId, answerString);
    }

    @Override
    public List<AnswerDto> getAnswerDto(String  userId,int questionId){

        List<AnswerDto> listAnswer = new ArrayList<>();

        List<Integer> list1= answerRepository.getAnswersQuestion(questionId);

        for(int i=0;i < list1.size();i++){
            Answer newAnswer = findById(list1.get(i));

            AnswerDto answerDto = new AnswerDto();

            answerDto.setAnswerId(newAnswer.getId());
            answerDto.setAnswerString(newAnswer.getAnswerString());
            answerDto.setUserId(newAnswer.getUserId());
            answerDto.setSocialDto(socialService.getAnswerSocial(list1.get(i)));
            answerDto.setCommentDtoList(commentService.getAnswerCommentsSocial(newAnswer.getUserId(), questionId));

            listAnswer.add(answerDto);
        }

        return listAnswer;
    }
}
