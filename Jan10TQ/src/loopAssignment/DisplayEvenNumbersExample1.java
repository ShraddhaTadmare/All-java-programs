package loopAssignment;

public class DisplayEvenNumbersExample1 {
	
	public static void main(String args[])   
	{  
	int number=229;  
	System.out.print("List of even numbers from 121 to "+number+": ");  
	for (int i=121; i<=number; i++)   
	{  
	//logic to check if the number is even or not  
	//if i%2 is equal to zero, the number is even  
	if (i%2==0)   
	{  
	System.out.print(i + " ");  
	}  
	}  
	}  


}
