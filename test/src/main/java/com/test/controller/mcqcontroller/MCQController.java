package com.test.controller.mcqcontroller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.mcqmodel.MCQModel;
import com.test.service.mcqservice.MCQService;

@RestController
@RequestMapping("/api")
public class MCQController {
	
	@Autowired
	private MCQService mcqService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String hello() {
		return "hello data";
	}
	
	@RequestMapping(value="/test/create",method=RequestMethod.POST)
	public MCQModel createQuestion(@RequestBody MCQModel mcqModel) {
		return mcqService.saveQuestion(mcqModel);
	}
	
	@RequestMapping(value="/test/get/{qid}",method=RequestMethod.GET)
	public MCQModel getQuestion(@PathVariable("qid")long qid) {
		return mcqService.getQuestion(qid);
	}
	
	@RequestMapping(value="/test/getall",method=RequestMethod.GET)
	public ArrayList<MCQModel> getAllQuestions(){
		return mcqService.getAllQuestions();
	}
	
	@RequestMapping(value="/test/updateQuestion",method=RequestMethod.PUT)
	public MCQModel updateQuestion(@RequestBody MCQModel mcqModel) {
		return mcqService.updateQuestion(mcqModel);
	}
	
	@RequestMapping(value="/test/deleteQuestion/{qid}",method=RequestMethod.DELETE)
	public void deleteMCQQuestion(@PathVariable("qid") long qid) {
		mcqService.deleteQuestion(qid);
	}
}