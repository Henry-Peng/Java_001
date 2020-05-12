package com.peng.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对象关系映射:ORM
 * 一行数据存储映射在Map中
 * 每条Map中的数据存在List集合
 * @author pfh
 * @date 2020年5月12日
 */
public class ORMMaPTest {

	public static void main(String[] args) {
		Map<String, Object> us1 = new HashMap<String, Object>();
		us1.put("id", 1);
		us1.put("userName", "张三");
		us1.put("password", "111111");
		us1.put("address", "上海");
		us1.put("sex", '男');
		
		Map<String, Object> us2 = new HashMap<String, Object>();
		us2.put("id", 1);
		us2.put("userName", "张三");
		us2.put("password", "111111");
		us2.put("address", "上海");
		us2.put("sex", '男');
		
		List<Map<String, Object>> userList = new ArrayList<Map<String,Object>>();
		userList.add(us1);
		userList.add(us2);
		
		int i = 0;
		for(Map<String, Object> map : userList){
			i ++;
			for (String key: map.keySet()) {
				System.out.println("第" + i + "个对象的:" + key + "=" + map.get(key));
			}
		}
	
	}

}
