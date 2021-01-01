package com.peng.crm.utils;

public class Test {
	public static void main(String[] args) {
		String modelName = "user_name_joke";
		
		modelName = modelName.substring(0, 1).toUpperCase() + modelName.substring(1);
		//删除下划线,并且将名称改为大驼峰式
		//user_name   
		//UserName
		while(modelName.indexOf('_') >= 0){
			int i = modelName.indexOf('_');
			modelName = modelName.substring(0,i)
					+ modelName.substring(i+1,i+2).toUpperCase()
					+ modelName.substring(i+2);
		}
		//
		System.out.println(modelName.lastIndexOf('_'));
		//aString = aString.substring(1) + aString.substring(1);
		System.out.println(modelName);
	}

}
