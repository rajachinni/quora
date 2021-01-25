package com.teamtwo.quora.quorasocial.repository;

import com.teamtwo.quora.quorasocial.Entity.Comment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {




    @Modifying
    @Query(value="insert into Comment(userId,questionId,commentString) VALUES (:userId,:questionId,:commentString)",nativeQuery = true)
    void addQuestionComment(@Param("userId")String userId,@Param("questionId")int questionId,@Param("commentString")String commentString);

    @Modifying
    @Query(value="insert into Comment(userId,answerId,commentString) VALUES (:userId,:answerId,:commentString)",nativeQuery = true)
    void addAnswerComment(@Param("userId")String userId,@Param("answerId")int answerId,@Param("commentString")String commentString);


    @Modifying
    @Query("select id from Comment where questionId = :questionId")
    List<Integer> getQuestionComments(@Param("questionId")int questionId);

    @Modifying
    @Query("select id from Comment where answerId = :answerId")
    List<Integer> getAnswerComments(@Param("answerId")int answerId);


}
