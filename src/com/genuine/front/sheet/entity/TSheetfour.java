package com.genuine.front.sheet.entity;

/**
 * TSheetfour entity. @author MyEclipse Persistence Tools
 */

public class TSheetfour implements java.io.Serializable {

	// Fields

	private TSheetfourId id;
	private Integer amount;
	private Integer relation;
	private Integer retire;
	private Integer graduate;
	private Integer other;
	public TSheetfour(TSheetfourId id, Integer amount, Integer relation,
			Integer retire, Integer graduate, Integer other) {
		super();
		this.id = id;
		this.amount = amount;
		this.relation = relation;
		this.retire = retire;
		this.graduate = graduate;
		this.other = other;
	}
	public TSheetfourId getId() {
		return id;
	}
	public void setId(TSheetfourId id) {
		this.id = id;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getRelation() {
		return relation;
	}
	public void setRelation(Integer relation) {
		this.relation = relation;
	}
	public Integer getRetire() {
		return retire;
	}
	public void setRetire(Integer retire) {
		this.retire = retire;
	}
	public Integer getGraduate() {
		return graduate;
	}
	public void setGraduate(Integer graduate) {
		this.graduate = graduate;
	}
	public Integer getOther() {
		return other;
	}
	public void setOther(Integer other) {
		this.other = other;
	}
	public TSheetfour() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}