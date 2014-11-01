package com.prj.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "class")
public class Class extends BaseEntity {
	private Semester semester;
	private Account teacher;
	private Course course;
	private StudentClass studentClass;
	private Set<LabPlan> labPlans = new HashSet<LabPlan>(0);
	
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "semesterId")
	@JsonIgnore
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "teacherId")
	@JsonIgnore
	public Account getTeacher() {
		return teacher;
	}
	public void setTeacher(Account teacher) {
		this.teacher = teacher;
	}
	
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId")
	@JsonIgnore
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "studentId")
	@JsonIgnore
	public StudentClass getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(StudentClass studentClass) {
		this.studentClass = studentClass;
	}

	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "clazz")
	public Set<LabPlan> getLabPlans() {
		return labPlans;
	}
	public void setLabPlans(Set<LabPlan> labPlans) {
		this.labPlans = labPlans;
	}
}