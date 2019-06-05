package com.entity;

import java.io.Serializable;

public class Teacher implements Serializable{
	private Integer id;//主键
	private String tname;//老师姓名
	private String phone;//电话
	private String subject;//课程
	private Integer status;//1授课老师  2就业老师
	private String remark;//备注
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer id, String tname, String phone, String subject,
			Integer status, String remark) {
		super();
		this.id = id;
		this.tname = tname;
		this.phone = phone;
		this.subject = subject;
		this.status = status;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tname=" + tname + ", phone=" + phone
				+ ", subject=" + subject + ", status=" + status + ", remark="
				+ remark + "]";
	}
	
	
	
}
