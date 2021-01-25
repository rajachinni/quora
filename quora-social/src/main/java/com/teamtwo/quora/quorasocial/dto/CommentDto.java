package com.teamtwo.quora.quorasocial.dto;

import java.util.List;

public class CommentDto {

    private int commentId;
    private String commentString;
    private String userId;
    private SocialDto socialDto;
    //private List<CommentDto> commentDtoList;


    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentString() {
        return commentString;
    }

    public void setCommentString(String commentString) {
        this.commentString = commentString;
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
}
