package com.peng.basics;
/**
 * String类与StringBuilder类性能比较:
 * StringBuilder类比String类性能要高:占用空间小,占用时间少
 * 本次试验中差异:空间百倍计,时间数十倍
 * @author pfh
 * @date 2020年5月7日
 */
public class StringBuilderTest3 {

	public static void main(String[] args) {
		getString();
		System.out.println("*****************");
		getStringBuilder();
		System.out.println("=================");
		getStringBuffer();
	}
	
	public static void getStringBuffer() {
		// 1.创建StringBuffer类对象
		StringBuffer sb = new StringBuffer();
		// 获取剩余空间: Runtime.getRuntime().freeMemory();
		long fm1 = Runtime.getRuntime().freeMemory();

		// 获取当前毫秒数
		long ctm1 = System.currentTimeMillis();

		for (int i = 0; i < 500000; i++) {// 如果循环太少会不显示,循环太多会超范围,50000次,10倍String类
			sb.append("S");
			// System.out.println(sb.hashCode());//产生相同的hashCode编码,表示地址不变
		}
		// System.out.println(sb);
		// 执行循环之后: 获取剩余空间
		long fm2 = Runtime.getRuntime().freeMemory();

		// 执行循环之后: 获取当前毫秒数
		long ctm2 = System.currentTimeMillis();

		System.out.println("StringBuffer类占用空间:" + (fm1 - fm2));
		System.out.println("StringBuffer类占用时间:" + (ctm2 - ctm1));

	}
	
	public static void getStringBuilder() {
		// 1.创建StringBuilder类对象
		StringBuilder sb = new StringBuilder();
		// 获取剩余空间
		long fm1 = Runtime.getRuntime().freeMemory();

		// 获取当前毫秒数
		long ctm1 = System.currentTimeMillis();

		for (int i = 0; i < 500000; i++) {//如果循环太少会不显示,循环太多会超范围,50000次,10倍String类
			sb.append("S");
			// System.out.println(sb.hashCode());//产生相同的hashCode编码,表示地址不变
		}
		//System.out.println(sb);
		// 执行循环之后: 获取剩余空间
		long fm2 = Runtime.getRuntime().freeMemory();

		// 执行循环之后: 获取当前毫秒数
		long ctm2 = System.currentTimeMillis();

		System.out.println("StringBuilder类占用空间:" + (fm1 - fm2));
		System.out.println("StringBuilder类占用时间:" + (ctm2 - ctm1));

	}
	
	public static void getString() {
		// 1.创建String类
		String s = "";

		// 获取剩余空间
		long fm1 = Runtime.getRuntime().freeMemory();

		// 获取当前毫秒数
		long ctm1 = System.currentTimeMillis();

		for (int i = 0; i < 5000; i++) {//如果循环太少会不显示,循环太多会超范围,5000次
			s += 'S';// s = s + 'S';
			// System.out.println(s.hashCode());//产生不同的hashCode编码
		}
		//System.out.println(s);
		// 执行循环之后: 获取剩余空间
		long fm2 = Runtime.getRuntime().freeMemory();

		// 执行循环之后: 获取当前毫秒数
		long ctm2 = System.currentTimeMillis();

		System.out.println("String类占用空间:" + (fm1 - fm2));
		System.out.println("String类占用时间:" + (ctm2 - ctm1));
	}

}
