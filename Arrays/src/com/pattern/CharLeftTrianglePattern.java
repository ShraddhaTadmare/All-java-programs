package com.pattern;

public class CharLeftTrianglePattern {

	public static void main(String[] args) {
         
		 
        
        for (char i = 'G'; i <='D'; i++)
        {
            for (char j = 'B'; j <= i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

	}

}
