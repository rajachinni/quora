package com.teamtwo.quora.quorasocial.services.impl;

import com.teamtwo.quora.quorasocial.Entity.Social;
import com.teamtwo.quora.quorasocial.dto.SocialDto;
import com.teamtwo.quora.quorasocial.repository.SocialRepository;
import com.teamtwo.quora.quorasocial.sample.CountStruct;
import com.teamtwo.quora.quorasocial.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SocialServiceImpl implements SocialService {


    @Autowired
    SocialRepository socialRepository;

    @Override
    public Social save(Social social) {
        return null;
    }

    @Override
    public void addQuestionReaction(String userId, int questionId, String reactionType, int reactionValue) {

        socialRepository.addQuestionReaction(userId,questionId,reactionType,reactionValue);
    }

    @Override
    public void deleteQuestionReaction(String userId, int questionId) {

        socialRepository.deleteQuestionReaction(userId,questionId);
    }

    @Override
    public void changeQuestionReaction(String userId, int questionId, String reactionType, int reactionValue) {

        socialRepository.changeQuestionReaction(userId,questionId,reactionType,reactionValue);
    }

    @Override
    public void addAnswerReaction(String userId, int answerId, String reactionType, int reactionValue) {

        socialRepository.addAnswerReaction(userId,answerId,reactionType,reactionValue);
    }

    @Override
    public void deleteAnswerReaction(String userId, int answerId) {
        socialRepository.deleteAnswerReaction(userId,answerId);
    }

    @Override
    public void changeAnswerReaction(String userId, int answerId, String reactionType, int reactionValue) {
       socialRepository.changeAnswerReaction(userId,answerId,reactionType,reactionValue);
    }

    @Override
    public void addCommentReaction(String userId, int commentId, String reactionType, int reactionValue) {
      socialRepository.addCommentReaction(userId,commentId,reactionType,reactionValue);
    }

    @Override
    public void deleteCommentReaction(String userId, int commentId) {
        socialRepository.deleteCommentReaction(userId,commentId);
    }

    @Override
    public void changeCommentReaction(String userId, int commentId, String ReactionType, int reactionValue) {
       socialRepository.changeCommentReaction(userId,commentId,ReactionType,reactionValue);
    }

    @Override
    public List<CountStruct> getReactionCountQuestion(int questionId) {
        return socialRepository.getReactionCountQuestion(questionId);
    }

    @Override
    public List<CountStruct> getReactionCountAnswer(int answerId) {
        return socialRepository.getReactionCountAnswer(answerId);
    }

    @Override
    public List<CountStruct> getReactionCountComment(int commentId) {
        return socialRepository.getReactionCountComment(commentId);
    }

    @Override
    public SocialDto getQuestionSocial(int questionId){
        SocialDto socialdto = new SocialDto();
        socialdto.setQuestionId(questionId);
        List<CountStruct> list = getReactionCountQuestion(questionId);

        for(int i=0;i<list.size();i++){
            if(list.get(i).getReactionType().equals("upvote")){
                socialdto.setCountUp(list.get(i).getCount());
            }
            else if( list.get(i).getReactionType().equals("downvote"))
            {
                socialdto.setCountDown(list.get(i).getCount());
            }
            else{
                socialdto.setCountBulb(list.get(i).getCount());
            }
        }

        return socialdto;

    }

    @Override
    public SocialDto getAnswerSocial(int answerId){
        SocialDto socialdto = new SocialDto();
        socialdto.setAnswerId(answerId);
        List<CountStruct> list = getReactionCountAnswer(answerId);

        for(int i=0;i<list.size();i++){
            if(list.get(i).getReactionType().equals("upvote")){
                socialdto.setCountUp(list.get(i).getCount());
            }
            else if( list.get(i).getReactionType().equals("downvote"))
            {
                socialdto.setCountDown(list.get(i).getCount());
            }
            else{
                socialdto.setCountBulb(list.get(i).getCount());
            }
        }

        return socialdto;

    }

    @Override
    public SocialDto getCommentSocial(int commentId){
        SocialDto socialdto = new SocialDto();
        socialdto.setCommentId(commentId);
        List<CountStruct> list = getReactionCountComment(commentId);

        for(int i=0;i<list.size();i++){
            if(list.get(i).getReactionType().equals("upvote")){
                socialdto.setCountUp(list.get(i).getCount());
            }
            else if( list.get(i).getReactionType().equals("downvote"))
            {
                socialdto.setCountDown(list.get(i).getCount());
            }
            else{
                socialdto.setCountBulb(list.get(i).getCount());
            }
        }

        return socialdto;

    }



}
