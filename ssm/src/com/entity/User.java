package com.entity;

import java.io.Serializable;

public class User implements Serializable{
	private Integer id;   //����
	private String userName;//�û���
	private String userAccount;//�û��˺�
	private String pwd;//�û�����
	private Integer status;//״̬ 1��ְ 0��ְ
	private String remark;//��ע
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public User(Integer id, String userName, String userAccount, String pwd,
			Integer status, String remark) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAccount = userAccount;
		this.pwd = pwd;
		this.status = status;
		this.remark = remark;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAccount="
				+ userAccount + ", pwd=" + pwd + ", status=" + status
				+ ", remark=" + remark + "]";
	}
	
	
	
}
