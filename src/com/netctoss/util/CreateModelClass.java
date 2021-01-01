package com.netctoss.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * 根据数据库内的表格内容自动生成entity类型
 * (方便移植)
 * @author pfh
 * @date 2020年6月12日
 */
public class CreateModelClass {
	private static Connection connection = null;
	private static String packageName;
	static {
		packageName = "com.net.entity.pojo";//此处设置model类的包名称
	}

	public static void main(String[] asgr) {
		createAllModel("hospital");//为该数据库中所有表格建立model类
		//createModel("hospital", "doctors", "doctors");//单独为一个表格创建,参数一是数据库名,参数二是数据库表格名,参数三是生成的model类名称
	}
	
	/**
	 * 使用jdbc建立与数据库的连接
	 * @param database 数据库名称
	 * @return Connection 返回与数据库的连接
	 */
	public static Connection getConnection(String database) {
		String url = "jdbc:mysql://localhost:3306/" + database;// 数据源(mysql)的连接地址
		String user = "root";// 用户名
		String password = "root";// 用户密码

		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载驱动程序
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 执行此方法将自动生成指定数据库所有表格的model类
	 * model类名称默认为表格名称(首字母大写)
	 * 生成的model类放在com.netctoss.entity包中
	 * @param database 数据库名
	 */
	public static void createAllModel(String database) {
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		
		// SQL语句,用于查询出该数据库的所有表格
		String sql = "SHOW TABLES;";

		try {
			connection = getConnection(database);
			// 创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			ps = connection.prepareStatement(sql);
			// 执行查询语句,执行后返回代表查询结果的ResultSet对象。
			resultSet = ps.executeQuery();
			
			/*
			 * 循环生成表格对应的model类
			 */
			while (resultSet.next()) {
				String tableName = resultSet.getString(1);//获取表格名称
				createModel(database, tableName, tableName); //执行生成model类
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection, ps, resultSet);
		}
	}
	
	/**执行此方法将自动生成指定表格的model类
	 * 生成的model类放在com.netctoss.entity包中
	 * 参数一是数据库名,参数二是数据库表格名,参数三是生成的model类名称
	 * @param database
	 * @param tableName
	 * @param modelName
	 */
	public static void createModel(String database, String tableName, String modelName) {
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		
		// 拼接SQL语句,用于查询出该表的所有字段
		String sql = "select * from " + tableName;
		
		try {
			connection = getConnection(database);
			// 创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			ps = connection.prepareStatement(sql);
			// 执行查询语句,执行后返回代表查询结果的ResultSet对象。
			resultSet = ps.executeQuery();
			
			// 获取此 ResultSet 对象的列的编号、类型和属性。
			ResultSetMetaData rsmd = resultSet.getMetaData();
			
			// 获取表中的列数
			int count = rsmd.getColumnCount();
			
			// model类名的首字母一定要大写
			modelName = modelName.substring(0, 1).toUpperCase() + modelName.substring(1);
			
			// 拼接model类的路径
			File file = createNewFile(modelName);
			// 创建输出流
			OutputStream out = new FileOutputStream(file);
			
			// 拼接model类中的数据
			StringBuffer sbf = new StringBuffer();
			sbf.append("package " + packageName + ";\n\n");
			sbf.append("import java.io.Serializable;\n\n");
			sbf.append("public class " + modelName + " implements Serializable{\n\n");
			sbf.append("\tprivate static final long serialVersionUID = 1L;\n\n");
			
			/*
			 *  生成字段属性
			 *  存储成员变量信息, names[]:变量名, types[]:变量类型
			 */
			String[] names = new String[count + 1];// 0位空闲,1位对应数据库表格第一列
			String[] types = new String[count + 1];
			for (int i = 1; i <= count; i++) {//从1开始是因为列段属性从1开始计数
				// 把字段类型转换成小写
				types[i] = rsmd.getColumnTypeName(i).toLowerCase();
				// 把数据库的数据类型改成java数据类型(alterType()该方法在下面单独封装了起来)
				types[i] = alterType(types[i]);
				// 把字段名称首字母转成小写(如果不需要转,则直接使用rsmd.getColumnLabel(i)即可)
				/*names[i] = rsmd.getColumnLabel(i).substring(0, 1).toLowerCase()
						+ rsmd.getColumnLabel(i).substring(1);*/
				names[i] = rsmd.getColumnLabel(i);
				// 生成字段属性
				sbf.append("\tprivate " + types[i] + " " + names[i] + ";\n");
			}
			sbf.append("\n");
			
			// 生成get和set方法
			for (int i = 1; i <= count; i++) {
				// 把方法get/set字段首字母名称大写
				String getsetName = rsmd.getColumnLabel(i).substring(0, 1).toUpperCase()
						+ rsmd.getColumnLabel(i).substring(1);
				// get方法
				sbf.append("\tpublic " + types[i] + " get" + getsetName + "() {\n\t\treturn " + names[i] + ";\n\t}\n");
				// set方法
				sbf.append("\tpublic void set" + getsetName + "(" + types[i] + " " + names[i] + ") {\n\t\tthis." + names[i] + " = "
						+ names[i] + ";\n\t}\n");
			}
			sbf.append("\n");
			
			// 生成构造方法(无参和全参)
			sbf.append("\tpublic " + modelName + "() {\n\n\t}\n");
			sbf.append("\tpublic " + modelName + "(");
			for (int i = 1; i <= count; i++) {
				sbf.append(types[i] + " " + names[i] + ", ");
				//每五个变量换行一次
				if ((i % 5) == 0) {
					sbf.append("\n\t\t\t");
				}
			}
			sbf.deleteCharAt(sbf.lastIndexOf(","));//删除尾部的","
			sbf.append(") {\n");
			for (int i = 1; i <= count; i++) {
				sbf.append("\t\tthis." + names[i] + " = " + names[i] + ";\n");
			}
			
			sbf.append("\t}\n\n");
			sbf.append("}");
			out.write(sbf.toString().getBytes());
			out.flush();
			out.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//close(connection, ps, resultSet);
		}
	}

	// 查询的关闭资源操作,三个关闭
	public static void close(Connection connection, PreparedStatement ps, ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将数据库类型转换成相应的java类型
	 * @param type
	 * @return
	 */
	public static String alterType(String type) {

		// 当数据库中的数据类型与java类型不一致时,就转换成相应的java类型
		if (type.equalsIgnoreCase("varchar") || type.equalsIgnoreCase("char") || type.equalsIgnoreCase("datetime")
				|| type.equalsIgnoreCase("date") || type.equalsIgnoreCase("time") || type.equalsIgnoreCase("year")
				 || type.equalsIgnoreCase("timestamp")) {
			type = "String";
		}
		if (type.equalsIgnoreCase("bigint")) {
			type = "long";
		}
		if (type.equalsIgnoreCase("decimal")) {
			type = "double";
		}
		if (type.equalsIgnoreCase("binary") || type.equalsIgnoreCase("tinyint")) {
			type = "byte";
		}
		// 相同类型的type直接传递回去
		return type;
	}
	
	/**
	 * 创建指定目录下的目标文件
	 * @param modelName
	 * @return modelName.java
	 * @throws IOException 
	 */
	public static File createNewFile(String modelName) throws IOException {
		/*
		 *  model路径名,创建多级目录
		 */
		String path = "src/" + packageName.replace(".", "/");
		File file = new File(path);
		file.mkdirs();
		/*
		 * 文件路径名,创建一个新的空文件
		 */
		path = path + "//" + modelName + ".java";
		file = new File(path);
		file.createNewFile();
		/*
		 *  检查目标文件是否存在
		 */
		if (file.exists()) {
			System.out.println(modelName + ".java" + "已经创建成功");
		}else {
			System.out.println(modelName + ".java" + "创建失败");
		}
		return file;
	}
	
}
