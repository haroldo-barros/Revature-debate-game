package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "debate_templates")
public class DebateTemplate {

	@Id
	@Column(name = "debate_template_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "debate_template_name")
	private String name;
	

	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<QuestionTemplate> questions = new ArrayList<>();
}
