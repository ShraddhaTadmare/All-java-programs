package com.Switch;

import java.util.Scanner;

public class SimpleCalculator {

		  public static void main(String[] args) {

		    char operator;
		    Double num1, num2, result;

		    Scanner sc = new Scanner(System.in);

		    System.out.println("Enter first number");
		    num1 = sc.nextDouble();

		    System.out.println("Enter second number");
		    num2 = sc.nextDouble();
		    
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = sc.next().charAt(0);

		    switch (operator) {

		      case '+':
		        result = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + result);
		        break;

		      case '-':
		        result = num1 - num2;
		        System.out.println(num1 + " - " + num2 + " = " + result);
		        break;

		      case '*':
		        result = num1 * num2;
		        System.out.println(num1 + " * " + num2 + " = " + result);
		        break;

		      case '/':
		        result = num1 / num2;
		        System.out.println(num1 + " / " + num2 + " = " + result);
		        break;

		      default:
		        System.out.println("operator is Invalid");
		        
		    }

		    sc.close();
		  }
		}


