package com.QuestionBank.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.QuestionBank.demo.bean.CatBean;
import com.QuestionBank.demo.Service.QaService;
import com.QuestionBank.demo.Service.CaService;
import com.QuestionBank.demo.bean.QAbean;
import com.QuestionBank.demo.bean.QresponseBean;

@RestController
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
	
	@Autowired
	CaService caService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getAnsByCat/{cat}", headers="Accept=application/xml")
	@ResponseBody
	List<String> getAnsByCat(@PathVariable String cat)
	{
		System.out.println("getAnsByCat Successfull");
		List<String> qcat = caService.getAnsByCat(cat);
		System.out.println(qcat);
		return qcat;
	
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/subQtnAns", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean subQtnAns(@RequestBody QAbean qabean) {
		
		System.out.println("subQtnAns Successfull");
		return null;
	
	}
	

}
