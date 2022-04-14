package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentClassModel {

	@Id
	private int id;
	@Column
	private String div;
	@Column
	private String branch;
	@Column
	private String subject;

	public StudentClassModel() {

	}

	public StudentClassModel(int id, String div, String branch, String subject) {
		super();
		this.id = id;
		this.div = div;
		this.branch = branch;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
