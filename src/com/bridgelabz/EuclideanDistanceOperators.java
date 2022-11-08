package com.bridgelabz;

public class EuclideanDistanceOperators {
	public static void main(String[] args){
//		parse x and y points
		double x=Integer.parseInt(args[0]);
		double y=Integer.parseInt(args[1]);
//		formula
		double distance=Math.sqrt(x*x+y*y);
		System.out.println(distance);
		
		
		
	}

}
