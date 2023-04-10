package loopAssignment;

import java.util.Scanner;

public class OddNumSum {
	public static void main(String args[]) {
        int N , i, sum = 0;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
       N = sc.nextInt();
 
        for(i = 1; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum is"+ sum);
        sc.close();
    }
	

}
