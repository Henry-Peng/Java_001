package com.peng.file;

import java.io.File;

/**
 * 获取某个盘符下的:可用空间,总空间
 * @author pfh
 * @date 2020年5月18日
 */
public class FileDemo06 {

	public static void main(String[] args) {
		File dir = new File("d:");//盘符可以大写也可以小写
		long freeSpace = dir.getFreeSpace();//空闲空间,单位:字节
		long totalSpace = dir.getTotalSpace();//总容量
		long usableSpace= dir.getUsableSpace();//可用空间
		System.out.println("自由空间: " + freeSpace + "字节,即:" + (double)(freeSpace/1024/1024/1024) + "G");
		System.out.println("总空间: " + totalSpace + "字节,即:" + (double)(totalSpace/1024/1024/1024) + "G");
		System.out.println("可用空间: " + usableSpace + "字节,即:" + (double)(usableSpace/1024/1024/1024) + "G");//可用空间

	}

}
