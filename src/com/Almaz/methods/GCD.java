package com.Almaz.methods;

public class GCD {
	public Integer gcd(Integer a, Integer b) {// a=9 , b=3
		if(!(a instanceof Integer)|| !(b instanceof Integer)) {
			return null;
		}
		if(b==0) {
			return a;
		}
	 return gcd(b, a%b);//3,0)
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCD gcdFunc= new GCD();
		System.out.println(gcdFunc.gcd(21,14));
	}

}
