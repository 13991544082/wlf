package com.entity;

import java.io.Serializable;

public class Clazz implements Serializable{
	private Integer id;//����
	private String cname;//�༶����
	private String cycle;//����
	private Integer tid1;//�ڿ���ʦ ���
	private Integer tid2;//��ҵ��ʦ ���
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public Integer getTid1() {
		return tid1;
	}
	public void setTid1(Integer tid1) {
		this.tid1 = tid1;
	}
	public Integer getTid2() {
		return tid2;
	}
	public void setTid2(Integer tid2) {
		this.tid2 = tid2;
	}
	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clazz(Integer id, String cname, String cycle, Integer tid1,
			Integer tid2) {
		super();
		this.id = id;
		this.cname = cname;
		this.cycle = cycle;
		this.tid1 = tid1;
		this.tid2 = tid2;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", cname=" + cname + ", cycle=" + cycle
				+ ", tid1=" + tid1 + ", tid2=" + tid2 + "]";
	}
	
}
