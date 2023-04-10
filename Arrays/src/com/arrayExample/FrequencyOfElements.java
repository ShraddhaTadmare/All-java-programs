package com.arrayExample;


public class FrequencyOfElements {
	
	public static void printfrequency(int arr[])
	{    
		int count;
		for(int i=0;i<arr.length;i++)
		{
			 count=1;
			if(arr[i]=='\0')
			continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
		  System.out.println(arr[i]+" = "+count);
		}
	}
	
	public static void main(String[]args) {
	int arr[]= {2, 3, 6, 8, 6, 2};
	for(int i:arr)
	{
		System.out.print(i+"");
	}
	System.out.println();
	printfrequency(arr);
	}
}

	
	
	
	