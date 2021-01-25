package com.teamtwo.quora.quorasocial.services;

import com.teamtwo.quora.quorasocial.Entity.Social;
import com.teamtwo.quora.quorasocial.dto.SocialDto;
import com.teamtwo.quora.quorasocial.sample.CountStruct;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SocialService {


    Social save(Social social);
    void addQuestionReaction(String userId,int questionId,String reactionType,int reactionValue);
    void deleteQuestionReaction(String userId,int questionId);
    void changeQuestionReaction(String userId,int questionId,String ReactionType,int reactionValue);
    void addAnswerReaction(String userId,int answerId,String reactionType,int reactionValue);
    void deleteAnswerReaction(String userId,int answerId);
    void changeAnswerReaction(String userId,int answerId,String ReactionType,int reactionValue);
    void addCommentReaction(String userId,int commentId,String reactionType,int reactionValue);
    void deleteCommentReaction(String userId,int commentId);
    void changeCommentReaction(String userId,int commentId,String ReactionType,int reactionValue);

    List<CountStruct> getReactionCountQuestion(@Param("questionId")int questionId);
    List<CountStruct> getReactionCountAnswer(@Param("answerId")int answerId);
    List<CountStruct> getReactionCountComment(@Param("commentId")int commentId);

    SocialDto getQuestionSocial(int questionId);
    SocialDto getAnswerSocial(int answerId);
    SocialDto getCommentSocial(int commentId);



   /* void addBulbReaction(String userId,String answewrString reactionType,String aId);
    void deleteBulbReaction(String userId,String aId);
    void changeBulbReaction(String userId,String newReactionType,String aId);*/

}
