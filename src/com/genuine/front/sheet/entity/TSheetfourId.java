package com.genuine.front.sheet.entity;

/**
 * TSheetfourId entity. @author MyEclipse Persistence Tools
 */

public class TSheetfourId implements java.io.Serializable {

	// Fields

	private String SId;
	private Integer rowId;

	// Constructors

	/** default constructor */
	public TSheetfourId() {
	}

	/** full constructor */
	public TSheetfourId(String SId, Integer rowId) {
		this.SId = SId;
		this.rowId = rowId;
	}

	// Property accessors

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	public Integer getRowId() {
		return this.rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSheetfourId))
			return false;
		TSheetfourId castOther = (TSheetfourId) other;

		return ((this.getSId() == castOther.getSId()) || (this.getSId() != null
				&& castOther.getSId() != null && this.getSId().equals(
				castOther.getSId())))
				&& ((this.getRowId() == castOther.getRowId()) || (this
						.getRowId() != null && castOther.getRowId() != null && this
						.getRowId().equals(castOther.getRowId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSId() == null ? 0 : this.getSId().hashCode());
		result = 37 * result
				+ (getRowId() == null ? 0 : this.getRowId().hashCode());
		return result;
	}

}