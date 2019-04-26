package com.QuestionBank.demo.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="AC")
@XmlAccessorType(XmlAccessType.NONE)
public class Qbean {
	
	@XmlElement
	public RelatableQuestionList RelatableQuestionList;
	
	@XmlElement
	public String Questions;
	
	@XmlElement
	public String answer;
	
	
	@XmlElement
	public String category;

	

	public com.QuestionBank.demo.bean.RelatableQuestionList getRelatableQuestionList() {
		return RelatableQuestionList;
	}

	public void setRelatableQuestionList(com.QuestionBank.demo.bean.RelatableQuestionList relatableQuestionList) {
		RelatableQuestionList = relatableQuestionList;
	}

	public String getAnswers() {
		return answer;
	}

	public void setAnswers(String answer) {
		this.answer = answer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQuestions() {
		return Questions;
	}

	public void setQuestions(String questions) {
		Questions = questions;
	}

	@Override
	public String toString() {
		return "Qbean [question=" + answer + ", category=" + category + "]";
	}
	
	
	
	
}
