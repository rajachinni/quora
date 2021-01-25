package com.teamtwo.quora.quorasocial.services.impl;

import com.teamtwo.quora.quorasocial.Entity.Question;
import com.teamtwo.quora.quorasocial.dto.QuestionDto;
import com.teamtwo.quora.quorasocial.repository.QuestionRepository;
import com.teamtwo.quora.quorasocial.services.AnswerService;
import com.teamtwo.quora.quorasocial.services.CommentService;
import com.teamtwo.quora.quorasocial.services.QuestionService;
import com.teamtwo.quora.quorasocial.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerService answerService;

    @Autowired
    CommentService commentService;

    @Autowired
    SocialService socialService;

    @Override
    public void addQuestion(String userId, String categoryId, String questionString) {
       questionRepository.addQuestion(userId, categoryId, questionString);
    }

    @Override
    public Question findById(int questionId){
        return questionRepository.findById(questionId).get();
    }

    @Override
    public QuestionDto getQuestionDto(String userId,int questionId){

        Question newQuestion = findById(questionId);

        QuestionDto questionDto = new QuestionDto();

        questionDto.setQuestionId(newQuestion.getId());
        questionDto.setCategoryId(newQuestion.getCategoryId());
        questionDto.setUserId(newQuestion.getUserId());
        questionDto.setAnswerDtoList(answerService.getAnswerDto(userId, questionId));
        questionDto.setCommentDtoList(commentService.getQuestionCommentsSocial(userId, questionId));
        questionDto.setSocialDto(socialService.getQuestionSocial(questionId));


        return questionDto;
    }

    @Override
    public Question save(Question question){

       return  questionRepository.save(question);
    }
}
