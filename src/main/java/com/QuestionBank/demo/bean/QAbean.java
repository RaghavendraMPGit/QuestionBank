package com.QuestionBank.demo.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name="QAbean")
@XmlAccessorType(XmlAccessType.NONE)
public class QAbean {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@XmlElement
	public String question;
	
	@XmlElement
	 public String answers;
	
	@XmlElement
	public String category;
	
	public String getQuestions() {
		return question;
	}

	public void setQuestions(String question) {
		this.question = question;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "QAbean [id=" + id + ", question=" + question + ", answers=" + answers + ", category=" + category + "]";
	}

	
	

}
