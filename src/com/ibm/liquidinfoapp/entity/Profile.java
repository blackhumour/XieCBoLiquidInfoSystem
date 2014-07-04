package com.ibm.liquidinfoapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	
	private String notesid;
	private String password;
	private String name;
	private String pemid;
	private String ilid;
	private String techdomain;
	private String techother;
	private double utilization;
	private String location;
	private String onsiteflag;
	private String onbenchflag;
	private String registeredflag;
	private String roleid;
	private Date createtime;
	private Date updatetime;
	
	@Id
	@Column(name="notesid")
	public String getNotesid() {
		return notesid;
	}
	public void setNotesid(String notesid) {
		this.notesid = notesid;
	}
	@Column(name="password",nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="name",nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="pemid",nullable=false)
	public String getPemid() {
		return pemid;
	}
	public void setPemid(String pemid) {
		this.pemid = pemid;
	}
	@Column(name="ilid",nullable=false)
	public String getIlid() {
		return ilid;
	}
	public void setIlid(String ilid) {
		this.ilid = ilid;
	}
	@Column(name="techdomain",nullable=false)
	public String getTechdomain() {
		return techdomain;
	}
	public void setTechdomain(String techdomain) {
		this.techdomain = techdomain;
	}
	@Column(name="techother")
	public String getTechother() {
		return techother;
	}
	public void setTechother(String techother) {
		this.techother = techother;
	}
	@Column(name="utilization",nullable=false)
	public double getUtilization() {
		return utilization;
	}
	public void setUtilization(double utilization) {
		this.utilization = utilization;
	}
	@Column(name="location",nullable=false)
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name="onsiteflag",nullable=false)
	public String getOnsiteflag() {
		return onsiteflag;
	}
	public void setOnsiteflag(String onsiteflag) {
		this.onsiteflag = onsiteflag;
	}
	@Column(name="onbenchflag",nullable=false)
	public String getOnbenchflag() {
		return onbenchflag;
	}
	public void setOnbenchflag(String onbenchflag) {
		this.onbenchflag = onbenchflag;
	}
	@Column(name="registeredflag",nullable=false)
	public String getRegisteredflag() {
		return registeredflag;
	}
	public void setRegisteredflag(String registeredflag) {
		this.registeredflag = registeredflag;
	}
	@Column(name="roleid",nullable=false)
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	@Column(name="createtime",nullable=false)
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Column(name="updatetime",nullable=false)
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
