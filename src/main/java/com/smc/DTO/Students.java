package com.smc.DTO;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Component
public class Students 
{
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	int sid;
	
	String sname;
	
	long mobile;
	
	int math_marks;
	
	int science_marks;
	
	int english_marks;
	
    int social_science_marks;
	
	int hindi_marks;
	
	double percentage;
	
	String result;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getMath_marks() {
		return math_marks;
	}

	public void setMath_marks(int math_marks) {
		this.math_marks = math_marks;
	}

	public int getScience_marks() {
		return science_marks;
	}

	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}

	public int getSocial_science_marks() {
		return social_science_marks;
	}

	public void setSocial_science_marks(int social_science_marks) {
		this.social_science_marks = social_science_marks;
	}

	public int getHindi_marks() {
		return hindi_marks;
	}

	public void setHindi_marks(int hindi_marks) {
		this.hindi_marks = hindi_marks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}



	
	
	

}
