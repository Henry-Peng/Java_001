package com.peng.work;
/**
 * 公交车线路与乘车的价格
 * @author pfh
 * @date 2020年5月14日
 */
public class BusWay {

	public static void main(String[] args) {
		String[] station = {"起点站:新火车站北临时广场","第2站:橘子国花园","第3站:平河路江月路西","第4站:江星桥",
				"第5站:虎丘北门","第6站:虎丘西路","第7站:苏州车管所","第8站:鹿山路广东路东","第9站:鹿山路珠江路西",
				"第10站:鹿山路金枫路西","第11站:鹿山路湘江路西","第12站:国家环保产业园A区","终点站:太湖湿地公园"};
		
		//创建乘车对象
		Riding riding = new Riding("苏州快线3路公交车","第2站:橘子国花园","第8站:鹿山路广东路东");
		
		//初始化乘车站位置,下车站位置
		int startStationNumber = 0;
		int destinationNumber = 0;
		
		for (int i = 0; i < station.length; i ++) {
			if (station[i].equals(riding.getStartStation())) {
				startStationNumber = i + 1;
			}
			if (station[i].equals(riding.getDestination())) {
				destinationNumber = i + 1;
			}
		}
		
		//如果乘车站位置&下车站位置有一个为0,表示信息出现错误
		if (startStationNumber == 0 || destinationNumber == 0) {
			System.out.println("乘车信息输入错误");
		}else {
			int price = (destinationNumber - startStationNumber - 1) / 4 +1;//每过4个站点加一元钱
			riding.setPrice(price);
		}
		System.out.println(riding);
		
	}

}
