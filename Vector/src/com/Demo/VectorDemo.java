package com.Demo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> colors = new Vector<>();
		
		System.out.println("Size:"+colors.size());
		System.out.println("Capacity:"+colors.capacity());

		colors.add("pink");
		colors.add("yellow");
		colors.addElement("Blue");
		colors.add("red");
		colors.add("pink");
		colors.add("brown");
		colors.add("green");
		colors.addElement("black");
		colors.add("white");
		
		System.out.println("Size:"+colors.size());
		System.out.println("Capacity:"+colors.capacity());
		
		colors.add("purple");
		colors.ensureCapacity(20);
		
		System.out.println("Size:"+colors.size());
		System.out.println("Capacity:"+colors.capacity());
		
		System.out.println(colors.get(5));
		System.out.println(colors.elementAt(5));
		
		System.out.println(colors.set(5, "white"));
		System.out.println(colors);
	}

}
