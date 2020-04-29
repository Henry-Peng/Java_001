package com.peng.test;

import com.peng.modle.Shop;
/**
 * shop测试类
 * @author pfh
 * @date 2020年4月21日
 */
public class ShopTest {

	public static void main(String[] args) {
		Shop shop = new Shop("B202004206798", "苹果", "烟台", 3.5, "4月21日", 100, "4月19日", 100,  23);
		System.out.println(shop);
		/**
		 * 修改设定值
		 */
		shop.setGoodsName("红富士");
		shop.setPrice(4);
		shop.setProductId("B999999678");
		System.out.println(shop.toString());
		
	}

}
