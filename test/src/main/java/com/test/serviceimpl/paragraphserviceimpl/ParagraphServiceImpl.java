package com.test.serviceimpl.paragraphserviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.model.paragraphmodel.ParagraphModel;
import com.test.repository.paragraphrepository.ParagraphRepository;
import com.test.service.paragraphservice.ParagraphService;

@Service
public class ParagraphServiceImpl implements ParagraphService{

	@Autowired
	private ParagraphRepository paragraphRepository;
	
	@Override
	public ParagraphModel createParagraph(ParagraphModel paragraphModel) {
		return paragraphRepository.save(paragraphModel);
	}

	@Override
	public ParagraphModel getParagraph(long paraId) {
		return paragraphRepository.findById(paraId).get();
	}

	@Override
	public ArrayList<ParagraphModel> getAllParagraphs() {
		ArrayList<ParagraphModel> allParagraphs=new ArrayList<>();
		paragraphRepository.findAll().forEach(paragraph->allParagraphs.add(paragraph));
		return allParagraphs;
	}

	@Override
	public ParagraphModel updateParagraph(ParagraphModel paragraphModel) {
		return paragraphRepository.save(paragraphModel);
	}

	@Override
	public void deleteParagraph(long paraId) {
		paragraphRepository.deleteById(paraId);
	}
}
