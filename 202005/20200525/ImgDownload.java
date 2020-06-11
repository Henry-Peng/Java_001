package com.peng.util;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * 图片下载方法:
 * 		需要提前把commons-io的jar包提前设置到项目环境中
 * @author pfh
 * @date 2020年5月25日
 */
public class ImgDownload {
	
	/**
	 * 写入图片下载
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public void downLoad(String url,String reName) {
		//FileUtils.copyURLToFile(new URL(url), new file(UUID.randomUUID().toString() + ".jpg"));
		try {
			FileUtils.copyURLToFile(new URL(url), new File(ContextUtil.imgDir + reName));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("不合法的URL:" + url);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("下载失败");
		}

	}

}
