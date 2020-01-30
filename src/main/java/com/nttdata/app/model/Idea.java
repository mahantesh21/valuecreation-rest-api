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
	private String classification;
	private String account;
	private String hardwareReq;
	private String softwareReq;
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
    private String attachmentName;
    private String attachmentUri;
    private String attachmentType;

	private String ideaFor;
	private String accSpecific;
	private String location;
	private String theme;
	
	private String costBenefitDone;
	
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
	
	public Idea(String title, String classification, String account, String hardwareReq, String softwareReq,
			String problem, String solution, String benefit, String detailedDesc, String userId, String status,
			byte[] attachment, String ideaFor, String accSpecific, String location, String theme,
			String costBenefitDone) {
		super();
		this.title = title;
		this.classification = classification;
		this.account = account;
		this.hardwareReq = hardwareReq;
		this.softwareReq = softwareReq;
		this.problem = problem;
		this.solution = solution;
		this.benefit = benefit;
		this.detailedDesc = detailedDesc;
		this.userId = userId;
		this.status = status;
		this.attachment = attachment;
		this.ideaFor = ideaFor;
		this.accSpecific = accSpecific;
		this.location = location;
		this.theme = theme;
		this.costBenefitDone = costBenefitDone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getHardwareReq() {
		return hardwareReq;
	}

	public void setHardwareReq(String hardwareReq) {
		this.hardwareReq = hardwareReq;
	}

	public String getSoftwareReq() {
		return softwareReq;
	}

	public void setSoftwareReq(String softwareReq) {
		this.softwareReq = softwareReq;
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

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIdeaFor() {
		return ideaFor;
	}

	public void setIdeaFor(String ideaFor) {
		this.ideaFor = ideaFor;
	}

	public String getAccSpecific() {
		return accSpecific;
	}

	public void setAccSpecific(String accSpecific) {
		this.accSpecific = accSpecific;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCostBenefitDone() {
		return costBenefitDone;
	}

	public void setCostBenefitDone(String costBenefitDone) {
		this.costBenefitDone = costBenefitDone;
	}

	public Date getCreated() {
		return created;
	}

	public Date getUpdated() {
		return updated;
	}

	public long getId() {
		return id;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentUri() {
		return attachmentUri;
	}

	public void setAttachmentUri(String attachmentUri) {
		this.attachmentUri = attachmentUri;
	}

	public String getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

}
