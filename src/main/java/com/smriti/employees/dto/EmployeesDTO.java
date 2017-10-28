package com.smriti.employees.dto;

import java.time.LocalDateTime;

import com.smriti.employees.constant.MoneyVO;

public class EmployeesDTO {

	Integer id;
	String name;
	Integer departmentCode;
	String managerName;
	Integer managerCode;
	LocalDateTime dateOfBirth;
	MoneyVO salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Integer getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(Integer managerCode) {
		this.managerCode = managerCode;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public MoneyVO getSalary() {
		return salary;
	}
	public void setSalary(MoneyVO salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((departmentCode == null) ? 0 : departmentCode.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((managerCode == null) ? 0 : managerCode.hashCode());
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeesDTO other = (EmployeesDTO) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (departmentCode == null) {
			if (other.departmentCode != null)
				return false;
		} else if (!departmentCode.equals(other.departmentCode))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (managerCode == null) {
			if (other.managerCode != null)
				return false;
		} else if (!managerCode.equals(other.managerCode))
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployeesDTO [id=" + id + ", name=" + name + ", departmentCode=" + departmentCode + ", managerName="
				+ managerName + ", managerCode=" + managerCode + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary
				+ "]";
	}
	
	
	
}
