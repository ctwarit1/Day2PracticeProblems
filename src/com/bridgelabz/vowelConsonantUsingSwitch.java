package com.bridgelabz;

import java.util.Scanner;

public class vowelConsonantUsingSwitch {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character: ");
	char ch=sc.next().charAt(0);
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println(ch + " is vowel");
        break;
    default:
        System.out.println(ch + " is consonant");
		
	}
	}
	
	}
