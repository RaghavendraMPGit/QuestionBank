package com.QuestionBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.QuestionBank.Dao.GetAnswersDao;
import com.QuestionBank.bean.Qbean;
import com.QuestionBank.bean.QresponseBean;

@Controller
public class controller {
	
	@Autowired
	GetAnswersDao getAnswersDao;
	

	@RequestMapping(method = RequestMethod.GET, value="/getAnswers", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean getAnswers(@RequestBody Qbean qbean) {
		
		getAnswersDao.GetAnswers(qbean);
		System.out.println("Successfull");
		return null;

	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/getAnsByCat", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean getAnsByCat(@RequestBody Qbean qbean) {
		
		getAnswersDao.GetAnsByCat();
		System.out.println("getAnsByCat Successfull");
		return null;
	
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/subQtnAns", headers="Accept=application/xml")
	@ResponseBody
	QresponseBean subQtnAns(@RequestBody Qbean qbean) {
		
		
		System.out.println("subQtnAns Successfull");
		return null;
	
	}
	

}
