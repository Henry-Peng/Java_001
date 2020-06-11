package com.peng.json;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;

/**
 * 解码:字符串(前面编码的数据,JsonObject)获得数据出来
 * 		parseXXXMethodName(静态方法)
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonToValTest {

	public static void main(String[] args) {
		//oldMethodData("{\"address\":\"上海\",\"hobbys\":[\"singing\",\"dancing\"],\"name\":\"小白杨\",\"homes\":{\"new\":\"xiangcheng\",\"old\":\"xingming\"},\"id\":1,\"age\":18}\r\n");
		
		newMethodData(DataToJsonObject.creatJson().toString());//toJSONString,一样
	}
	
	private static void newMethodData(String jsonStr) {
		JSONObject user = JSONObject.parseObject(jsonStr);//把拿到的字符串转化为JSONObject对象
		//get(key)取得对应的值
		//Object name = user.get("name");//小白杨
		//String name = user.getString("name");//小白杨
		//System.out.println(name);
		
		//System.out.println(user.getString("id"));//1
		//System.out.println(user.getIntValue("id"));//1
		//System.out.println(user.getDoubleValue("id"));//1.0
		//System.out.println(user.getIntValue("age"));//18
		
		/*
		 * 取数组,转换成数组方式
		 */
		/*JSONArray jsonArray = user.getJSONArray("hobbys");//["singing","dancing"]
		System.out.println(jsonArray);
		for (Object object : jsonArray) {
			System.out.println(object.toString());//单独object也可
		}
		//另一种方式(挺麻烦的)
		List<String> hobbys = JSON.parseArray(jsonArray.toJSONString(), String.class);
		for (String h : hobbys) {
			System.out.println(h);
		}*/
		//前面两种的混合方式,使用List<Object>对象来承载数组
		List<Object> jsonArrays = user.getJSONArray("hobbys");//["singing","dancing"]
		System.out.println(jsonArrays);
		for (Object object : jsonArrays) {
			System.out.println(object.toString());//单独object也可
		}
			
		//用集合来取json中集合的值
		Map<String, Object> jsonMap = user.getJSONObject("homes");
		System.out.println(jsonMap);
		Set<String> keySet = jsonMap.keySet();
		for (String string : keySet) {
			System.out.println(string + ": " +jsonMap.get(string));
		}

		//以keySet()方式输出全部的值,key=String类型
		Set<String> keySets = user.keySet();
		for (String string : keySets) {
			System.out.println(user.get(string));
		}
	}

	public static void oldMethodData(String jsonStr) {
		
		//与解码相关联的类
		JSONObject user = JSONObject.parseObject(jsonStr);//把拿到的字符串转化为JSONObject对象
		//get(key)取得对应的值
		//Object name = user.get("name");//小白杨
		//String name = user.getString("name");//小白杨
		//System.out.println(name);
		
		//System.out.println(user.getString("id"));//1
		//System.out.println(user.getIntValue("id"));//1
		//System.out.println(user.getDoubleValue("id"));//1.0
		//System.out.println(user.getIntValue("age"));//18
		
		/**
		 * 取数组,转换成数组方式
		 */
		/*JSONArray jsonArray = user.getJSONArray("hobbys");//["singing","dancing"]
		System.out.println(jsonArray);
		for (Object object : jsonArray) {
			System.out.println(object.toString());//单独object也可
		}
		//另一种方式(挺麻烦的)
		List<String> hobbys = JSON.parseArray(jsonArray.toJSONString(), String.class);
		for (String h : hobbys) {
			System.out.println(h);
		}*/
		//前面两种的混合方式,使用List<Object>对象来承载数组
		List<Object> jsonArrays = user.getJSONArray("hobbys");//["singing","dancing"]
		System.out.println(jsonArrays);
		for (Object object : jsonArrays) {
			System.out.println(object.toString());//单独object也可
		}
			
		//用集合来取json中集合的值
		Map<String, Object> jsonMap = user.getJSONObject("homes");
		System.out.println(jsonMap);
		Set<String> keySet = jsonMap.keySet();
		for (String string : keySet) {
			System.out.println(string + ": " +jsonMap.get(string));
		}

		//以keySet()方式输出全部的值,key=String类型
		Set<String> keySets = user.keySet();
		for (String string : keySets) {
			System.out.println(user.get(string));
		}
		
	}

}
