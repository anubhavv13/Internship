package internship;
import java.util.Scanner;
class palindrom9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2 = "";
        System.out.println("Enter A word to check Palindrome");
        s1 = sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            s2 = ch + s2;
        }
        if(s2.equalsIgnoreCase(s1))
            System.out.println("String is Palindrome.");
        else
            System.out.println("String in not a Palindrome");
        
    }
    
}
