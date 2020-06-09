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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Forumanswer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int forumanswers_Id;
	
	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	Forum forum;
	
	
	@Column(nullable= false, columnDefinition=" default getdate()")
	@Temporal(TemporalType.DATE)
	Date posted_date;
	
	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	Customer customer;
	
	@Column(nullable= false,columnDefinition="boolean default false")
	boolean blog_Status;

	public int getForumanswers_Id() {
		return forumanswers_Id;
	}

	public void setForumanswers_Id(int forumanswers_Id) {
		this.forumanswers_Id = forumanswers_Id;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Date getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(Date posted_date) {
		this.posted_date = posted_date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isBlog_Status() {
		return blog_Status;
	}

	public void setBlog_Status(boolean blog_Status) {
		this.blog_Status = blog_Status;
	}
	
	

}
