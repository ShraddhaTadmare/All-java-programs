package com.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) {
		String colors[]= {"Red","Blue","Orange","Black"};
		//System.out.println(colors);
        
		// 1st way to convert Array into Arraylist
		
		List<String> sl=Arrays.asList(colors);
		
		// 2nd way
		
		ArrayList<String>al=new ArrayList<>(Arrays.asList(colors));
		System.out.println(al);
		
		//3rd way
		
		ArrayList<String>ak=new ArrayList<>();
		Collections.addAll(ak, colors);
		System.out.println(ak);
		
		
		System.out.println("==============ArrayList to Array===========================");
		
		// 1st way
		
		Object[] col = ak.toArray();
		System.out.println(Arrays.toString(col));
		
		
		
	}

}
