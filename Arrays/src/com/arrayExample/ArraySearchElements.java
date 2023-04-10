package com.arrayExample;

import java.util.Scanner;

public class ArraySearchElements {

	public static void main(String[] args) {
		int n=5, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[5];
        System.out.println("Enter all the elements:");
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }

	}

}
