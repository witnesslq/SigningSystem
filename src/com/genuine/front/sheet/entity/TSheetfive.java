package com.genuine.front.sheet.entity;

/**
 * TSheetfive entity. @author MyEclipse Persistence Tools
 */

public class TSheetfive implements java.io.Serializable {

	// Fields

	private TSheetfiveId id;
	private Integer sum;
	private Integer emp;
	private Integer retire;
	private Integer graduate;
	private Integer other;

	// Constructors

	/** default constructor */
	public TSheetfive() {
	}

	/** minimal constructor */
	public TSheetfive(TSheetfiveId id) {
		this.id = id;
	}

	/** full constructor */
	public TSheetfive(TSheetfiveId id, Integer sum, Integer emp,
			Integer retire, Integer graduate, Integer other) {
		this.id = id;
		this.sum = sum;
		this.emp = emp;
		this.retire = retire;
		this.graduate = graduate;
		this.other = other;
	}

	// Property accessors

	public TSheetfiveId getId() {
		return this.id;
	}

	public void setId(TSheetfiveId id) {
		this.id = id;
	}

	public Integer getSum() {
		return this.sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getEmp() {
		return this.emp;
	}

	public void setEmp(Integer emp) {
		this.emp = emp;
	}

	public Integer getRetire() {
		return this.retire;
	}

	public void setRetire(Integer retire) {
		this.retire = retire;
	}

	public Integer getGraduate() {
		return this.graduate;
	}

	public void setGraduate(Integer graduate) {
		this.graduate = graduate;
	}

	public Integer getOther() {
		return this.other;
	}

	public void setOther(Integer other) {
		this.other = other;
	}

}