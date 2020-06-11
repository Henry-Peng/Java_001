package com.peng.xml_work;

import java.io.File;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用XML输出医院系统信息
 * @author pfh
 * @date 2020年5月19日
 */
public class HospitalsXmlTest {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File("src\\com\\peng\\xml_work\\hospitals.xml"));
		Element hospitals = document.getRootElement();
		System.out.println(hospitals.getName());
		
		Element hospital = hospitals.element("hospital");
		Attribute arrays = hospital.attribute("name");
		
		
		System.out.println(hospital.getName());
		System.out.println(arrays.getStringValue());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*@SuppressWarnings("unchecked")
		Iterator<Element> departments = hospital.elementIterator();
		while (departments.hasNext()) {
			Element department = departments.next();
			Attribute arrays = department.attribute("name");
			System.out.println("department:" + arrays.getStringValue());
			String[] departmentArrays = {"area","level"};//,"doctors","patients"
			for (String string : departmentArrays) {
				Element array = department.element(string);
				System.out.print("\t" + array.getName() + ":" + array.getText());
			}
			System.out.println();
			String[] doubleArrays = {"doctors","patients"};
			String[] doubleArray1 = {"directors","doctor","nurses"};
			String[] doubleArray2 = {"ongoing","await"};
			for (String string : doubleArrays) {
				Element array = department.element(string);
				if (string.equals("doctors")) {
					for (String string2 : doubleArray1) {
						Element doc = array.element(string2);
						System.out.print("\t" + doc.getName() + ":" + doc.getText());
					}
					System.out.println();
				}else {
					for (String string2 : doubleArray2) {
						Element pat = array.element(string2);
						System.out.print("\t" + pat.getName() + ":" + pat.getText());
					}
					System.out.println();
				}
				
			}
		
		}*/
	}

}
