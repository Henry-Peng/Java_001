package com.peng.demoxml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 读取XML文件内容:
 * 		1.创建关联类对象:SAXReader 定义saxReader
 * 		2.saxReader.read获得document(文档)对象
 * 		3.通过document对象获得根元素(getRootElements()) 定义:shops
 * 		4.通过shops根元素循环获得下面的子元素(shop,id[获得名称与值],shopName...[获得名称与文本])
 * @author pfh
 * @date 2020年5月19日
 */
public class ReadXmlTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws DocumentException {
		//1.创建关联对象
		SAXReader saxReader = new SAXReader();
		
		//获得document对象
		Document document = saxReader.read(new File("src\\shops.xml"));

		//根元素
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());
		
		//循环获得下面的子元素
		Iterator<Element> shops = rootElement.elementIterator();
		//System.out.println(rootElement);
		while (shops.hasNext()) {
			Element shop = shops.next();
			Attribute id = shop.attribute("id");
			System.out.println(id.getName() + "," + id.getStringValue());
			
			String[] shopArrays = {"shopName","price","num","address"}; 
			for (String string : shopArrays) {
				Element shopArray = shop.element(string);
				System.out.println("\t" + shopArray.getName() + ":" + shopArray.getText());
			}
			
		}
		
	}

}
