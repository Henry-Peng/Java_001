package com.peng.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 1.字符串转换成JSONObject对象
 * 2.字符串数组转化为JSONArray对象
 * 3.字符串转换成Map接收
 * 4.字符串转换成JavaBean接收
 * 5.使用List接收数据
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonParseAllMethod {
	/*
	 * 个人观点:JSONObject对象可以看做是一个特殊的Map集合,像仓库
	 * JSONObject方法也可以看做是字符串类型与其他各种类型之间的转换器
	 * 
	 * 简洁点就是,json是中间转换仓库(以<K,V>方式存储)
	 * Map<String, Object> map = jsonObject;
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 下面两行是JSONObject对象与String的转换
		 * 可以缩写为JSONObject jsonObject = DataToJsonObject.creatJson();
		 */
		String string = DataToJsonObject.creatJson().toString();//String内容可以试验别的内容
		JSONObject jsonObject = JSONObject.parseObject(string);
		//stringToJSONObject(jsonObject);
		//stringToJSONArray(jsonObject);
		stringToMap(jsonObject);
		//stringToJavaBean(jsonObject);
		//StringToList(jsonObject);

	}
	
	/**
	 * 1.字符串转换成JSONObject对象 
	 */
	public static  void stringToJSONObject(JSONObject jsonObject) {
		//System.out.println(jsonObject.getString("name"));
		for (String key : jsonObject.keySet()) {
			System.out.println(key + ": " + jsonObject.getString(key));
		}
	}
	
	/**
	 * 2.字符串数组转化为JSONArray对象
	 */
	public static  void stringToJSONArray(JSONObject jsonObject) {
		JSONArray jsonArray = JSONObject.parseArray(jsonObject.get("hobbys").toString());
		//JSONArray jsonArray = JSONObject.parseArray("[\"singing\",\"dancing\"]");//和上一行一样的效果
		for (Object object : jsonArray) {
			System.out.println(object);
		}
		
		/*List<Object> jsonArrays = JSONObject.parseArray("[\"singing\",\"dancing\"]");//和上一行一样的效果
		for (Object object : jsonArrays) {
			System.out.println(object);
		}*///和上面也是一样的效果
		
	}
	
	/**
	 * 3.字符串转换成Map接收
	 */
	public static  void stringToMap(JSONObject jsonObject) {
		/*
		 * 方式一:该方式有力的证明了:JSONObject对象与map集合的相似性
		 */
		Map<String, Object> map1 = jsonObject;
		System.out.println(map1);
		System.out.println(jsonObject);//这两行输出完全一致
		
		/*
		 * 方式二
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		for (String key : jsonObject.keySet()) {
			map.put(key, jsonObject.get(key));
		}
		
		
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key) + "//" + map1.get(key));
		}
	
	}
	
	/**
	 * 4.字符串转换成JavaBean接收
	 */
	public static void stringToJavaBean(JSONObject jsonObject) {
		User user = JSONObject.parseObject(jsonObject.toJSONString(), new TypeReference<User>(){});
		System.out.println(user);
	}
	
	/**
	 * 5.使用List接收数据
	 */
	public static void StringToList(JSONObject jsonObject){
		List<User> users = new ArrayList<>();
		String[] hobbys = {"i","j"};
		Map<String, String> homes = new HashMap<>();
		homes.put("new", "linhai");
		homes.put("old", "cangshan");
		
		users.add(new User(3, 22, "张三", "北京", hobbys));
		users.add(new User(4, 23, "李四", "河北", hobbys, homes));
		
		User user = JSONObject.parseObject(jsonObject.toJSONString(), new TypeReference<User>(){});
		users.add(user);
		
		List<User> listUser = JSONObject.parseObject(JSON.toJSONString(users), new TypeReference<ArrayList<User>>(){});
		
		System.out.println(listUser.size());
		for (User u : listUser) {
			System.out.println(u);
		}
	}

}
