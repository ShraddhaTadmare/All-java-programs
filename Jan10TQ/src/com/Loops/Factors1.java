package com.Loops;

import java.util.Scanner;

public class Factors1 {
	public static void main(String[] args) {
		
		int N, i;
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter an Integer");
        N = sc.nextInt();
 
        for (i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i+" ");

}
 }
 }
}
