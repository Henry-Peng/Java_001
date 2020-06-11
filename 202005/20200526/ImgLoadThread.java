package com.peng.thread;

import java.util.UUID;

import com.peng.util.ImgDownload;

/**
 * 多线程继承方式:多张图片下载
 * 		1.调用ImgDownload的类
 * @author pfh
 * @date 2020年5月25日
 */
public class ImgLoadThread extends Thread{
	
	private String url;//图片的网络地址
	private String reName;//下载之后的图片命名名称

	public ImgLoadThread(String url, String reName) {
		this.url = url;
		this.reName = reName;
	}
	public ImgLoadThread() {
	}

	@Override
	public void run() {
		ImgDownload imgDownload = new ImgDownload();
		imgDownload.downLoad(url, reName);//调用图片下载的方法
		System.out.println("下载之后的图片名称:" + reName);
	}
	
	public static void main(String[] args) {
		String url = "http://p8.qhimg.com/t011fa174426b9adbbf.png" ;
		String url2 = "http://p8.qhimg.com/t0195b7243f682baef3.png";
		//多线程的下载操作
		ImgLoadThread imgLoadThread1 = new ImgLoadThread(url, UUID.randomUUID() + "1.png");
		ImgLoadThread imgLoadThread2 = new ImgLoadThread(url2, System.currentTimeMillis() + "2.png");
		
		String url3 = "https://p0.ssl.qhimgs1.com/sdr/400__/t0162d01e8ad600a090.jpg";
		String subUrlSuffix = url3.substring(url3.lastIndexOf('.'), url3.length());
		System.out.println(subUrlSuffix);//.jpg
		String renameSub = UUID.randomUUID() + subUrlSuffix ;
		ImgLoadThread imgLoadThread3 = new ImgLoadThread(url3, renameSub);
		
		//start
		imgLoadThread1.start();
		imgLoadThread2.start();
		imgLoadThread3.start();

	}

}
