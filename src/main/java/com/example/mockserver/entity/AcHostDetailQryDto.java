package com.example.mockserver.entity;

// import com.cloudcore.ifp4.route.transport.rest.FormatMapping;

public class AcHostDetailQryDto {
	/**
	 * 核心客户编号
	 */
	private String hostCustNo;
	/**
	 * 账户编号
	 */
	private String acctNo;
	/**
	 * 账户币种
	 */
	private String currency;
	/**
	 * 账户名称
	 */
	private String acctName;
	/**
	 * 开户机构编号
	 */
	private String openOrgNo;
	/**
	 * 开户机构名称
	 */
	private String openOrgName;
	/**
	 * 开户日期
	 */
	private String openDate;
	/**
	 * 账号状态
	 */
	private String acctStat;
	/**
	 * 账号类型
	 */
	private String acctType;
	/**
	 * 账号性质
	 */
	private String acctClass;
	/**
	 * 钞汇标识
	 */
	private String cashFlag;
	/**
	 * 透支标识
	 */
	private String overFlag;
	/**
	 * 开户行号
	 */
	private String bankNo;
	/**
	 * 开户行名
	 */
	private String bankName;
	/**
	 * 账面余额
	 */
	private String bookBal;
	/**
	 * 冻结余额
	 */
	private String frzBal;
	/**
	 * 可用余额
	 */
	private String valBal;
	/**
	 * 透支额度
	 */
	private String overdraftLimit;
	/**
	 * 已透额度
	 */
	private String overdraft;
	/**
	 * 	核心账户性质
	 */
	private String hostAcnoKind;
	
	public String getHostAcnoKind() {
		return hostAcnoKind;
	}
	public void setHostAcnoKind(String hostAcnoKind) {
		this.hostAcnoKind = hostAcnoKind;
	}
	public String getHostCustNo() {
		return hostCustNo;
	}
	public void setHostCustNo(String hostCustNo) {
		this.hostCustNo = hostCustNo;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getCurrency() {
		return currency;
	}
	// @FormatMapping("currencyBack")
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getOpenOrgNo() {
		return openOrgNo;
	}
	public void setOpenOrgNo(String openOrgNo) {
		this.openOrgNo = openOrgNo;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getAcctStat() {
		return acctStat;
	}
	public void setAcctStat(String acctStat) {
		this.acctStat = acctStat;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAcctClass() {
		return acctClass;
	}
	public void setAcctClass(String acctClass) {
		this.acctClass = acctClass;
	}
	public String getCashFlag() {
		return cashFlag;
	}
	public void setCashFlag(String cashFlag) {
		this.cashFlag = cashFlag;
	}
	public String getOverFlag() {
		return overFlag;
	}
	public void setOverFlag(String overFlag) {
		this.overFlag = overFlag;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBookBal() {
		return bookBal;
	}
	public void setBookBal(String bookBal) {
		this.bookBal = bookBal;
	}
	public String getFrzBal() {
		return frzBal;
	}
	public void setFrzBal(String frzBal) {
		this.frzBal = frzBal;
	}
	public String getValBal() {
		return valBal;
	}
	public void setValBal(String valBal) {
		this.valBal = valBal;
	}
	public String getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(String overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}

	public String getOpenOrgName() {
		return openOrgName;
	}

	public void setOpenOrgName(String openOrgName) {
		this.openOrgName = openOrgName;
	}
}
