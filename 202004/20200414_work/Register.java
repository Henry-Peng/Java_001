import java.util.Scanner;

/**
 * 预约挂号,三次黑名单
 * @author pfh
 * @date 2020年4月14日
 */
public class Register {

	public static void main (String[] args) {
		int n =0;
		for(int i=0;i<10;i++){
			String name =input();
			n = (name.equals("小明"))? ++n:n;
			reg(n);
			
		}
		
	}
	
	public static String input(){
			System.out.print("接下来挂号的人员是:");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			return name ;
	}

	public static void reg(int n) {
		System.out.println(n);
		if(n<4){
			System.out.println("当前第"+n+"次挂号成功");
		}else {
			System.out.println("本人不能再挂号,已经是黑名单");
		}	
	} 

}
