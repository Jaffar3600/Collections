package com.collection;

public class CellPhone {
	private String company,model,description,operatinsystem;
	private int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatinsystem() {
		return operatinsystem;
	}
	public void setOperatinsystem(String operatinsystem) {
		this.operatinsystem = operatinsystem;
	}
	public int getPrice() {
		return price;
	}
	public CellPhone(String company, String model, String description,
			String operatinsystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatinsystem = operatinsystem;
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatinsystem="
				+ operatinsystem + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatinsystem == null) ? 0 : operatinsystem.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatinsystem == null) {
			if (other.operatinsystem != null)
				return false;
		} else if (!operatinsystem.equals(other.operatinsystem))
			return false;
		return true;
	}
	
	
	
}
