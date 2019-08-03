package io.pradeep;

public class MathUtils {

	public int add ( int a , int b ) {
		return a+b;
	}
	
	public int substract ( int a , int b ) {
		return a-b;
	}
	
	public  int multiply ( int a , int b) {
		System.out.println("Excecuted Multiplier with "+a+" and "+b);	
		return a * b;
	}
	
	public int divide ( int a , int b) {
		return a/b;
	}
	
	public double computeCircleArea( int radius) {
		return Math.PI * radius * radius;
		
	}
}
