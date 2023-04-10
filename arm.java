public class Arm {

	public static void main(String[] args) {
	      int num=370;
	      int initialnumber;
	      int remainder;
	      int total=0;
	       
	      initialnumber=num;
	      
	      while(initialnumber != 0)
	      {
	        remainder=initialnumber%10;
	        total=total+(remainder*remainder*remainder);
	        initialnumber= initialnumber/10;
	      }
	       
	       if(total == num)
	       System.out.println("An armstrong number is:" +num );
	       else
	       System.out.println("Not a armstrong number:" +num);


	}

}
