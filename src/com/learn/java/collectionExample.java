package com.learn.java;

import java.util.ArrayList;

public class collectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,2,3,3,5,4,2,4,4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0;i< a.length;i++) {
			
			int count =0;
			
			if (al.contains(a[i])) {
				continue;
				
			}			
			else {
				al.add(a[i]);
				count++;
			}
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
								
			}
			System.out.println(a[i]+" occurs "+ count+" times");	
			//System.out.println(count);
					
		}		

	}

}
/*public static void main(String[] args) { // TODO Auto-generated method stub

int a[] ={ 4,5,5,5,4,6,6,9,4}; 
ArrayList<Integer>ab =new ArrayList<Integer>(); 
for(int i=0;i<a.length;i++) 
{ int k=0; 
	if(!ab.contains(a[i])) {
	ab.add(a[i]); 
  	k++; 
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j])
		{ k++; }
	}
	System.out.println(a[i]); 
	System.out.println(k); 
	if(k==1) 
	System.out.println(a[i]+"is unique number"); } } }
}
}

}*/
