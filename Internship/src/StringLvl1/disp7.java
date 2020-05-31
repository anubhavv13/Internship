package StringLvl1;
import java.util.Scanner;
 class disp7 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1;
    System.out.println("Enter Day Name");
    s1 = sc.next();
        if(s1.equalsIgnoreCase("Monday"))
         System.out.println("Day is "+ 1);
        else if(s1.equalsIgnoreCase("Tuesday"))
         System.out.println("Day is "+ 2);
        else if(s1.equalsIgnoreCase("Wednesday"))
         System.out.println("Day is "+ 3);
        else if(s1.equalsIgnoreCase("Thursday"))
         System.out.println("Day is "+ 4);
        else if(s1.equalsIgnoreCase("Friday"))
         System.out.println("Day is "+ 5);
        else if(s1.equalsIgnoreCase("Saturday"))
         System.out.println("Day is "+ 6);
        else if(s1.equalsIgnoreCase("Sunday"))
         System.out.println("Day is "+ 7);
        else
            System.out.println("Invalid Input");
   }
 }
