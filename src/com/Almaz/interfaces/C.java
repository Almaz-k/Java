package com.Almaz.interfaces;

public class C  implements A,B {

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		A.super.dispaly();
	}
	
public static void main(String[] args) {
	A a= new C();
	a.dispaly(); // the output be disply from A 
		//as we overrided A;
	}
}
