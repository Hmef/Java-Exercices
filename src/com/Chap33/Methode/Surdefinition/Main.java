package com.Chap33.Methode.Surdefinition;

public class Main {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		byte b = 0;
		short p = 0;
		int n = 0;
		long q = 0;
		float x = 0;
		double y = 0;
		
		a.f(n);
		a.f(b);
		a.f(p);
		a.f(n, y);
		a.f(b, n);
		//a.f(q, x);  ERROR
		a.f(n, x);
	}
	
}
