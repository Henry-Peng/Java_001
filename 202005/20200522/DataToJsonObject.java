package com.peng.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * java数据转换成JSONObject类对象 ,
 * 		K,V;键值对
 * @author pfh
 * @date 2020年5月21日
 */

public class DataToJsonObject {

	public static void main(String[] args) {
		creatJson();
	}

	public static JSONObject creatJson() {
		// 创建JSONObject对象
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", 1);
		jsonObject.put("name", "小白杨");
		jsonObject.put("age", 18);//后面输入相同的key值,会把前面的覆盖
		jsonObject.put("address", "上海");
		
		// 数组: 爱好
		List<String> hobbys = new ArrayList<>();
		hobbys.add("singing");
		hobbys.add("dancing");
		jsonObject.put("hobbys", hobbys);

		// 数组
		Map<String, String> homes = new HashMap<String, String>();
		homes.put("old", "xingming");
		homes.put("new", "xiangcheng");
		jsonObject.put("homes", homes);

		//System.out.println(jsonObject);

		//System.out.println(jsonObject.get("hobbys"));
		//System.out.println(jsonObject.get("homes"));
		return jsonObject;

	}

}
