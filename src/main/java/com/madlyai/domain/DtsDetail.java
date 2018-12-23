package com.madlyai.domain;
// Generated 2018-12-23 17:32:46 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DtsDetail generated by hbm2java
 */
@Entity
@Table(name = "dts_detail")
public class DtsDetail implements java.io.Serializable {

	private String id;
	private String dealDate;
	private String dealDatetime;
	private String dealStatus;
	private String jobId;
	private String remark;

	public DtsDetail() {
	}

	public DtsDetail(String id) {
		this.id = id;
	}

	public DtsDetail(String id, String dealDate, String dealDatetime, String dealStatus, String jobId, String remark) {
		this.id = id;
		this.dealDate = dealDate;
		this.dealDatetime = dealDatetime;
		this.dealStatus = dealStatus;
		this.jobId = jobId;
		this.remark = remark;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "deal_date", length = 8)
	public String getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	@Column(name = "deal_datetime", length = 14)
	public String getDealDatetime() {
		return this.dealDatetime;
	}

	public void setDealDatetime(String dealDatetime) {
		this.dealDatetime = dealDatetime;
	}

	@Column(name = "deal_status")
	public String getDealStatus() {
		return this.dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	@Column(name = "job_id", length = 32)
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
