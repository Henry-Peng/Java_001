package com.peng.other;

public class Public extends PublicClass{

	@Override
	public  void runPublicMethod() {
		// TODO Auto-generated method stub
		super.runPublicMethod();
	}

	@Override
	public void runDefaultMethod() {//子类的重写父类的方法,权限可以提高,不可以降低default --> public
		// TODO Auto-generated method stub
		super.runDefaultMethod();
	}

	@Override
	protected void runProtectedMethod() {
		// TODO Auto-generated method stub
		super.runProtectedMethod();
	}

	

}
