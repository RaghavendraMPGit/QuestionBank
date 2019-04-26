package com.QuestionBank.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.QuestionBank.demo.Service.QaService;
import com.QuestionBank.demo.bean.CatBean;
import com.QuestionBank.demo.bean.QAbean;
import com.QuestionBank.demo.bean.QAbeanList;
import com.QuestionBank.demo.bean.Qbean;
import com.QuestionBank.demo.bean.QbeanList;
import com.QuestionBank.demo.bean.RelatableQuestionList;

@Controller
public class QAController {
	
	
	@Autowired
	QaService qaService;
	
	

	@RequestMapping(value="/getAnswers", method = RequestMethod.POST, headers="Accept=application/xml")
	@ResponseBody
	Qbean getAnswers(@RequestBody QAbean qbean) {
		
		Qbean getAns=qaService.getAnswers(qbean);
		RelatableQuestionList rQlist=qaService.relatableQuestions(qbean);
		getAns.setRelatableQuestionList(rQlist);
		System.out.println(getAns);
		return getAns;

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value="/getAnsByCat", headers="Accept=application/xml")
	@ResponseBody
	QbeanList getAnsByCat(@RequestBody QAbean catbean) {
		
		QbeanList getqans=qaService.getQanswers(catbean);
		System.out.println("getAnsByCat Successfull");
		return getqans;
	
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subQtnAns", headers="Accept=application/xml")
	@ResponseBody
	QbeanList subQtnAns(@RequestBody QAbeanList qabean) {
		
		qaService.insertQA(qabean);
		System.out.println("subQtnAns Successfull");
		return null;
	
	}
	

}
