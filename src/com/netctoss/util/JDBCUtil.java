package com.netctoss.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 抽取JDBC连接公共代码
 * @author pfh
 * @date 2020年7月15日
 */
public class JDBCUtil {
	static ComboPooledDataSource dataSource = null;
	
	static {
		dataSource = new ComboPooledDataSource();
	}
	
	public static ComboPooledDataSource getDataSource(){
		return dataSource;
	}
	/**
	 * 获取数据库的连接对象,同步
	 * @throws SQLException 
	 */
	public  synchronized static Connection getConnection(){
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	/**
	 * 关闭资源操作,两个关闭,三个关闭
	 */
	public static void close(Connection connection,PreparedStatement ps){
		try {
			if (ps != null) {
				ps.close();
				//System.out.print("关闭PreparedStatement成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (connection != null) {
				connection.close();
				//System.out.println("关闭connection成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection,PreparedStatement ps,ResultSet rs){
		try {
			if (rs != null) {
				rs.close();
				//System.out.print("关闭resultSet成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (ps != null) {
				ps.close();
				//System.out.print("关闭PreparedStatement成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (connection != null) {
				connection.close();
				//System.out.println("关闭connection成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
