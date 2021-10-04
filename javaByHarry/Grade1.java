/*90 .. 100  --> A
80 .. 89 --> B
70 .. 79 --> C
60 .. 69 --> D
0 .. 59 --> F
otherwise F
*/
import java.util.Scanner;
class Grade1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Please Enter your Grade");
  int x=sc.nextInt();
  System.out.println(x);

  /*switch(label){
      case label:  ///number/string
       //statement 
       break;
  }*/
 switch(x)
 {
   case 1:
     System.out.println("A");
     Break;

   case 2: 
     System.out.println("B");
     Break;
     
   case 3: 
     System.out.println("C");
     Break;
     
   case 4: 
     System.out.println("D");
     Break;
     
   case 5: 
     System.out.println("F");
     
     default:
     {
           System.out.println("Fail:");
     }



 }




















  /*if(x>100)
  {
     System.out.println(" Short in Range");
   }
  else if(x>=90 && x<=100)
   {
       System.out.println("your grade is A");
   }
   else if(x>=80 && x<=89)
   {
       System.out.println("your grade is B");
   }
   else if(x>=70 && x<=79)
   {
       System.out.println("your grade is c");
   }
 else if(x>=60 && x<=69)
   {
       System.out.println("your grade is d");
   }
   else if(x>35 && x<=60)
   {
       System.out.println("your grade is F");
   }
   else{
       System.out.println("FAIL:");
   }
*/
 }

}