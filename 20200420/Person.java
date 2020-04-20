package com.peng.modle;
/**
 * 对象类:人(模板,图纸)
 * @author pfh
 * @date 2020年4月17日
 */
public class Person {
	
	/*//属性,成员变量,字段
	String name = "张三";//姓名
	int age = 18;
	String address = "上海";*/
	String name;//姓名
	int age;
	String address;//不采用public修饰符是为了安全
	
	public static String idCard;
	/**
	 * set和get//set为输入,get为输出,在source里面有快捷键
	 * 是为了别的类进行调用
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//this,是指当前对象的地址
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {//set和get可以使输入输出更合理,见代码注掉的部分
		this.age = age ;
		/*if(age<=110){
			this.age=age;
		}else{
			System.out.println("不合法："+age);
		}*/	
	}
	public int getAge() {
		return age;
		
	}
	/**
	 * 编写代码方法
	 */
	public void coding(){
		System.out.println(name+"正在编写代码...");
	}
	public void coding(String name){//假设此时输入的name为A,当前对象的name为B
		System.out.println(name);//输出A
		name = this.name;//将当前对象的name值传输给本方法的name
		System.out.println(name+"正在编写代码...");//输出B
	}
	public void coding(String name,int age,String address){//假设此时输入的name为A,当前对象的name为B
		System.out.println(name);//输出A
		this.name = name;//与上面作对比,A传给B,此时系统里的对象name也改为了A
		System.out.println(name+"正在编写代码...");//输出A
	}
	
	public void hungry(){
		//food:局部变量
		String food = "米饭";
		System.out.println(name+"吃"+food);
	}
	/**
	 * 人的休息的方法
	 */
	public void sleep(){
		System.out.println(name+"正在睡觉...");
	}
	

	public static void main(String[] args) {
		//对于类中的成员变量及方法,构造器调用
		Person per1 = new Person(); //先有类才可以创建对象,new就是创建对象,//此时默认无参
		Person per2 = new Person("张三");//新的对象,有参数,需要提前构造
		System.out.println(per2.name);//在本类中可以直接使用per2.name,在别的类要使用get方法
		System.out.println("***************");
		Person per3 = new Person("李四",18);//新对象,两个参数
		
		Person per4 = new Person("王无",22,"上海");//新的对象,三个参数,括号里的是当前对象的值
		//三种输出方式
		System.out.println("姓名:"+per4.name+",年龄:"+per4.age+",地址:"+per4.address);
		System.out.println(per4);//此处也有可能输出per4的地址
		System.out.println(per4.toString());//稳妥的输出方式
	}
	
	/**
	 * 在创建一个对象的时候,至少要调用一个构造方法,如果没有,默认无参.
	 * 生成类中方法的构造器,source
	 * 构造方法名必须与类名一致
	 * 一个类可以有多个构造方法,无参或者多个参数
	 */
	//不写构造方法,编译器编译器自动帮我们添加上无参的构造方法
	//自动添加,只能添加一次
			/**
			 * 无参数构造方法
			 * @param args
			 */
	public Person() {
		super();
	}
	//带一个参数的构造方法//带参数的构造方法要带上无参的构造,见上方;
	public Person(String name){
		this.name = name;//name是局部变量;this是这个对象的地址,[就是person类对象]
	}
	//带两个参数的构造器
	public Person (String name,int age) {
		this.name = name;
		this.age = age;
	}
	//三个参数构造器,可以调用之前有的语句
	public Person (String name,int age,String address) {
		/*this.name = name;
		this.age = age;*/
		this(name, age);//调用
		this.address = address;
		
	}
	//source-tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}
