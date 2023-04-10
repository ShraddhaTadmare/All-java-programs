public class ArmStrong{
  public static void main(String[] args){
   int num = 121;
   int initialnumber;
   int remainder;
   int total = 0;
  
 initialnumber=num;
  
  while(initialnumber!=0)
  {
    remainder=initialnumber%10;
    total=total+(remainder*remainder*remainder);
    initialnumber=initialnumber/10;

}

  if(total==num)
   
    System.out.println("Arm strong number" +num);

 else
    System.out.println("Not Arm strong number" +num);

}
}