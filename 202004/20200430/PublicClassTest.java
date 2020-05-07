package com.peng.other;

public class PublicClassTest {//类上的修饰符 only public, abstract & final are permitted

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.runDefaultMethod();
		publicClass.runProtectedMethod();
		publicClass.runPublicMethod();

	}

}
