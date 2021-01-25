package com.teamtwo.quora.quorasocial.controller;


import com.teamtwo.quora.quorasocial.Entity.Social;
import com.teamtwo.quora.quorasocial.dto.SocialDto;
import com.teamtwo.quora.quorasocial.sample.CountStruct;
import com.teamtwo.quora.quorasocial.services.AnswerService;
import com.teamtwo.quora.quorasocial.services.CommentService;
import com.teamtwo.quora.quorasocial.services.QuestionService;
import com.teamtwo.quora.quorasocial.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/social")
public class SocialController {

    @Autowired
    SocialService socialService;

    @GetMapping(value="/{questionId}")
    public SocialDto getQuestionSocial(@PathVariable("questionId")int questionId){

        return socialService.getQuestionSocial(questionId);

    }

    @GetMapping(value="/{answerId}")
    public SocialDto getAnswerSocial(@PathVariable("answerId")int answerId){

        return socialService.getAnswerSocial(answerId);

    }

    @GetMapping(value="/{commentId}")
    public SocialDto getCommentSocial(@PathVariable("commentId")int commentId){

        return socialService.getCommentSocial(commentId);

    }

    @PostMapping(value="/addQuestionReaction/{userId}/{questionId}/{reactionType}/{reactionValue}")
    public void addQuestionReaction(@PathVariable("userId")String userId,@PathVariable("questionId")int questionId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.addQuestionReaction(userId, questionId, reactionType, reactionValue);
    }

    @PostMapping(value="/deleteQuestionReaction/{userId}/{questionId}")
    public void deleteQuestionReaction(@PathVariable("userId")String userId,@PathVariable("questionId")int questionId){
        socialService.deleteQuestionReaction(userId, questionId);
    }


    @PostMapping(value="/changeQuestionReaction/{userId}/{questionId}/{reactionType}/{reactionValue}")
    public void changeQuestionReaction(@PathVariable("userId")String userId,@PathVariable("questionId")int questionId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.changeQuestionReaction(userId, questionId, reactionType, reactionValue);
    }

    @PostMapping(value="/addAnswerReaction/{userId}/{answerId}/{reactionType}/{reactionValue}")
    public void addAnswerReaction(@PathVariable("userId")String userId,@PathVariable("answerId")int answerId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.addAnswerReaction(userId,answerId, reactionType, reactionValue);
    }

    @PostMapping(value="/deleteAnswerReaction/{userId}/{answerId}")
    public void deleteAnswerReaction(@PathVariable("userId")String userId,@PathVariable("answerId")int answerId){
        socialService.deleteAnswerReaction(userId,answerId);
    }


    @PostMapping(value="/changeAnswerReaction/{userId}/{answerId}/{reactionType}/{reactionValue}")
    public void changeAnswerReaction(@PathVariable("userId")String userId,@PathVariable("answerId")int answerId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.changeAnswerReaction(userId,answerId, reactionType, reactionValue);
    }

    @PostMapping(value="/addAnswerReaction/{userId}/{commentId}/{reactionType}/{reactionValue}")
    public void addCommentReaction(@PathVariable("userId")String userId,@PathVariable("commentId")int commentId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.addCommentReaction(userId,commentId, reactionType, reactionValue);
    }

    @PostMapping(value="/deleteCommentReaction/{userId}/{answerId}")
    public void deleteCommentReaction(@PathVariable("userId")String userId,@PathVariable("commentId")int commentId){
        socialService.deleteCommentReaction(userId,commentId);
    }


    @PostMapping(value="/changeCommentReaction/{userId}/{CommentId}/{reactionType}/{reactionValue}")
    public void changeCommentReaction(@PathVariable("userId")String userId,@PathVariable("commentId")int commentId,@PathVariable("reactionType")String reactionType,@PathVariable("reactionValue")int reactionValue){
        socialService.changeCommentReaction(userId,commentId, reactionType, reactionValue);
    }




}
