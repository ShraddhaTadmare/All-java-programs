package com.coreJavaPgms;

import java.util.Scanner;

public class CheckVowelOrnot {

	public static void main(String[] args) {
	
	        char c;
	        
	        Scanner s = new Scanner(System.in);
	 
	        System.out.println("Enter an Alphabet");
	        c = s.next().charAt(0);
	 
	        
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
	                || c == 'U') {
	            System.out.println(c + " is Vowel");
	        } else {
	            System.out.println(c + " is Consonant");
	        }
	    }

	}

