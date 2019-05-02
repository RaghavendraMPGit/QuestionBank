package com.QuestionBank.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.QuestionBank.demo.Service.NullException;
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
	
	

	@RequestMapping(value="/getAnswers", method = RequestMethod.GET, headers="Accept=application/xml")
	@ResponseBody
	Qbean getAnswers(@RequestParam String ques ) throws NullException {
		
		Qbean getAns=qaService.getAnswers(ques);
		RelatableQuestionList rQlist=qaService.relatableQuestions(ques);
		getAns.setRelatableQuestionList(rQlist);
		System.out.println(getAns);
		return getAns;

	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/getAnsByCat", headers="Accept=application/xml")
	@ResponseBody
	QbeanList getAnsByCat(@RequestParam String cat) {
		
		QbeanList getqans=qaService.getQanswers(cat);
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
