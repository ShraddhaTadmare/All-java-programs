package com.programs;

import java.util.ArrayList;

public class FrequencyArrayList {
	public static void frequencyCal(ArrayList<String> list1)
	{    
		int count;
		for(int i=0;i<list1.size();i++)
		{
			count=1;
			if(list1.get(i).equals("visited"))
				continue;
			
			for(int j=i+1;j<list1.size();j++)
			{
				if(list1.get(i).equals(list1.get(j)))
				{
					list1.set(j, "visited");
					count++;
				}
			}
		System.out.println(list1.get(i)+" :"+count);
		
		}
		
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("white");
 
		System.out.println(list);
		frequencyCal(list);
	}

}
