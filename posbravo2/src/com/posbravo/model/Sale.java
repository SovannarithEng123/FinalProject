package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sale generated by hbm2java
 */
@Entity
@Table(name = "sale", catalog = "posbravo")
public class Sale implements java.io.Serializable {

	private Integer saleId;
	private String dsixreturnCode;
	private String cmdStatus;
	private String textResponse;
	private String authCode;
	private Integer refNo;
	private String acqRefData;
	private String recordNo;
	private String processData;
	private BigDecimal purchaseAmount;
	private BigDecimal authorizeAmount;

	public Sale() {
	}

	public Sale(String dsixreturnCode, String cmdStatus, String textResponse,
			String authCode, Integer refNo, String acqRefData, String recordNo,
			String processData, BigDecimal purchaseAmount,
			BigDecimal authorizeAmount) {
		this.dsixreturnCode = dsixreturnCode;
		this.cmdStatus = cmdStatus;
		this.textResponse = textResponse;
		this.authCode = authCode;
		this.refNo = refNo;
		this.acqRefData = acqRefData;
		this.recordNo = recordNo;
		this.processData = processData;
		this.purchaseAmount = purchaseAmount;
		this.authorizeAmount = authorizeAmount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SaleID", unique = true, nullable = false)
	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	@Column(name = "DSIXReturnCode")
	public String getDsixreturnCode() {
		return this.dsixreturnCode;
	}

	public void setDsixreturnCode(String dsixreturnCode) {
		this.dsixreturnCode = dsixreturnCode;
	}

	@Column(name = "CmdStatus")
	public String getCmdStatus() {
		return this.cmdStatus;
	}

	public void setCmdStatus(String cmdStatus) {
		this.cmdStatus = cmdStatus;
	}

	@Column(name = "TextResponse")
	public String getTextResponse() {
		return this.textResponse;
	}

	public void setTextResponse(String textResponse) {
		this.textResponse = textResponse;
	}

	@Column(name = "AuthCode")
	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@Column(name = "RefNo")
	public Integer getRefNo() {
		return this.refNo;
	}

	public void setRefNo(Integer refNo) {
		this.refNo = refNo;
	}

	@Column(name = "AcqRefData")
	public String getAcqRefData() {
		return this.acqRefData;
	}

	public void setAcqRefData(String acqRefData) {
		this.acqRefData = acqRefData;
	}

	@Column(name = "RecordNo")
	public String getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}

	@Column(name = "ProcessData")
	public String getProcessData() {
		return this.processData;
	}

	public void setProcessData(String processData) {
		this.processData = processData;
	}

	@Column(name = "PurchaseAmount", scale = 4)
	public BigDecimal getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	@Column(name = "AuthorizeAmount", scale = 4)
	public BigDecimal getAuthorizeAmount() {
		return this.authorizeAmount;
	}

	public void setAuthorizeAmount(BigDecimal authorizeAmount) {
		this.authorizeAmount = authorizeAmount;
	}

}