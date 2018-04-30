package com.hexaware.billsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_details")
public class DocumentDetails 
{  @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int docId;
	private String identifyDocument;
	private String prefix_format;
	public int getDocId() {
		return docId;
		
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getIdentifyDocument() {
		return identifyDocument;
	}
	public void setIdentifyDocument(String identifyDocument) {
		this.identifyDocument = identifyDocument;
	}
	public String getPrefixDocument() {
		return prefix_format;
	}
	public void setPrefixDocument(String prefixDocument) {
		this.prefix_format = prefixDocument;
	}
	
	
}
