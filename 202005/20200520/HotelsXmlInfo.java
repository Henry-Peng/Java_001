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
public class HotelsXmlInfo {

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
			
			Element address = hotel.addElement("address");
			Element types = hotel.addElement("types");
			address.addText(hotelAddress[i]);			
			switch (i++) {
			case 0:
				hotelInfo0(types);
				break;
			case 1:
				hotelInfo1(types);
				break;
			case 2:
				hotelInfo2(types);
				break;
			}
		}
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter = new XMLWriter(new FileWriter("src\\com\\peng\\xml_work\\hotelsWriterXml.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
		
		System.out.println("end...");
	}

	public static void hotelInfo0(Element types) {
		String[] typesNames = {"大-床-房   ","标----间","豪华双床房"};
		String[] prices = {"189","169","209"};
		String[] vipPrices = {"161","149","190"};
		String[] coupons = {"20","10","30"};
		for(int i = 0; i < typesNames.length;i++){
			Element type = types.addElement("type");
			type.addAttribute("typeName", typesNames[i]);
			Element price = type.addElement("price");
			Element vipPrice = type.addElement("vipPrice");
			Element coupon = type.addElement("coupon");
			price.addText(prices[i]);
			vipPrice.addText(vipPrices[i]);
			coupon.addText(coupons[i]);
		}
	}
	
	public static void hotelInfo1(Element types) {
		String[] typesNames = {"豪华双床房"};
		String[] prices = {"399"};
		String[] vipPrices = {"339"};
		String[] coupons = {"20"};
		for(int i = 0; i < typesNames.length;i++){
			Element type = types.addElement("type");
			type.addAttribute("typeName", typesNames[i]);
			Element price = type.addElement("price");
			Element vipPrice = type.addElement("vipPrice");
			Element coupon = type.addElement("coupon");
			price.addText(prices[i]);
			vipPrice.addText(vipPrices[i]);
			coupon.addText(coupons[i]);
		}
	}
	
	public static void hotelInfo2(Element types) {
		String[] typesNames = {"高级大床房"};
		String[] prices = {"189"};
		String[] vipPrices = {"161"};
		String[] coupons = {"10"};
		for(int i = 0; i < typesNames.length;i++){
			Element type = types.addElement("type");
			type.addAttribute("typeName", typesNames[i]);
			Element price = type.addElement("price");
			Element vipPrice = type.addElement("vipPrice");
			Element coupon = type.addElement("coupon");
			price.addText(prices[i]);
			vipPrice.addText(vipPrices[i]);
			coupon.addText(coupons[i]);
		}
	}

}
