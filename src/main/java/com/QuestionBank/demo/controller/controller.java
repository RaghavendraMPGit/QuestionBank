package com.QuestionBank.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.QuestionBank.demo.Service.QaService;
import com.QuestionBank.demo.bean.CatBean;
import com.QuestionBank.demo.bean.QAbean;
import com.QuestionBank.demo.bean.QresponseBean;

@Controller
public class controller {
	
	
	@Autowired
	QaService qaService;
	
	

	@RequestMapping(method = RequestMethod.POST, value="/getAnswers", headers="Accept=application/xml")
	@ResponseBody
	List<String> getAnswers(@RequestBody QAbean qbean) {
		
		System.out.println("getAnswers Successfull");
		List<String> ans= qaService.getAnswers(qbean);
		System.out.println(ans);
	
		return ans;
	

	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/getAnsByCat", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean getAnsByCat(@RequestBody CatBean catbean) {
		
		
		System.out.println("getAnsByCat Successfull");
		return null;
	
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/subQtnAns", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean subQtnAns(@RequestBody QAbean qabean) {
		
		
		System.out.println("subQtnAns Successfull");
		return null;
	
	}
	

}
