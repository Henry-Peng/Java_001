package com.peng.multiTest;
/**
 * 测试Yield方法的类
 * @author pfh
 * @date 2020年5月26日
 */
public class YieldTest {

	public static void main(String[] args) {
		DemoYield demoYield = new DemoYield();
		new Thread(demoYield, "凯迪拉克").start();
		new Thread(demoYield, "奇瑞").start();
	}

}
