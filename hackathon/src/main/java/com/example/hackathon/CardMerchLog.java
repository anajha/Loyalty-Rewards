package com.example.hackathon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="cardlog")
public class CardMerchLog {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     
    public Long id;
    
    @Column(name="PAN")
    public Long pan;
  
	@Column(name="ACTIVITY")
    public String activity;
     
    @Column(name="TIMESTMP")
    public String timestmp;
    
    
    
    //no-args constructor
    public CardMerchLog()
    {}
    
    public CardMerchLog(Long pan, String activity,String timestmp)
    
    {
    	
    	this.pan = pan;
    	this.activity=activity;
    	this.timestmp=timestmp;
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPan() {
		return pan;
	}

	public void setPan(Long pan) {
		this.pan = pan;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getTimestmp() {
		return timestmp;
	}

	public void setTimestmp(String timestmp) {
		this.timestmp = timestmp;
	}
    
}