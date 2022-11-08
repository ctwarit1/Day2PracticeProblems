package com.bridgelabz;
import java.util.Scanner;
public class largeNumberInWordIfElse {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the number you want in words: ");
		int a=sc.nextInt();
		if (a==1) {
			System.out.println("Unit");
		}
		
		else if (a==10) {
			System.out.println("Ten");
		}
		
		else if (a==100) {
			System.out.println("Hundred");
		}
		
		else if (a==1000) {
			System.out.println("Thousand");
		
		}
		else {
			System.out.println("Ten Thousand");
		}
		
}
}	





