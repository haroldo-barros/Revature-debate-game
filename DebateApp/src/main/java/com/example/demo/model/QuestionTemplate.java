package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_templates")
public class QuestionTemplate {
	
	@Id
	@Column(name = "question_template_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "question_template_text")
	private String text;
	
	@Column(name = "question_template_is_mc")
	private boolean multipleChoice;

	public QuestionTemplate(int id, String text, boolean multipleChoice) {
		super();
		this.id = id;
		this.text = text;
		this.multipleChoice = multipleChoice;
	}
	
}
