package com.teamtwo.quora.quorasocial.controller;

import com.teamtwo.quora.quorasocial.Entity.Question;
import com.teamtwo.quora.quorasocial.dto.QuestionDto;
import com.teamtwo.quora.quorasocial.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    /*public List<QuestionDto> getTopFeed(String userId){
        //develop logic to get the list of users / categories this current user is following
        //select questions from previous list of detail you got it
        //limit the results to your page size
        //for each question load answers, comments, social information -> this you are doing through services classes of each of the objects
        return null;
    }
*/
    @PostMapping(value="/addQuestion/{userId}/{categoryId}")
    public void addQuestion(@PathVariable("userId")String userId, @PathVariable("categoryId")String categoryId, @RequestBody String questionString)
    {
        questionService.addQuestion(userId, categoryId, questionString);
    }


    @GetMapping(value="/getQuestion/{userId}/QuestionId")
    public QuestionDto getQuestion(@PathVariable("userId")String  userId,@PathVariable("questionId")int questionId)
    {
        return questionService.getQuestionDto(userId, questionId);
    }

    @PostMapping(value="/save")
    public Question save(@RequestBody Question question){
        return questionService.save(question);
    }

}
