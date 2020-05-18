package com.peng.test;


import java.io.FileWriter;
import java.io.IOException;

/**
 * java代码操作:写数据到某个盘符记事本: 增加try...catch ...finally
 * 1.new FileWriter(与文件产生关联关系)
 * 2.write操作
 * 3.flush:刷新流(把前面写的数据保存)
 * 4.close:关闭流
 * @author pfh
 * @date 2020年5月13日
 */
public class FileWriterExceptionTest {
	
	public static void main(String[] args) {
		System.out.println("开始");
		FileWriter fw = null;//一定要=null,不然close()会报错
		try {
			//runWrite(fw);
			fw = new FileWriter("abc.txt",true);
			fw.write("abcdefg\r");
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("出现问题,请及时解决...");

		}finally {
			try {
				if (fw != null) {
					fw.close();
				}
				
			} catch (IOException e) {
				//e.printStackTrace();
				throw new RuntimeException("fw.close()没有做关闭动作..");
			}
		}
		System.out.println("结束..");
		
	}
	public static void runWrite(FileWriter fw){
		
		//如果不写盘符,则自动创建存放在当前项目下(project)
		//如果有此文件(该项目文件夹下),则把数据写入此文件中
		try {
			fw = new FileWriter("abc.txt");//第二个参数,true
			//\r回到行首,\n换行, "\r\n"为enter键功能
			fw.write("asss\r\tll\nkk\rop\nsl\r\nopq\n\rssr");//  "\r\n"才是回车换行
			fw.write("\n\rk\n\r\rll\r\nkk");
			
			//flush:刷新流(把前面写的数据保存)
			fw.flush();
			fw.write("  edd");
			fw.write("\taa\n\"\\all\r999ll\nlik");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw = new FileWriter("abc.txt");//新建连接之后会清零
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}