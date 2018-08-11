package com.test.controller.paragraphcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.paragraphmodel.ParagraphModel;
import com.test.service.paragraphservice.ParagraphService;

@RestController
@RequestMapping("/api")
public class ParagraphController {
	
	@Autowired
	private ParagraphService paragraphService;
	
	@RequestMapping(value="/test/paragraph/save",method=RequestMethod.POST)
	public ParagraphModel saveParagraph(@RequestBody ParagraphModel paragraphModel) {
		return paragraphService.createParagraph(paragraphModel);
	}
	
	@RequestMapping(value="/test/paragraph/get/{paraId}",method=RequestMethod.GET)
	public ParagraphModel getParagraph(@PathVariable("paraId") long paraId) {
		return paragraphService.getParagraph(paraId);
	}
	
	@RequestMapping(value="/test/paragraph/getall",method=RequestMethod.GET)
	public ArrayList<ParagraphModel> getAllParagraphs(){
		return paragraphService.getAllParagraphs();
	}
	
	@RequestMapping(value="/test/paragraph/update",method=RequestMethod.PUT)
	public ParagraphModel updateParagraph(@RequestBody ParagraphModel paragraphModel) {
		return paragraphService.updateParagraph(paragraphModel);
	}
	
	@RequestMapping(value="/test/paragraph/delete/{paraId}",method=RequestMethod.DELETE)
	public void deleteParagraph(@PathVariable("paraId") long paraId) {
		paragraphService.deleteParagraph(paraId);
	}
}
