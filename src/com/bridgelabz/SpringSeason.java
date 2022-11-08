package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Day and Month(in numbers): ");
	int d=sc.nextInt();
	int m=sc.nextInt();
	if((d>=20)&&((m>=3)&&(m<=6))){
		System.out.println("True");
		
	}
	else
		System.out.println("False");
		
		
				
	}
	}

