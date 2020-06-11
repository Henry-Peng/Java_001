package com.peng.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 多个对象一一对应User类的成员变量名称
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonDataToList {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		String[] hobbys = {"i","j"};
		Map<String, String> homes = new HashMap<>();
		homes.put("new", "linhai");
		homes.put("old", "cangshan");
		
		users.add(new User(1, 22, "小白", "苏州" ,new String[]{"打游戏","跳"}));
		users.add(new User(2, 23, "小白", "苏州" ,new String[]{"打游戏","跳"}));

		users.add(new User(3, 22, "张三", "北京", hobbys));
		users.add(new User(4, 23, "李四", "河北", hobbys, homes));
		
		//JSON.toJSONString(users) 将Object转换成JSONString
		List<User> jsonUser = JSONObject.parseObject(JSON.toJSONString(users), new TypeReference<ArrayList<User>>(){});
		System.out.println(jsonUser);
	}

}
