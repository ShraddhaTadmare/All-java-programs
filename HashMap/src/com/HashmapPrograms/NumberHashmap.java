package com.HashmapPrograms;

import java.util.ArrayList;

public class NumberHashmap {
	
	public static String coverttoWord(int num)
	{
		String Word= null;
		Switch(num)
		{
			case 1:Word="one";
			break;
			case 2:Word="two";
			break;
			case 3:Word="three";
			break;
			case 4:Word="four";
			break;
			case 5:Word="five";
			break;
			default:
				System.out.println("Error");
		
		}
	
	     return Word;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(2);
		a.add(3);
		
		

	}

}
