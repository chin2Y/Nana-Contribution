package com.test.service.paragraphservice;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.model.paragraphmodel.ParagraphModel;

@Service
public interface ParagraphService {
	
	public ParagraphModel createParagraph(ParagraphModel paragraphModel);
	
	public ParagraphModel getParagraph(long paraId);
	
	public ArrayList<ParagraphModel> getAllParagraphs();

	public ParagraphModel updateParagraph(ParagraphModel paragraphModel);

	public void deleteParagraph(long paraId);
}
