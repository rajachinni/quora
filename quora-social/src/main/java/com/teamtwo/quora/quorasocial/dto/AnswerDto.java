package com.teamtwo.quora.quorasocial.dto;

import java.util.List;

public class AnswerDto {

    private int answerId;
    private String answerString;
    private String userId;
    private SocialDto socialDto;
    private List<CommentDto> commentDtoList;
    //private List<SocialDto> socialDtoList;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerString() {
        return answerString;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
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

    public List<CommentDto> getCommentDtoList() {
        return commentDtoList;
    }

    public void setCommentDtoList(List<CommentDto> commentDtoList) {
        this.commentDtoList = commentDtoList;
    }
}
