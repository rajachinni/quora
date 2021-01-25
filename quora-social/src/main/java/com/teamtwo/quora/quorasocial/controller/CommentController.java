package com.teamtwo.quora.quorasocial.controller;

import com.teamtwo.quora.quorasocial.Entity.Comment;
import com.teamtwo.quora.quorasocial.dto.CommentDto;
import com.teamtwo.quora.quorasocial.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/comment")
public class CommentController {



    @Autowired
    CommentService commentService;


    @PostMapping(value="/save")
    public  Comment save(Comment comment){
        return commentService.save(comment);
    }

    @PostMapping(value="/addQuestionComment/{userId}/{questionId}/")
    public void addQuestionComment(@PathVariable("userId") String userId,@PathVariable("questionId") int questionId,@RequestBody String commentString) {
        commentService.addQuestionComment(userId, questionId, commentString);
    }

    @PostMapping(value="/addAnswerComment/{userId}/{answerId}")
    public void addAnswerComment(String  userId, int answerId, String commentString) {
        commentService.addAnswerComment(userId, answerId, commentString);
    }


}
