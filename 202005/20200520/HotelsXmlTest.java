package com.peng.xml_work;

import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * hotelWriter.xml文件的读取
 * @author pfh
 * @date 2020年5月20日
 */
public class HotelsXmlTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws DocumentException {
		System.out.println("began..");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("src\\com\\peng\\xml_work\\hotelsWriterXml.xml");
		Element root = document.getRootElement();
		
		Iterator<Element> hotels = root.elementIterator();
		while (hotels.hasNext()) {
			Element hotel = hotels.next();
			Attribute hotelName = hotel.attribute("hotelName");			
			Element address = hotel.element("address");
			Element types = hotel.element("types");
			
			System.out.println("酒店名称:" + hotelName.getText() + "\n\t地址:" + address.getStringValue());		
			showHotel(types);	
		}
		System.out.println("end...");
	}
	
	@SuppressWarnings("unchecked")
	public static void showHotel(Element types) {
		Iterator<Element> typeIterator = types.elementIterator();
		while(typeIterator.hasNext()){
			Element type = typeIterator.next();
			Attribute typeName = type.attribute("typeName");
			Element price = type.element("price");
			Element vipPrice = type.element("vipPrice");
			Element coupon = type.element("coupon");
			System.out.println("房型:" + typeName.getStringValue() + "\t门市价:" + price.getStringValue()
					+ "元\t会员专享价:" + vipPrice.getStringValue() + "元\t代金券:" + coupon.getStringValue() + "元");

		}		
	}	
	
}
