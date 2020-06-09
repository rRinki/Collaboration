package com.niit.collaborationbackend.Modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int blog_Id;
	

	@Column(nullable=false,unique=true)
	String blog_Name;
	
	@Column(nullable=false,columnDefinition="text")
	String blog_Content;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false,columnDefinition= "date default getdate()")
	Date posted_Date;
	
	@ManyToOne
	Customer cutomer;
	
	@Column(nullable=false,columnDefinition="boolean default false")
	boolean Status;

	public int getBlog_Id() {
		return blog_Id;
	}

	public void setBlog_Id(int blog_Id) {
		this.blog_Id = blog_Id;
	}

	public String getBlog_Name() {
		return blog_Name;
	}

	public void setBlog_Name(String blog_Name) {
		this.blog_Name = blog_Name;
	}

	public String getBlog_Content() {
		return blog_Content;
	}

	public void setBlog_Content(String blog_Content) {
		this.blog_Content = blog_Content;
	}

	public Date getPosted_Date() {
		return posted_Date;
	}

	public void setPosted_Date(Date posted_Date) {
		this.posted_Date = posted_Date;
	}

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	

}
