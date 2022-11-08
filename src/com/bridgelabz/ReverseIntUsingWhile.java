package com.bridgelabz;

public class ReverseIntUsingWhile {
	public static void main(String[] args){
		int n=1234;
		int r=0;
		while(n!=0) {
			int remainder = n%10;
			r=r*10+remainder;
			n=n/10;
			
		}
		System.out.println("the reverse of the number is: "+r);
	}

}
