
/**
 * 预约挂号,三次黑名单
 * @author pfh
 * @date 2020年4月14日
 */
public class Register {

	public static void main (String[] args) {
		String name = "老何";
		reg(name);
	}

	public static void reg(String name) {
		int i=0;
		i = (name == "老何")?++i:i;
		if(i<4){
			System.out.println("当前第"+i+"次挂号成功");
		}else {
			System.out.println("本人不能再挂号,已经是黑名单");
		}	
	} 

}
