package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * PaymentReverse generated by hbm2java
 */
public class PaymentReverse implements java.io.Serializable {

	private Integer paymentReverseId;
	private Integer dsixreturnCode;
	private String cmdStatus;
	private String textResponse;
	private String authCode;
	private Integer refNo;
	private String acqRefData;
	private String recordNo;
	private BigDecimal purchaseAmount;
	private BigDecimal authorizeAmount;
	private Set payments = new HashSet(0);

	public PaymentReverse() {
	}

	public PaymentReverse(BigDecimal purchaseAmount, BigDecimal authorizeAmount) {
		this.purchaseAmount = purchaseAmount;
		this.authorizeAmount = authorizeAmount;
	}

	public PaymentReverse(Integer dsixreturnCode, String cmdStatus,
			String textResponse, String authCode, Integer refNo,
			String acqRefData, String recordNo, BigDecimal purchaseAmount,
			BigDecimal authorizeAmount, Set payments) {
		this.dsixreturnCode = dsixreturnCode;
		this.cmdStatus = cmdStatus;
		this.textResponse = textResponse;
		this.authCode = authCode;
		this.refNo = refNo;
		this.acqRefData = acqRefData;
		this.recordNo = recordNo;
		this.purchaseAmount = purchaseAmount;
		this.authorizeAmount = authorizeAmount;
		this.payments = payments;
	}

	public Integer getPaymentReverseId() {
		return this.paymentReverseId;
	}

	public void setPaymentReverseId(Integer paymentReverseId) {
		this.paymentReverseId = paymentReverseId;
	}

	public Integer getDsixreturnCode() {
		return this.dsixreturnCode;
	}

	public void setDsixreturnCode(Integer dsixreturnCode) {
		this.dsixreturnCode = dsixreturnCode;
	}

	public String getCmdStatus() {
		return this.cmdStatus;
	}

	public void setCmdStatus(String cmdStatus) {
		this.cmdStatus = cmdStatus;
	}

	public String getTextResponse() {
		return this.textResponse;
	}

	public void setTextResponse(String textResponse) {
		this.textResponse = textResponse;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public Integer getRefNo() {
		return this.refNo;
	}

	public void setRefNo(Integer refNo) {
		this.refNo = refNo;
	}

	public String getAcqRefData() {
		return this.acqRefData;
	}

	public void setAcqRefData(String acqRefData) {
		this.acqRefData = acqRefData;
	}

	public String getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}

	public BigDecimal getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public BigDecimal getAuthorizeAmount() {
		return this.authorizeAmount;
	}

	public void setAuthorizeAmount(BigDecimal authorizeAmount) {
		this.authorizeAmount = authorizeAmount;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}
