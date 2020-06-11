package com.peng.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import com.peng.enu.User;

/**
 * 写对象的序列化操作:
 * 		ObjectOutputStream(out)
 * 		.writeObject(new 封装类)
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo12ObjOutPutStr {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.object"));
		User user = new User(2, "李白");//public class User implements Serializable
		oos.writeObject(user);//对象必须要实现序列化的接口,正确方式见前一行
		
		
		oos.close();
	}

}
