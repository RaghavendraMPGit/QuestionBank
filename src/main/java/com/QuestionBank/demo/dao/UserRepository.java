package com.QuestionBank.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.QuestionBank.demo.bean.QAbean;

public interface UserRepository extends JpaRepository<QAbean, Long> {
	@Query("SELECT q.answers FROM QAbean q where q.question=:question") 
	String findById(@Param("question")String question);
/*
	@Query("SELECT ans FROM QA where ques IN('ques')") 
	String findAll(String ques);*/

}
