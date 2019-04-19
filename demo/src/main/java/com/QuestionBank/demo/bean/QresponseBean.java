package com.QuestionBank.bean;

public class QresponseBean {
	
	public String relatableQuestion;
	
	public String answer;

	public String getRelatableQuestion() {
		return relatableQuestion;
	}

	public void setRelatableQuestion(String relatableQuestion) {
		this.relatableQuestion = relatableQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QresponseBean [relatableQuestion=" + relatableQuestion + ", answer=" + answer + "]";
	}
	
	

}
