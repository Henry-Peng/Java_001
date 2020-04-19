package com.peng.demo2;

/**
 * 输出对应省份下的城市:三个for
 * @author pfh
 * @date 2020年4月16日
 */
public class Demo003_forPro {

	public static void main(String[] args) {
		//showProCity();
		showPro();

	}
	
	public static void showProCity() {
		String[] pros = {"河南省","江苏省"};
		String[] city1 = {"洛阳","郑州","信阳"};
		String[] city2 = {"苏州","无锡"};
		for (int i=0;i<pros.length;i++){
			if(pros[i].equals("河南省")){
				for(int j=0;j<city1.length;j++){
					System.out.println(pros[i]+":"+city1[j]);
				}
			}
			
			if (pros[i].equals("江苏省")) {
				for(int j=0;j<city2.length;j++){
					System.out.println(pros[i]+":"+city2[j]);
				}
			}
		}
		
	}
	
	public static void showPro(){
		String[] pros = {"河南省","江苏省"};
		String[] city1 = {"洛阳","郑州","信阳"};
		String[] city2 = {"苏州","无锡"};
		for(int i=0;i<pros.length;i++){
			if(pros[i].equals("河南省")){
				for(String c:city1){
					System.out.println(pros[i]+":"+c);
				}
			}
			if(pros[i].equals("江苏省")){
				for(String c:city2){
					System.out.println(pros[i]+":"+c);
				}
			}
		}
		
	}

}
