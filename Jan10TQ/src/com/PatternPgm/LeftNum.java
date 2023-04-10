package com.PatternPgm;

public class LeftNum {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(n-1);j++)
			{
				System.out.print("");
					
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			     System.out.println();
			     n++;
			}
	}

}
