package com.example.hackathon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="masttransfer")
public class MastTransfer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     
    public Long id;
    
    @Column(name="PAN1")
    public Long pan1;
    
    @Column(name="PAN2")
    public Long pan2;
     
    @Column(name="TRANSAMT")
    public Integer transamt;
    
    @Column(name="PAN1VALBEFORE")
    public Integer pan1valbefore;
    
    @Column(name="PAN2VALBEFORE")
    public Integer pan2valbefore;
    
    @Column(name="PAN1VALAFTER")
    public Integer pan1valafter;
    
    @Column(name="PAN2VALAFTER")
    public Integer pan2valafter;
    
    @Column(name="TIMESTMP")
    public String timestmp;
       
    @Column(name="STATUS")
    public String status;
    
    @Column(name="STATREASON")
    String statreason;
    
    
    //no-args constructor
    public MastTransfer()
    {}
    
    public MastTransfer(Long pan1,Long pan2,Integer transamt,Integer pan1valbefore,Integer pan2valbefore,Integer pan1valafter,Integer pan2valafter,String timestamp,String status,String statreason)
    
    {
    	
    	this.pan1 = pan1;
    	this.pan2 = pan2;
    	this.transamt = transamt;
    	this.pan1valbefore=pan1valbefore;
    	this.pan2valbefore=pan2valbefore;
    	this.pan1valafter=pan1valafter;
    	this.pan2valafter=pan2valafter;
    	this.timestmp=timestamp;
    	this.status= status;	
    	this.statreason=statreason;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPan1() {
		return pan1;
	}

	public void setPan1(Long pan1) {
		this.pan1 = pan1;
	}
	public Long getPan2() {
		return pan2;
	}

	public void setPan2(Long pan2) {
		this.pan2 = pan2;
	}

	public Integer getTransamt() {
		return transamt;
	}

	public void setTransamt(Integer transamt) {
		this.transamt = transamt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

