package com.QuestionBank.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.QuestionBank.demo.bean.QAbean;
import com.QuestionBank.demo.dao.UserRepository;

@Service
public class QaService {
	
	@Autowired
	private UserRepository userRepository;
	public List<String> getAnswers(QAbean qbean){
		List<String> abean=new ArrayList<String>(); 
		
		   System.out.println(qbean.question);
			String ans=userRepository.findById(qbean.question);
			abean.add(ans); 
		return abean;
		
	}

}
