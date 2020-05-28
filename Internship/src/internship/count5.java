package internship;
import java.util.Scanner;
public class count5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i,count=0;
        System.out.println("Enter a Sentence to count Words in it");
        s = sc.nextLine();
        if(s.isEmpty())
            System.out.println("String Empty or No input is given.");
        else
         s+=" ";
         for(i=0;i<s.length();i++)
         {
            char ch = s.charAt(i);
            if(ch == ' ')
                count++;
         }
        System.out.println("Number of words = " + count);
        
    }
}
