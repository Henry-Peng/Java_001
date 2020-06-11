package com.peng.demoxml;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * java代码的方式生成一个xml文件:(进行格式化输出)
 * 		通过DocumentHelper生成一个Document对象
 * @author pfh
 * @date 2020年5月20日
 */
public class WriterXmlTest {

	public static void main(String[] args) throws IOException {
		//创建Document
		Document document = DocumentHelper.createDocument();
		//创建树内容(根元素,子元素,属性,对应的子元素,对应的子元素的文本内容)
		Element root = document.addElement("trees");
		//添加子元素id="1";
		Element tree = root.addElement("tree");
		tree.addAttribute("id", "1");
		Element kind = tree.addElement("kind");
		Element altitude = tree.addElement("altitude");
		Element age = tree.addElement("age");
		Element diameter = tree.addElement("diameter");
		Element area = tree.addElement("area");
		
		kind.addText("白桦");
		altitude.addText("22m");
		age.addText("13years");
		diameter.addText("0.7m");
		area.addText("山坡");
		area.addComment("东侧");
		
		// 添加子元素id="2";
		Element tree2 = root.addElement("tree");
		tree2.addAttribute("id", "2");
		Element kind2 = tree2.addElement("kind");
		Element altitude2 = tree2.addElement("altitude");
		Element age2 = tree2.addElement("age");
		Element diameter2 = tree2.addElement("diameter");
		Element area2 = tree2.addElement("area");

		kind2.addText("白桦");
		altitude2.addText("22m");
		age2.addText("13years");
		diameter2.addText("0.7m");
		area2.addText("山坡");
		area2.addComment("东侧");
		
	/*	//xml生成到哪个路径地址下
		FileWriter fileWriter = new FileWriter("src\\writerXml.xml");
		document.write(fileWriter);
		fileWriter.close();*/
		
		//格式化输出
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter = new XMLWriter(new FileWriter("src\\writerXml.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
		System.out.println("end..");
		
		
	}

}
