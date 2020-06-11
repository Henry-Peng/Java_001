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
public class HotelXmlTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws DocumentException {
		System.out.println("began..");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("src\\com\\peng\\xml_work\\hotelWriterXml.xml");
		Element root = document.getRootElement();
		
		Iterator<Element> hotels = root.elementIterator();
		while (hotels.hasNext()) {
			Element hotel = hotels.next();
			Attribute hotelName = hotel.attribute("hotelName");
			
			String[] hotelAll = {"address","types","prices","vipPrices","coupons"};
			Element[] hotelAtt = new Element[hotelAll.length];
			for (int i = 0; i < hotelAll.length ;i++) {
				hotelAtt[i] = hotel.element(hotelAll[i]);
			}
			System.out.println("酒店名称:" + hotelName.getText() + "\n\t地址:" + hotelAtt[0].getStringValue());		
			showHotel(hotelAtt);	
		}
		System.out.println("end...");
	}
	
	@SuppressWarnings("unchecked")
	public static void showHotel(Element[] hotelAtt) {
		String[] hotel = {"type","price","vipPrice","coupon"};
		Element[][] hotels = new Element[hotel.length][5];
		int j = 0;
		for (int i = 0; i < hotel.length; i++) {
			Iterator<Element> hoIterator = hotelAtt[i + 1].elementIterator();
			j = 0;
			while (hoIterator.hasNext()) {
				hotels[i][j] = hoIterator.next();
				j ++;	
			}
		}
		//System.out.println(j);
		for(j--;j >= 0;j--){
			System.out.println("房型:" + hotels[0][j].getStringValue() + "\t门市价:" + hotels[1][j].getStringValue() 
					+ "元\t会员专享价:" + hotels[2][j].getStringValue() + "元\t代金券:" + hotels[3][j].getStringValue() + "元");
		}

	}

}
