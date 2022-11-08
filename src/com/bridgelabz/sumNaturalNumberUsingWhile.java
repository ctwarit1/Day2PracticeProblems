package com.bridgelabz;

import java.util.Scanner;

public class sumNaturalNumberUsingWhile {
public void naturalSum () {
	int s=0;
	int num = 5;
	int i=0;
	while ( i<=num) {
		s=s+i;i++;}
		System.out.println("the sum of first 5 number is: " +s);
		
	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number N: ");
	int s=sc.nextInt();
	sumNaturalNumberUsingWhile sumIs=new sumNaturalNumberUsingWhile();
	sumIs.naturalSum();
}
}

