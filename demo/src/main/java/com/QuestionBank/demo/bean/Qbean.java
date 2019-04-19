package com.QuestionBank.bean;

import java.util.List;

public class Qbean {

	public List<String> question;
	
	public String category;

	public List<String> getQuestion() {
		return question;
	}

	public void setQuestion(List<String> question) {
		this.question = question;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Qbean [question=" + question + ", category=" + category + "]";
	}
	
	
	
	
}
