package com.peng.implrunnable;

import java.util.UUID;

import com.peng.util.ImgDownload;

/**
 * 多线程继承方式:多张图片下载
 * 		1.调用ImgDownload的类
 * @author pfh
 * @date 2020年5月25日
 */
public class ImgLoadRunnable implements Runnable {
	
	
	private String url;//图片的网络地址
	private String reName;//下载之后的图片命名名称

	public ImgLoadRunnable(String url, String reName) {
		this.url = url;
		this.reName = reName;
	}
	public ImgLoadRunnable() {	
	}

	public void run() {
		ImgDownload imgDownload = new ImgDownload();
		imgDownload.downLoad(url, reName);//调用图片下载的方法
		System.out.println("下载之后的图片名称:" + reName);
	}
	
	public static void main(String[] args) {
		String url = "http://p8.qhimg.com/t011fa174426b9adbbf.png" ;
		String url2 = "http://p8.qhimg.com/t0195b7243f682baef3.png";
		//多线程的下载操作
		ImgLoadRunnable imgLoad1 = new ImgLoadRunnable(url, UUID.randomUUID() + "1.png");
		ImgLoadRunnable imgLoad2 = new ImgLoadRunnable(url2, System.currentTimeMillis() + "2.png");
		
		new Thread(imgLoad1).start();//启动线程
		new Thread(imgLoad2).start();

	}

}
