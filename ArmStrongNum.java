public class ArmStrong{
  public static void main(String[] args){
   int num = 121;
   int initialnumber;
   int remainder;
   int final = 0;
  
 initialnumber=num;
  
  while(initialnumber!=0)
  {
    remainder=initialnumber%10;
    final=final+remainder*remainder*remainder;
    initialnumber=initialnumber/10;

}

  if(final==num)
   
    System.out.println("Arm strong number" +num);

 else
    System.out.println("Not Arm strong number" +num);

}
}