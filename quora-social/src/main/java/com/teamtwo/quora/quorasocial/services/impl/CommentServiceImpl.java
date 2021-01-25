package com.teamtwo.quora.quorasocial.services.impl;

import com.teamtwo.quora.quorasocial.Entity.Comment;
import com.teamtwo.quora.quorasocial.dto.CommentDto;
import com.teamtwo.quora.quorasocial.repository.CommentRepository;
import com.teamtwo.quora.quorasocial.services.CommentService;
import com.teamtwo.quora.quorasocial.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    SocialService socialService;


    @Override
    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }

    @Override
    public  Comment findById(Integer commentId){

        return commentRepository.findById(commentId).get();

    }

    @Override
    public void addQuestionComment(String userId, int questionId, String commentString) {

        commentRepository.addQuestionComment(userId,questionId,commentString);
    }

    @Override
    public void addAnswerComment(String userId, int answerId, String commentString) {

        commentRepository.addAnswerComment(userId,answerId,commentString);

    }

    @Override
    public List<Integer> getQuestionComments(int questionId) {
        return commentRepository.getQuestionComments(questionId);
    }

    @Override
    public List<Integer> getAnswerComments(int answerId) {
        return commentRepository.getAnswerComments(answerId);
    }


     @Override
     public List<CommentDto> getQuestionCommentsSocial(String userId,int questionId){

        List<CommentDto> listComment = new ArrayList<>();

        List<Integer> list1 = commentRepository.getQuestionComments(questionId);

        for(int i= 0 ;i < list1.size();i++){

            Comment newComment = findById(list1.get(i));
            CommentDto commentDto= new CommentDto();

            commentDto.setCommentId(list1.get(i));
            commentDto.setCommentString(newComment.getCommentString());
            commentDto.setUserId(newComment.getUserId());
            commentDto.setSocialDto(socialService.getCommentSocial(list1.get(i)));

            listComment.add(commentDto);
        }

        return listComment ;
     }

    @Override
    public List<CommentDto> getAnswerCommentsSocial(String userId,int answerId){

        List<CommentDto> listComment = new ArrayList<>();

        List<Integer> list1 = commentRepository.getAnswerComments(answerId);

        for(int i= 0 ;i < list1.size();i++){

            Comment newComment = findById(list1.get(i));
            CommentDto commentDto= new CommentDto();

            commentDto.setCommentId(list1.get(i));
            commentDto.setCommentString(newComment.getCommentString());
            commentDto.setUserId(newComment.getUserId());
            commentDto.setSocialDto(socialService.getCommentSocial(list1.get(i)));

            listComment.add(commentDto);
        }

        return listComment ;
    }





}
