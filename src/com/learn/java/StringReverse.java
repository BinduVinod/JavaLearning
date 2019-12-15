package com.learn.java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "malayalam";
		String reverseName = "";
		int length = name.length();
		int i;
		
		for(i=length-1;i>=0;i--)
		{
			//System.out.print(name.charAt(i));
			reverseName = reverseName + name.charAt(i);
			
		}
		System.out.println("Reverse Name :" +reverseName );
		if(name.equals(reverseName)) {
			System.out.println(name + " is a Palindrome");
		}
		
					
		
		

	}

}
