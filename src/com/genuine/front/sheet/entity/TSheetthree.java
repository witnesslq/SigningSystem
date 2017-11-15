package com.genuine.front.sheet.entity;

/**
 * TSheetthree entity. @author MyEclipse Persistence Tools
 */

public class TSheetthree implements java.io.Serializable {

	// Fields

	private TSheetthreeId id;
	private Float amount;
	private Float fewSum;
	private Float womanSum;
	private Float xjSum;
	private Float bsSum;
	private Float ssSum;
	private Float sxjSum;
	private Float sbkSum;
	private Float szkSum;
	private String schoolState;

	// Constructors

	/** default constructor */
	public TSheetthree() {
	}

	/** minimal constructor */
	public TSheetthree(TSheetthreeId id) {
		this.id = id;
	}

	/** full constructor */
	public TSheetthree(TSheetthreeId id, Float amount, Float fewSum,
			Float womanSum, Float xjSum, Float bsSum, Float ssSum,
			Float sxjSum, Float sbkSum, Float szkSum, String schoolState) {
		this.id = id;
		this.amount = amount;
		this.fewSum = fewSum;
		this.womanSum = womanSum;
		this.xjSum = xjSum;
		this.bsSum = bsSum;
		this.ssSum = ssSum;
		this.sxjSum = sxjSum;
		this.sbkSum = sbkSum;
		this.szkSum = szkSum;
		this.schoolState = schoolState;
	}

	// Property accessors

	public TSheetthreeId getId() {
		return this.id;
	}

	public void setId(TSheetthreeId id) {
		this.id = id;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getFewSum() {
		return this.fewSum;
	}

	public void setFewSum(Float fewSum) {
		this.fewSum = fewSum;
	}

	public Float getWomanSum() {
		return this.womanSum;
	}

	public void setWomanSum(Float womanSum) {
		this.womanSum = womanSum;
	}

	public Float getXjSum() {
		return this.xjSum;
	}

	public void setXjSum(Float xjSum) {
		this.xjSum = xjSum;
	}

	public Float getBsSum() {
		return this.bsSum;
	}

	public void setBsSum(Float bsSum) {
		this.bsSum = bsSum;
	}

	public Float getSsSum() {
		return this.ssSum;
	}

	public void setSsSum(Float ssSum) {
		this.ssSum = ssSum;
	}

	public Float getSxjSum() {
		return this.sxjSum;
	}

	public void setSxjSum(Float sxjSum) {
		this.sxjSum = sxjSum;
	}

	public Float getSbkSum() {
		return this.sbkSum;
	}

	public void setSbkSum(Float sbkSum) {
		this.sbkSum = sbkSum;
	}

	public Float getSzkSum() {
		return this.szkSum;
	}

	public void setSzkSum(Float szkSum) {
		this.szkSum = szkSum;
	}

	public String getSchoolState() {
		return this.schoolState;
	}

	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}

}