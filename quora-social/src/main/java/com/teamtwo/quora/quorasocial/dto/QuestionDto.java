package com.teamtwo.quora.quorasocial.dto;

import java.util.List;

public class QuestionDto {

    private int questionId;
    private int questionString;
    private String  categoryId;
    private String userId;
    private SocialDto  socialDto;
    private List<AnswerDto> answerDtoList;
    private List<CommentDto> commentDtoList;
    //private List<SocialDto> socialDtoList;


    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionString() {
        return questionString;
    }

    public void setQuestionString(int questionString) {
        this.questionString = questionString;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SocialDto getSocialDto() {
        return socialDto;
    }

    public void setSocialDto(SocialDto socialDto) {
        this.socialDto = socialDto;
    }

    public List<AnswerDto> getAnswerDtoList() {
        return answerDtoList;
    }

    public void setAnswerDtoList(List<AnswerDto> answerDtoList) {
        this.answerDtoList = answerDtoList;
    }

    public List<CommentDto> getCommentDtoList() {
        return commentDtoList;
    }

    public void setCommentDtoList(List<CommentDto> commentDtoList) {
        this.commentDtoList = commentDtoList;
    }
}
