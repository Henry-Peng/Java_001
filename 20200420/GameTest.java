package com.peng.test;

import com.peng.modle.Game;
/**
 * 测试类
 * @author pfh
 * @date 2020年4月20日
 */
public class GameTest {

	public static void main(String[] args) {
		//调用类
		Game game = new Game("快乐风男","祖安新区" , "亚索", "排位模式",false);
		game.openGame();
		game.registerAccount();
		game.loginAccount();
		game.loginArea();
		game.openPosition();
		game.choiceHero();
		game.surrIf();
		game.report("疾风剑豪");
		System.out.println(game.getPlayerId());
		game.exitGame();
		
	}

}
