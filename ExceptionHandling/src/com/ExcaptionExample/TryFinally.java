package com.ExcaptionExample;

public class TryFinally {

	public static void main(String[] args) {
		
		
		int arr[]= {3,8,9,4};
		
		try
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+arr[i+1]);
			}
		}
         finally
         {
        	 System.out.println("Rest of the code");
         }
	}

}
