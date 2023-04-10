package com.coreJavaPgms;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Basic Salary :");
		int bs = in.nextInt();
		float hra,da;
		if(bs<=10000)
		{			
			hra = bs*0.2f;
			da = bs*0.8f;
		}
		else if(bs<=20000)
		{
			hra = bs*0.25f;
			da = bs*0.9f;
		}
		else
		{
			hra = bs*0.3f;
			da = bs*0.95f;
		}
		System.out.println("Gross Salary : "+(bs+hra+da));
	}
}
