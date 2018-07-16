package com.it.sportsplus.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_coach")


public class Coach implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="coach_id")
	private Long coachId;
	@Column(name="coach_name")
	private String coachName;
	@Column(name="coach_speciality")
	private String coachSpeciality;
	@Column(name="coach_phno")
	private String coachPhno;
	@ManyToMany(mappedBy = "tbl_coach")
    private Set<Group> groups = new HashSet<>();

	
	
	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachSpeciality() {
		return coachSpeciality;
	}

	public void setCoachSpeciality(String coachSpeciality) {
		this.coachSpeciality = coachSpeciality;
	}

	public String getCoachPhno() {
		return coachPhno;
	}

	public void setCoachPhno(String coachPhno) {
		this.coachPhno = coachPhno;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	
	
	public Coach(String coachName, String coachSpeciality, String coachPhno, Set<Group> groups) {
		super();
		this.coachName = coachName;
		this.coachSpeciality = coachSpeciality;
		this.coachPhno = coachPhno;
		this.groups = groups;
	}

	
	
	public Coach() {
		super();
	}

}
