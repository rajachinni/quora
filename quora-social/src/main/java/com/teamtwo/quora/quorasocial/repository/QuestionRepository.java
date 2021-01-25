package com.teamtwo.quora.quorasocial.repository;

import com.teamtwo.quora.quorasocial.Entity.Question;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer> {


    @Modifying
    @Query(value="insert into Question(userId,categoryId,questionString) Values(:userId,:categoryId,:questionString)",nativeQuery = true)
    void addQuestion(@Param("userId")String userId,@Param("categoryId")String categoryId,@Param("questionString")String questionString);
}
