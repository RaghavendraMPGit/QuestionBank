package com.QuestionBank.demo.dao;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.QuestionBank.demo.bean.QAbean;

@Repository
public interface UserRepository extends JpaRepository<QAbean, Long> {
	@Query("SELECT q.answers FROM QAbean q where q.question=:question") 
	String findById(@Param("question")String question);

	/*@Query ("SELECT ans FROM QA where ques IN('ques')") 
	String findAll(String ques);*/
	
	@Query(value="SELECT question,answers FROM QAbean  where category=:category")
     String findByquesCategory(@Param("category")String category);
	  
	}
