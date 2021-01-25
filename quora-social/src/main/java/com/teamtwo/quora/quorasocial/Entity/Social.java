package com.teamtwo.quora.quorasocial.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="social")
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String userId;
    private int questionId;
    private int answerId;
    private int commentId;
    private String reactionType; //upvote, downvote and BULB
    private int reactionValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public int getReactionValue() {
        return reactionValue;
    }

    public void setReactionValue(int reactionValue) {
        this.reactionValue = reactionValue;
    }
}
