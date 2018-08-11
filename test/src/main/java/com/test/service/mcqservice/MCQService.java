package com.test.service.mcqservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.model.mcqmodel.MCQModel;

@Service
public interface MCQService {
	
	public MCQModel saveQuestion(MCQModel mcqModel);
	
	public MCQModel getQuestion(long qid);
	
	public ArrayList<MCQModel> getAllQuestions();
	
	public MCQModel updateQuestion(MCQModel mcqModel);
	
	public void deleteQuestion(long qid);
}
