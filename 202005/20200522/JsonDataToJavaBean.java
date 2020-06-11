package com.peng.json;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 字符串转换为JavaBean[字符串的key与User类的成员变量一一对应]
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonDataToJavaBean {

	public static void main(String[] args) {
		//json的key与User类的成员变量一一对应: 名称要相同,值的类型也要一致
		User user = JSONObject.parseObject(DataToJsonObject.creatJson().toJSONString(), new TypeReference<User>(){});
		System.out.println(user);
		
		JSONObject jsonObject = DataToJsonObject.creatJson();
		Map<String, Object>  map = jsonObject;
		System.out.println(map);
		//System.out.println(jsonObject);
		
		Map<String, String>  map2 = new HashMap<String, String>();
		for (String key : jsonObject.keySet()) {
			map2.put(key, jsonObject.getString(key));
		}
		System.out.println(map2);//和maplve有差异,String和Object
	}

}
