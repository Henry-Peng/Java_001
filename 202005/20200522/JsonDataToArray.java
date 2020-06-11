package com.peng.json;

import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 字符串转换成数组
 * @author pfh
 * @date 2020年5月21日
 */
public class JsonDataToArray {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//JSONObject jsonObject = JSONObject.parseObject(DataToJsonObject.creatJson().toJSONString());
		JSONObject jsonObject = DataToJsonObject.creatJson();//前一行简化格式
		//System.out.println(jsonObject);
		
		/*
		 * json--> 数组
		 */
		//JSONArray hobbys = JSONObject.parseArray(jsonObject.getString("hobbys"));
		JSONArray hobbys = jsonObject.getJSONArray("hobbys");//前一行简化格式
		System.out.println(hobbys);
		
		String[] newHobbys = new String[hobbys.size()];
		int i = 0;
		for (Object hobby : hobbys) {
			//System.out.println(hobby);
			newHobbys[i++] = hobby.toString();
		}
		
		/*
		 * json--> map
		 */
		Map<String, String> homes = (Map<String, String>) jsonObject.get("homes");
		
		//Map<String, Object> homes = jsonObject.getJSONObject("homes");//Map<String, String>要改为Map<String, Object>
		
		User user = new User();
		user.setAddress(jsonObject.getString("address"));
		user.setAge(jsonObject.getIntValue("age"));
		user.setId(jsonObject.getIntValue("id"));
		user.setName(jsonObject.getString("name"));
		
		user.setHobbys(newHobbys);
		user.setHomes(homes);
		//System.out.println(homes.get("new"));
		System.out.println(user);
		
	}

}
