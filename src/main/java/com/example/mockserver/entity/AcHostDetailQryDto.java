package com.example.mockserver.entity;

// import com.cloudcore.ifp4.route.transport.rest.FormatMapping;

import lombok.Data;
import lombok.ToString;

@Data
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

}
