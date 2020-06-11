package com.peng.json;

import com.alibaba.fastjson.JSONObject;

/**
 * 字符串转换成JSONObject类
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonDataToObj {

	public static void main(String[] args) {
		/*String value = "12";
		int i = Integer.parseInt(value);
		System.out.println(i);*/
		
		//想要获得字符串(输出的是Json的格式)里面key与value
		JSONObject jsonObject = JSONObject.parseObject(DataToJsonObject.creatJson().toJSONString());
		System.out.println(jsonObject);
		for (String key : jsonObject.keySet()) {
			System.out.println(key + ":" + jsonObject.get(key));
		}
		
		User user = new User();
		user.setAddress(jsonObject.getString("address"));
		//user.setHobbys(jsonObject.get("hobbys"));
		user.setAge(jsonObject.getIntValue("age"));
		user.setId(jsonObject.getIntValue("id"));
		user.setName(jsonObject.getString("name"));
		
		
		System.out.println(user);
	}

}
