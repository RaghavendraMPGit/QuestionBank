package com.QuestionBank.demo.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CA")
@XmlAccessorType(XmlAccessType.NONE)
public class CatBean {
	
	@XmlElement
	public String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "CatBean [category=" + category + "]";
	}
	
  	

}
