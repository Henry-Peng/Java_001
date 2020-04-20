package com.peng.modle;
/**
 * 游戏类
 * @author pfh
 * @date 2020年4月20日
 */
public class Game {
	
	//成员变量
	String playerId ;//玩家ID
	String area ;//区
	String heroName;//英雄名
	String pattern;//模式
	boolean surrender;//是否投降
	
	/**
	 * set and get
	 * @return
	 */
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public boolean isSurrender() {
		return surrender;
	}
	public void setSurrender(boolean surrender) {
		this.surrender = surrender;
	}
	
	//构造方法
	public Game(){
	}
	
	public Game(String playerId,String area,String heroName,String pattern,boolean surrender){
		this.playerId = playerId;
		this.area = area;
		this.heroName = heroName;
		this.pattern = pattern;
		this.surrender = surrender;
	}
	
	//流程方法
	/**
	 * 1.打开游戏
	 */
	public void openGame(){
		System.out.println("打开游戏.....");
	}
	
	/**
	 * 2.注册账号
	 * @param args
	 */
	public void registerAccount() {
		System.out.println("注册账号:"+playerId+"成功");
	}
	
	/**
	 * 3.登录
	 * @param args
	 */
	public void loginAccount(){
		System.out.println("登录账号"+playerId+"成功");
	}
	
	/**
	 * 4.登录选区
	 * @param args
	 */
	public void loginArea() {
		System.out.println("选择:"+area);
	}
	
	/**
	 * 5.点开排位
	 * @param args
	 */
	public void openPosition() {
		System.out.println("打开选择排位...");
	}
	
	/**
	 * 6.选择亚索
	 * @param args
	 */
	public void choiceHero() {
		System.out.println("选择"+heroName+"成功...");
	}
	
	/**
	 * 7.是否投降
	 * @param args
	 */
	public void surrIf() {
		System.out.println("游戏困难,是否投降?");
		if (surrender) {
			System.out.println("选择投降...");
		}else{
			System.out.println("拒绝投降...");
		}
	}
	
	/**
	 * 8.点击举报
	 * @param args
	 */
	public void report(String player) {
		System.out.println("您已举报:"+player+"成功");
	}
	
	/**
	 * 9.退出游戏
	 * @param args
	 */
	public void exitGame() {
		System.out.println("您已退出游戏");
	}
	
	//其他功能
	/**
	 * other1).当血压高于多少时直接退出游戏
	 * 
	 */
	public void bloodPressure() {
		//if.....
		System.out.println("当前血压高于150mmHg,请退出游戏");
	}
	
	/**
	 * other2).升级
	 */
	public void upgrade() {
		System.out.println("升级操作...");
	}
	
	/**
	 * other3).充钱
	 * @param args
	 */
	public void chargeMoney() {
		System.out.println("当前进行充值操作...");
	}

	public static void main(String[] args) {
		
	}

}
