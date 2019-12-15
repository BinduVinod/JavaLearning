package com.learn.java;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers do you want to add");
		int count = s.nextInt();
		//System.out.println(count);
		int[] number = new int[count];
		int total=0;
		for(int i=0;i<count;i++) {
			number[i]= s.nextInt();
			total = total + number[i];
		}
		System.out.println("Total  = "+total );
		
		
	}
}
