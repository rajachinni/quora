package com.teamtwo.quora.quorasocial.services;


import com.teamtwo.quora.quorasocial.Entity.Comment;
import com.teamtwo.quora.quorasocial.dto.CommentDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentService {


    void addQuestionComment(String userId,int questionId,String commentString);
    void addAnswerComment(String userId,int answerId,String commentString);
    List<Integer> getQuestionComments(int questionId);
    List<Integer> getAnswerComments(int answerId);
    Comment findById(Integer commentId);

    Comment save(Comment comment);

    List<CommentDto> getQuestionCommentsSocial(String userId, int questionId);
    List<CommentDto> getAnswerCommentsSocial(String userId,int questionId);

}
