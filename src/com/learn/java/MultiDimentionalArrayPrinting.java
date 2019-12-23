package com.learn.java;

public class MultiDimentionalArrayPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{11,12,13,},{14,15,6},{7,8,9}};
		int row = 2;
		int i,j,minRow =0;
		int col = 2;
		int min =a[0][0];
		int max =a[0][0];
		for(i=0;i<=row;i++) {
			for(j=0;j<=col;j++) {
				System.out.print(a[i][j]);
				if(a[i][j]<min)
				{min=a[i][j];
				 minRow =j;}
				
				if(a[i][j]>max)
				{max=a[i][j];}
			}
			System.out.println("");
			}
		System.out.println(min);
		System.out.println(max);
		
		int k=0;
		int maxInmin =a[k][minRow];
		while(k <= row) {
			if (maxInmin < a[k][minRow])
				maxInmin = a[k][minRow];
			k++;			
		}
		System.out.println(maxInmin);
		
		
		
		
			
		}
		

	}


