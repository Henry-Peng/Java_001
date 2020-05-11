package com.peng.list;

import java.util.HashMap;
import java.util.Map;

import com.peng.time.DateShow;
/**
 * HashMap测试方法类:
 * @author pfh
 * @date 2020年5月9日
 */
public class HashMapTest {

	public static void main(String[] args) {
		//创建对象
		//K:包装类型,string类型
		Map<String, String> map = new HashMap<>();
		System.out.println("map没有添加数据前:" + map.isEmpty());
		
		//1).put<K,V> ,K唯一
		map.put("shopId", "荣耀20");
		//map.put("shopId", "荣耀30");//相同的K,会把前面的覆盖
		map.put("02", "可乐");
		map.put("03", "食品");
		DateShow dateShow = new DateShow();
		map.put("time", dateShow.formatDate("HH:mm:ss"));
		
		System.out.println("map.get(\"02\"):\t" + map.get("02"));
		System.out.println(map.toString());//HashMap重写了toString方法
		
		System.out.println("map长度: " + map.size());
		//.isEmpty()判断是否为空
		System.out.println("map添加数据后:" + map.isEmpty());
		
		System.out.println(map.containsKey("02"));
		System.out.println(map.containsValue("食品"));
		
		//putAll
		Map<String, String> map2 = new HashMap<>();
		map2.put("04", "服饰");
		map2.putAll(map);//把map集合的数据都传给Map2
		System.out.println(map2.toString());
		System.out.println(map2.put("05", "玩具"));//null,返回void
		System.out.println(map2.toString());//{02=可乐, 03=食品, 04=服饰, 05=玩具, shopId=荣耀20, time=16:19:09}
		
		//getOrDefault
		System.out.println(map2.get("06"));//null
		System.out.println(map2.getOrDefault("06", "小汽车"));//小汽车
		System.out.println(map2.toString());
	}

}
