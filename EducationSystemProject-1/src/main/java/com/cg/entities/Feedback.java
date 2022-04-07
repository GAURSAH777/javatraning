package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback_table1")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fid")
	private int fid;

	@Column(name = "feedback")
	private String feedback;

	@ManyToOne
	@JoinColumn(name = "trainerId")
	private Trainer trainer_id;

	@ManyToOne
	@JoinColumn(name = "studentId")
	private Student studentId;

	// Empty Constructor.

	public Feedback() {

	}

	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", feedback=" + feedback + ", trainer=" + trainer_id + ", student=" + studentId
				+ "]";
	}

	public Feedback(int fid, String feedback, Trainer trainer, Student student) {
		super();
		this.fid = fid;
		this.feedback = feedback;
		this.trainer_id = trainer_id;
		this.studentId = studentId;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Trainer getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(Trainer trainer_id) {
		this.trainer_id = trainer_id;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

}
