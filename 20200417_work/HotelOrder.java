package com.peng.work;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 顾客和服务员沟通选择好酒店确定下单，输出订单信息（价格必须有输出）
 * @author pfh
 * @date 2020年4月19日
 */
public class HotelOrder {

	public static void main(String[] args) {
		welcome();
		int hotel = hotelChoice();
		switch(hotel){
		case 1:
			hotel0();
			break;
		case 2:
			hotel1();
			break;
		case 3:
			hotel2();
			break;
		default:
				System.out.println("输入信息错误");	
		}
		

	}
	
	public static void welcome() {
		System.out.println("欢迎来到订单选购页面,下面是可供选择的酒店:");
		String[] hotelName = {"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		String[] hotelAddress = {"江苏省苏州市姑苏区人民路2156号","江苏省苏州工业园区星海街169号","江苏省苏州市相城区黄畦路3号"};
		double[] minPrice = {149,339,161};
		for(int i=0;i<3;i++){
		System.out.println("酒店"+(i+1)+":"+hotelName[i]+"\t价格:"+minPrice[i]+"起\n\t地址:"+hotelAddress[i]);
		}
	}
	
	public static void hotel0() {
		System.out.println("\t格林豪泰苏州火车站南广场拙政园商务酒店\n下面是可供选择的房间信息:");
		String[] type = {"大床房  ","标间     ","豪华双床房"};
		double[] counterPrice = {189,169,209};
		double[] vipPrice = {161,149,190};
		double[] coupon = {20,10,30};
		for(int i=0;i<3;i++){
			System.out.println("房型:"+type[i]+"\t门市价:"+counterPrice[i]+"\t会员专享价:"+vipPrice[i]+"\t可用代金券:"+coupon[i]);
		}
		System.out.println("请选择房间类型:(大床房请输1、标间请输2、豪华双床房请输3)");
		Scanner sc = new Scanner(System.in);
		int choiceType = sc.nextInt()-1;
		if(choiceType>=0&&choiceType<=2){
			System.out.println("您已选择房型:"+type[choiceType]+"\t门市价:"+counterPrice[choiceType]+"\t会员专享价:"+vipPrice[choiceType]);
		}else{
			System.out.println("输入错误,请重新开始");
		}
		double nowPrice = counterPrice[choiceType];
		int flagVip = vipIf();
		if (flagVip==1) {
			nowPrice = vipPrice[choiceType];
			System.out.println("您将获得VIP专享价:"+nowPrice);
		}else {
			System.out.println("您将使用正常门店价格:"+nowPrice);
		}
		System.out.println("当前可使用的代金券价格为:"+coupon[choiceType]);
		int couponIf = couponIf();
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
			nowPrice = nowPrice - coupon[choiceType];
		}
		System.out.println("下面生成订单信息:\n您已选择房型:"+type[choiceType]+"\n门市价:"+counterPrice[choiceType]);
		if (flagVip==1) {
			System.out.println("您是会员,获得VIP专享价:"+vipPrice[choiceType]);
		}
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
		}
		System.out.println("您当前需要支付的价格为:"+nowPrice);
		int payIf = pay();
		if (payIf==1) {
			System.out.println("支付成功,现在正在生成门卡号");
			String[] doorCard = {"B202","B204","B206"};
			String card = doorCard[0];
			System.out.println("\t"+card);
		}else{
			System.out.println("支付失败,请重新选择");
		}
	}
	public static void hotel1() {
		System.out.println("\t格雅苏州工业园区金鸡湖东方之门酒店\n下面是可供选择的房间信息:");
		String[] type = {"豪华双床房"};
		double[] counterPrice = {399};
		double[] vipPrice = {339};
		double[] coupon = {20};
		for(int i=0;i<1;i++){
			System.out.println("房型:"+type[i]+"\t门市价:"+counterPrice[i]+"\t会员专享价:"+vipPrice[i]+"\t可用代金券:"+coupon[i]);
		}
		System.out.println("请选择房间类型:(豪华双床房请输1)");
		Scanner sc = new Scanner(System.in);
		int choiceType = sc.nextInt()-1;
		if(choiceType==0){
			System.out.println("您已选择房型:"+type[choiceType]+"\t门市价:"+counterPrice[choiceType]+"\t会员专享价:"+vipPrice[choiceType]);
		}else{
			System.out.println("输入错误,请重新开始");
		}
		double nowPrice = counterPrice[choiceType];
		int flagVip = vipIf();
		if (flagVip==1) {
			nowPrice = vipPrice[choiceType];
			System.out.println("您将获得VIP专享价:"+nowPrice);
		}else {
			System.out.println("您将使用正常门店价格:"+nowPrice);
		}
		System.out.println("当前可使用的代金券价格为:"+coupon[choiceType]);
		int couponIf = couponIf();
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
			nowPrice = nowPrice - coupon[choiceType];
		}
		System.out.println("下面生成订单信息:\n您已选择房型:"+type[choiceType]+"\n门市价:"+counterPrice[choiceType]);
		if (flagVip==1) {
			System.out.println("您是会员,获得VIP专享价:"+vipPrice[choiceType]);
		}
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
		}
		System.out.println("您当前需要支付的价格为:"+nowPrice);
		int payIf = pay();
		if (payIf==1) {
			System.out.println("支付成功,现在正在生成门卡号");
			String[] doorCard = {"B202","B204","B206"};
			String card = doorCard[1];
			System.out.println("\t"+card);
		}else{
			System.out.println("支付失败,请重新选择");
		}
	}
	public static void hotel2() {
		System.out.println("\t格林豪泰苏州漕湖工业园智选酒店\n下面是可供选择的房间信息:");
		String[] type = {"大床房  ","标间     ","豪华双床房"};
		double[] counterPrice = {189};
		double[] vipPrice = {161};
		double[] coupon = {10};
		for(int i=0;i<1;i++){
			System.out.println("房型:"+type[i]+"\t门市价:"+counterPrice[i]+"\t会员专享价:"+vipPrice[i]+"\t可用代金券:"+coupon[i]);
		}
		System.out.println("请选择房间类型:(高级大床房请输1)");
		Scanner sc = new Scanner(System.in);
		int choiceType = sc.nextInt()-1;
		if(choiceType==0){
			System.out.println("您已选择房型:"+type[choiceType]+"\t门市价:"+counterPrice[choiceType]+"\t会员专享价:"+vipPrice[choiceType]);
		}else{
			System.out.println("输入错误,请重新开始");
		}
		double nowPrice = counterPrice[choiceType];
		int flagVip = vipIf();
		if (flagVip==1) {
			nowPrice = vipPrice[choiceType];
			System.out.println("您将获得VIP专享价:"+nowPrice);
		}else {
			System.out.println("您将使用正常门店价格:"+nowPrice);
		}
		System.out.println("当前可使用的代金券价格为:"+coupon[choiceType]);
		int couponIf = couponIf();
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
			nowPrice = nowPrice - coupon[choiceType];
		}
		System.out.println("下面生成订单信息:\n您已选择房型:"+type[choiceType]+"\n门市价:"+counterPrice[choiceType]);
		if (flagVip==1) {
			System.out.println("您是会员,获得VIP专享价:"+vipPrice[choiceType]);
		}
		if (couponIf==1) {
			System.out.println("您已使用代金券:"+coupon[choiceType]+"元");
		}
		System.out.println("您当前需要支付的价格为:"+nowPrice);
		int payIf = pay();
		if (payIf==1) {
			System.out.println("支付成功,现在正在生成门卡号");
			String[] doorCard = {"B202","B204","B206"};
			String card = doorCard[2];
			System.out.println("\t"+card);
		}else{
			System.out.println("支付失败,请重新选择");
		}
	}
	public static int hotelChoice(){
		System.out.println("请输入1、2、3选择酒店:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	public static int vipIf() {
		System.out.println("请问是否是VIP?(如果是请输入1,如果不是请输入其他任意数值:)");
		Scanner sc = new Scanner(System.in);
		int vip = sc.nextInt();
		return vip;
	}
	public static int couponIf() {
		System.out.println("请问是否使用代金券?(如果使用请输入1,如果不使用请输入其他任意数值:)");
		Scanner sc = new Scanner(System.in);
		int coupon = sc.nextInt();
		return coupon;
	}
	public static int pay() {
		System.out.println("接下来转到支付页面...");
		System.out.println("请问是否支付?(如果是请输入1,如果不支付请输入其他任意数值:)");
		Scanner sc = new Scanner(System.in);
		int payIf = sc.nextInt();
		return payIf;
	}

}
