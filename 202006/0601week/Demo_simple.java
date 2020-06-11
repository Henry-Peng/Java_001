package com.peng.simple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.peng.utils.DBUtil;

/**
 * 执行sql执行的是preparedStatement:预编译
 * 		关闭资源,从里往外的关闭,优化版本
 * @author pfh
 * @date 2020年6月4日
 */
public class Demo_simple {
	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet resultSet = null;
	public static void main(String[] args) {
		try {
			connection = DBUtil.getConnection("shopping");
			String sql = "select * from user1 u inner join role r on u.roleId = r.id_role;";
			ps = connection.prepareStatement(sql);
			resultSet = ps.executeQuery( );
			while(resultSet.next()){
				System.out.println("name=" + resultSet.getString("name")
				+ ",\tdept=" + resultSet.getString("dept")
				+ ",\troleName=" + resultSet.getString("roleName")
				+ ",\troleId=" + resultSet.getInt("roleId")
				+ ",\troleId1=" + resultSet.getInt("roleId") );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet);
			DBUtil.close(ps);
			DBUtil.close(connection);
		}
	}

}
