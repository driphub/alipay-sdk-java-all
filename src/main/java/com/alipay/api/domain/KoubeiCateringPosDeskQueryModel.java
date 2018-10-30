package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据门店ID查询桌位
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:20:34
 */
public class KoubeiCateringPosDeskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8218122385595395448L;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}