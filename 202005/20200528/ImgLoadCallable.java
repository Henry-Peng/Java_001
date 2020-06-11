package com.peng.callable;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import com.peng.util.ContextUtil;
import com.peng.util.ImgDownload;

/**
 * 多线程实现接口方式:implements Callable多张图片下载
 * 		调用ImgDownload的类
 * 
 * 		Callable使用方式:
 * 		1.创建执行服务,返回的对象名称excutorService,设置固定的线程池
 * 		2.通过对象名称excutorService 进行提交submit(new ImgLoadCallable之后的对象名称),返回一个future的结果对象
 * 		3.通过第二步的对象名称调用get()方法得到boolean的值
 * 		4.excutorService去关闭资源
 * @author pfh
 * @date 2020年5月25日
 */
public class ImgLoadCallable implements Callable<Boolean> {
	
	
	private String url;//图片的网络地址
	private String reName;//下载之后的图片命名名称
	
	@Override
	public Boolean call() throws Exception {
		//图片下载类
		ImgDownload img = new ImgDownload();
		img.downLoad(url, reName);
		System.out.println("图片下载之后的地址:" + ContextUtil.imgDir + reName);
		return true;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String url = "http://p8.qhimg.com/t011fa174426b9adbbf.png" ;
		String url2 = "http://p8.qhimg.com/t0195b7243f682baef3.png";
		String url3 = "https://p0.ssl.qhimgs1.com/sdr/400__/t0162d01e8ad600a090.jpg";
		String urlSub = url3.substring(url3.lastIndexOf("."));
		//System.out.println(urlSub);
		String reName = UUID.randomUUID() + urlSub;
		
		ImgLoadCallable imgLoadCallable = new ImgLoadCallable(url3,reName);//只用new一个runnable类,后面的线程通过调用来完成
		ExecutorService e = Executors.newFixedThreadPool(2);
		Future<Boolean> future = e.submit(imgLoadCallable);
		
		boolean b = future.get();
		
		System.out.println("future=" + b);
	
		//多线程的下载操作
		ImgLoadCallable imgLoad1 = new ImgLoadCallable(url, UUID.randomUUID() + "1.png");
		ImgLoadCallable imgLoad2 = new ImgLoadCallable(url2, System.currentTimeMillis() + "2.png");
		ImgLoadCallable imgLoad3 = new ImgLoadCallable(url2, UUID.randomUUID() + "3.png");
		ImgLoadCallable imgLoad4 = new ImgLoadCallable(url, System.currentTimeMillis() + "4.png");
		ImgLoadCallable imgLoad5 = new ImgLoadCallable(url, UUID.randomUUID() + "5.png");
		ImgLoadCallable imgLoad6= new ImgLoadCallable(url2, System.currentTimeMillis() + "6.png");
		
		//1.创建执行的服务
		ExecutorService executorService = Executors.newFixedThreadPool(2);//线程池固定是2个
		//2.提交任务
		Future<Boolean> future1 = executorService.submit(imgLoad1);
		Future<Boolean> future2 = executorService.submit(imgLoad2);
		Future<Boolean> future3 = executorService.submit(imgLoad3);
		Future<Boolean> future4 = executorService.submit(imgLoad4);
		Future<Boolean> future5 = executorService.submit(imgLoad5);
		Future<Boolean> future6 = executorService.submit(imgLoad6);
		
		//3.通过Future得到boolean
		boolean b1 = future1.get();
		System.out.println("future1=" + b1 + ",future2=" + future2.get()
		+ ",future3=" + future3.get()
		+ ",future4=" + future4.get()
		+ ",future5=" + future5.get()
		+ ",future6=" + future6.get()
				);
		
		//4.关闭资源
		executorService.shutdown();
	}
	

	public ImgLoadCallable(String url, String reName) {
		this.url = url;
		this.reName = reName;
	}
	public ImgLoadCallable() {	
	}
	
}
