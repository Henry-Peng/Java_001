package com.peng.xml_work;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 输出酒店信息,以XML格式
 * @author pfh
 * @date 2020年5月20日
 */
public class HotelXmlInfo {

	public static void main(String[] args) throws IOException {
		System.out.println("began...");
		String[] hotelName = {"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		String[] hotelAddress = {"江苏省苏州市姑苏区人民路2156号","江苏省苏州工业园区星海街169号","江苏省苏州市相城区黄畦路3号"};

		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("hotels");
		int i = 0;
		for (String string : hotelName) {
			Element hotel = root.addElement("hotel");
			hotel.addAttribute("hotelName", string);
			
			Hotel hotels = new Hotel(hotel);
			
			hotels.getAddress().addText(hotelAddress[i]);
			switch (i++) {
			case 0:
				hotelInfo0(hotels);
				break;
			case 1:
				hotelInfo1(hotels);
				break;
			case 2:
				hotelInfo2(hotels);
				break;
			}
		}
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter = new XMLWriter(new FileWriter("src\\com\\peng\\xml_work\\hotelWriterXml.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
		
		System.out.println("end...");
	}

	public static void hotelInfo0(Hotel hotels) {
		String[] types = {"大-床-房   ","标----间","豪华双床房"};
		String[] prices = {"189","169","209"};
		String[] vipPrices = {"161","149","190"};
		String[] coupons = {"20","10","30"};
		for(int i = 0; i < types.length;i++){
			Element type = hotels.getTypes().addElement("type");
			type.addText(types[i]);
			hotels.getPrices().addElement("price").addText(prices[i]);
			hotels.getVipPrices().addElement("vipPrice").addText(vipPrices[i]);
			hotels.getCoupons().addElement("coupon").addText(coupons[i]);
		}
		
	}
	
	public static void hotelInfo1(Hotel hotels) {
		String[] types = {"豪华双床房"};
		String[] prices = {"399"};
		String[] vipPrices = {"339"};
		String[] coupons = {"20"};
		for(int i = 0; i < types.length;i++){
			Element type = hotels.getTypes().addElement("type");
			type.addText(types[i]);
			hotels.getPrices().addElement("price").addText(prices[i]);
			hotels.getVipPrices().addElement("vipPrice").addText(vipPrices[i]);
			hotels.getCoupons().addElement("coupon").addText(coupons[i]);
		}
	}
	
	public static void hotelInfo2(Hotel hotels) {
		String[] types = {"高级大床房"};
		String[] prices = {"189"};
		String[] vipPrices = {"161"};
		String[] coupons = {"10"};
		for(int i = 0; i < types.length;i++){
			Element type = hotels.getTypes().addElement("type");
			type.addText(types[i]);
			hotels.getPrices().addElement("price").addText(prices[i]);
			hotels.getVipPrices().addElement("vipPrice").addText(vipPrices[i]);
			hotels.getCoupons().addElement("coupon").addText(coupons[i]);
		}
	}

}
