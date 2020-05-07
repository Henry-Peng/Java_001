package com.peng.unInner;
/**
 * 匿名内部类测试
 * @author pfh
 * @date 2020年4月29日
 */
public class UnNameClass {
	public static void main(String[] args) {
		addImpl(new ShopDao(){

			@Override
			public void getShop() {
				System.out.println("匿名类输出方法...");
				
			}
			
		});
	}
	
	public static void addImpl(ShopDao shopDao){
		shopDao.getShop();
	}
}

interface ShopDao{
	public void getShop();
}
