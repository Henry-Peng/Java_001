package com.peng.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


import com.peng.enu.User;

/**
 * 读取已经序列化的对象操作:
 * 		ObjectInputStream(out)
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo12ObjOutPutStr2 {

	public static void main(String[] args) throws Exception {
		System.out.println("began...");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		User user = (User) ois.readObject();
		System.out.println(user.getId() + "," + user.getUserName());

		ois.close();
		System.out.println("end...");
	}

}
