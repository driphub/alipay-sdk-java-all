package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.cumulation.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-04 10:45:46
 */
public class ZhimaCreditPeZmgoCumulationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1333816619298888687L;

	/** 
	 * 芝麻go协议号，唯一标识一个芝麻go协议。
累计成功后返回此字段。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 数据回传失败原因描述。
累计失败后返回此字段。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 外部业务号。需保证唯一，若接口调用失败，提示信息为更换幂等号，商户更换此字段重新发起调用。
累计成功后返回此字段。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 用户userId，蚂蚁统一会员ID。
累计成功后返回此字段。
	 */
	@ApiField("user_id")
	private String userId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}