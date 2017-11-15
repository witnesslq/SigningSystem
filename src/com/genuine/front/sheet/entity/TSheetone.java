package com.genuine.front.sheet.entity;

/**
 * TSheetone entity. @author MyEclipse Persistence Tools
 */

public class TSheetone implements java.io.Serializable {

	// Fields

	private TSheetoneId id;
	private Integer amount;
	private Integer SBk;
	private Integer SZk;
	private Integer SMb;

	// Constructors

	/** default constructor */
	public TSheetone() {
	}

	/** minimal constructor */
	public TSheetone(TSheetoneId id) {
		this.id = id;
	}

	/** full constructor */
	public TSheetone(TSheetoneId id, Integer amount, Integer SBk, Integer SZk,
			Integer SMb) {
		this.id = id;
		this.amount = amount;
		this.SBk = SBk;
		this.SZk = SZk;
		this.SMb = SMb;
	}

	// Property accessors

	public TSheetoneId getId() {
		return this.id;
	}

	public void setId(TSheetoneId id) {
		this.id = id;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getSBk() {
		return this.SBk;
	}

	public void setSBk(Integer SBk) {
		this.SBk = SBk;
	}

	public Integer getSZk() {
		return this.SZk;
	}

	public void setSZk(Integer SZk) {
		this.SZk = SZk;
	}

	public Integer getSMb() {
		return this.SMb;
	}

	public void setSMb(Integer SMb) {
		this.SMb = SMb;
	}

}