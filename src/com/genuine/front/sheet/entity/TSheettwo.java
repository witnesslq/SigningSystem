package com.genuine.front.sheet.entity;

/**
 * TSheettwo entity. @author MyEclipse Persistence Tools
 */

public class TSheettwo implements java.io.Serializable {

	// Fields

	private TSheettwoId id;
	private Double amount;
	private Double fewSum;
	private Double grilSum;
	private String schoolState;

	// Constructors

	/** default constructor */
	public TSheettwo() {
	}

	/** minimal constructor */
	public TSheettwo(TSheettwoId id) {
		this.id = id;
	}

	/** full constructor */
	public TSheettwo(TSheettwoId id, Double amount, Double fewSum,
			Double grilSum, String schoolState) {
		this.id = id;
		this.amount = amount;
		this.fewSum = fewSum;
		this.grilSum = grilSum;
		this.schoolState = schoolState;
	}

	// Property accessors

	public TSheettwoId getId() {
		return this.id;
	}

	public void setId(TSheettwoId id) {
		this.id = id;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getFewSum() {
		return this.fewSum;
	}

	public void setFewSum(Double fewSum) {
		this.fewSum = fewSum;
	}

	public Double getGrilSum() {
		return this.grilSum;
	}

	public void setGrilSum(Double grilSum) {
		this.grilSum = grilSum;
	}

	public String getSchoolState() {
		return this.schoolState;
	}

	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}

}