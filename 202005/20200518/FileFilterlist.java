package com.peng.file;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 实现过滤器类
 * @author pfh
 * @date 2020年5月18日
 */
public class FileFilterlist implements FilenameFilter {
	
	private String suffix;
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public FileFilterlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileFilterlist(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		//System.out.println(dir + "==" + name);
		return name.endsWith(suffix);
	}

	
	/*public boolean accept(File dir, String name) {
		//System.out.println(dir.getName());
		//System.out.println(dir + "," + name);
		return false;//默认放行,全部不选中
	}*/

}
