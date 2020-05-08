package com.peng.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 泛型:
 * @author pfh
 * @date 2020年5月8日
 */
public class TEVTest {

	public static void main(String[] args) {
		Collection<Integer> cc = new ArrayList<Integer>();
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");//赋值,string类型
		list.add("jkl");
		list.set(1, "ujm");//设置1#为ujm,有替换的意思
		System.out.println(list.get(1));//ujm,取值
		list.add("def");
		System.out.println(list);//[abc, ujm, def]

		
		Map<Integer, String> userMap =new HashMap<>();
		userMap.put(1, "ab");
		userMap.put(2, "cd");
		System.out.println(userMap);//{1=ab, 2=cd}
		
		Map<String, String> userMap2 =new HashMap<>();
		userMap2.put("one", "ab");
		userMap2.put("two", "cd");
		System.out.println(userMap2.get("one"));//ab
		System.out.println(userMap2);//{one=ab, two=cd}
		
		Set<String> set = new HashSet<>();
		set.add("afg");
		System.out.println(set);
		
	}

}












