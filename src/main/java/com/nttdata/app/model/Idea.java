package com.nttdata.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;


@Entity
public class Idea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String problem;
	private String solution;
	private String benefit;
	private String detailedDesc;
	
	@NotNull
	private String userId;
	private String status;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
	private Date created;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false)
	private Date updated;

	@Lob
	private byte[] attachment;

    @PrePersist
    protected void onCreate() {
    	updated = created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    	updated = new Date();
    }
    
	public Idea() {
	}
	
	public Idea(String title, String problem, String solution, String benefit, String detailedDesc, String userId,
			String status, byte[] attachment) {
		super();
		this.title = title;
		this.problem = problem;
		this.solution = solution;
		this.benefit = benefit;
		this.detailedDesc = detailedDesc;
		this.userId = userId;
		this.status = status;
		this.attachment = attachment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getDetailedDesc() {
		return detailedDesc;
	}

	public void setDetailedDesc(String detailedDesc) {
		this.detailedDesc = detailedDesc;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public byte[] getAttachment() {
		return attachment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

}
