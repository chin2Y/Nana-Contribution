package com.test.serviceimpl.mcqserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.model.mcqmodel.MCQModel;
import com.test.repository.mcqrepository.MCQRepository;
import com.test.service.mcqservice.MCQService;

@Service
public class MCQServiceImpl implements MCQService{

	@Autowired
	private MCQRepository mcqRepository;
	
	@Override
	public MCQModel saveQuestion(MCQModel mcqModel) {
		return mcqRepository.save(mcqModel);
	}

	@Override
	public MCQModel getQuestion(long qid) {
		return mcqRepository.findById(qid).get();
	}

	@Override
	public ArrayList<MCQModel> getAllQuestions() {
		ArrayList<MCQModel> questions = new ArrayList<>();
		mcqRepository.findAll().forEach(question->questions.add(question));
		return questions;
	}

	@Override
	public MCQModel updateQuestion(MCQModel mcqModel) {
		return mcqRepository.save(mcqModel);
	}

	@Override
	public void deleteQuestion(long qid) {
		mcqRepository.deleteById(qid);
	}
}
