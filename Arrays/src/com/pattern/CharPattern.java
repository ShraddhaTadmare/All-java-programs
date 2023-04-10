package com.pattern;

public class CharPattern {

	public static void main(String[] args) {
	   for(char i='B';i<='F';i++)
	   {
		   for(char j='B';j<i;j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }

	}

}
