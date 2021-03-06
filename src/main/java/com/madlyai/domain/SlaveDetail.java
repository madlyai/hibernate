package com.madlyai.domain;
// Generated 2018-12-23 17:32:46 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SlaveDetail generated by hbm2java
 */
@Entity
@Table(name = "slave_detail")
public class SlaveDetail implements java.io.Serializable {

	private String id;
	private String dealDate;
	private String dealDatetime;
	private String secondsBehindMaster;
	private String slaveIoRunning;
	private String slaveSqlRunning;

	public SlaveDetail() {
	}

	public SlaveDetail(String id) {
		this.id = id;
	}

	public SlaveDetail(String id, String dealDate, String dealDatetime, String secondsBehindMaster,
			String slaveIoRunning, String slaveSqlRunning) {
		this.id = id;
		this.dealDate = dealDate;
		this.dealDatetime = dealDatetime;
		this.secondsBehindMaster = secondsBehindMaster;
		this.slaveIoRunning = slaveIoRunning;
		this.slaveSqlRunning = slaveSqlRunning;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, length = 32)
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

	@Column(name = "seconds_behind_master", length = 32)
	public String getSecondsBehindMaster() {
		return this.secondsBehindMaster;
	}

	public void setSecondsBehindMaster(String secondsBehindMaster) {
		this.secondsBehindMaster = secondsBehindMaster;
	}

	@Column(name = "slave_io_running", length = 32)
	public String getSlaveIoRunning() {
		return this.slaveIoRunning;
	}

	public void setSlaveIoRunning(String slaveIoRunning) {
		this.slaveIoRunning = slaveIoRunning;
	}

	@Column(name = "slave_sql_running", length = 32)
	public String getSlaveSqlRunning() {
		return this.slaveSqlRunning;
	}

	public void setSlaveSqlRunning(String slaveSqlRunning) {
		this.slaveSqlRunning = slaveSqlRunning;
	}

}
