package com.back4app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "amount")
	private double amount;

	@Column(name = "email")
	private String email;

	@Column(name = "insert_time")
	private Date insert_time;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "source")
	private String source;

	@Column(name = "status")
	private int status;

	@Column(name = "updated_time")
	private Date update_time;

	@Column(name = "username")
	private String username;

	@Column(name = "pg_id")
	private String pg_id;

	@Column(name = "systemid")
	private String systemid;

	@Column(name = "object_id")
	private String object_id;

	@Column(name = "plan_id")
	private String plan_id;

	@Column(name = "plan_duration")
	private String plan_duration;

	@Column(name = "campaign_id")
	private String campaign_id;

	@Column(name = "ext_id")
	private String ext_id;

	@Column(name = "is_updated")
	private int is_updated;

	@Column(name = "parse_client_id")
	private String parse_client_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPg_id() {
		return pg_id;
	}

	public void setPg_id(String pg_id) {
		this.pg_id = pg_id;
	}

	public String getSystemid() {
		return systemid;
	}

	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}

	public String getObject_id() {
		return object_id;
	}

	public void setObject_id(String object_id) {
		this.object_id = object_id;
	}

	public String getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_duration() {
		return plan_duration;
	}

	public void setPlan_duration(String plan_duration) {
		this.plan_duration = plan_duration;
	}

	public String getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}

	public String getExt_id() {
		return ext_id;
	}

	public void setExt_id(String ext_id) {
		this.ext_id = ext_id;
	}

	public int getIs_updated() {
		return is_updated;
	}

	public void setIs_updated(int is_updated) {
		this.is_updated = is_updated;
	}

	public String getParse_client_id() {
		return parse_client_id;
	}

	public void setParse_client_id(String parse_client_id) {
		this.parse_client_id = parse_client_id;
	}

}
