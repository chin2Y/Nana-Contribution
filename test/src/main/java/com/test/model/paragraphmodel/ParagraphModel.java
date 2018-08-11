package com.test.model.paragraphmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParagraphModel {
	
	@Id
	@GeneratedValue
	private long paraId;
	private String paragraph;
	public long getParaId() {
		return paraId;
	}
	public void setParaId(long paraId) {
		this.paraId = paraId;
	}
	public String getParagraph() {
		return paragraph;
	}
	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}
}
