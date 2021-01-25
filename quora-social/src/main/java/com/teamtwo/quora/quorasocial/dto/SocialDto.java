package com.teamtwo.quora.quorasocial.dto;

import java.util.List;

public class SocialDto {

    private int questionId;
    private int answerId;
    private int CommentId;
    private int CountUp;
    private int CountDown;
    private int CountBulb;

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
        return CommentId;
    }

    public void setCommentId(int commentId) {
        CommentId = commentId;
    }

    public int getCountUp() {
        return CountUp;
    }

    public void setCountUp(int countUp) {
        CountUp = countUp;
    }

    public int getCountDown() {
        return CountDown;
    }

    public void setCountDown(int countDown) {
        CountDown = countDown;
    }

    public int getCountBulb() {
        return CountBulb;
    }

    public void setCountBulb(int countBulb) {
        CountBulb = countBulb;
    }
}
