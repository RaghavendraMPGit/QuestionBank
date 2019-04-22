package com.QuestionBank.demo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Entity
public class Qbean {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@XmlAttribute
	public long id;

	@XmlElement
	public String question;
	
	@XmlElement
	public String category;

	@XmlElement
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Qbean [question=" + question + ", category=" + category + "]";
	}
	
	
	
	
}
