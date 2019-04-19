package com.QuestionBank.Dao;

import java.util.List;

import com.QuestionBank.bean.Qbean;

public interface GetAnswersDao {
	
	public Qbean GetAnswers(Qbean qbean); 

	public void SubQtnAns(Object object);

	public void GetAnsByCat();


}
