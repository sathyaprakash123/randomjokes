package com.randomjoke.satresearch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeetable")
public class EmployeeEntity {

	@Id
	@Column(name="employeeid")
	private Integer employeeId;
	
	@Column(name="employeename")
	private String employeeName;
	
	@Column(name="employeesal")
	private String employeeSal;
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(String employeeSal) {
		this.employeeSal = employeeSal;
	}

}
