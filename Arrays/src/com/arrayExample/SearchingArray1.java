package com.arrayExample;

public class SearchingArray1 {
	public static boolean search(int ar[],int value)
	{
		boolean isPresent=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==value)
			{
				isPresent=true;
			    break;
			}
		}
		
		
		return isPresent;
	}
	

	public static void main(String[] args) {

      int arr1[]= {4,6,7,2,5,1,10};
      
     // System.out.println(arr1.length);
      
      boolean isP= search(arr1,7);
      
      if(isP)// isP==true
      {
    	  System.out.println("Element is present");
    	 
      }
      else
      {
    	  System.out.println("Element is not present");
      }

	}


}
