package StringLvl1;
import java.util.Scanner;
 class alternate17 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s1,s2;
         int i;
         System.out.println("Enter A String");
         s1 = sc.nextLine();
         s2 = s1;
         s1 = s1.toLowerCase();
         char ch[] = s1.toCharArray();
         for(i=0;i<ch.length;i=i+2)
         {
             ch[i] = Character.toUpperCase(ch[i]);
         }
         System.out.println("Input String : " + s2);
         System.out.println("Output String : " + new String(ch));
     }
    
}
