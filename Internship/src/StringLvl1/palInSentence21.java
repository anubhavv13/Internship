package StringLvl1;
import java.util.Scanner;
class palInSentence21 {
    void palindrome(String s)
    {
        String s1,s2 = "";
        s1 = s;
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            s2 = ch + s2;
        }
        if(s2.equalsIgnoreCase(s1)) {
            System.out.println("The Palindrome words are as follows : ");
            System.out.println(s2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palInSentence21 obj = new palInSentence21();
        String s1,s2="";
        int i;
        char ch;
        System.out.println("Enter A String");
        s1 = sc.nextLine();
        s1 = s1 + " ";
        
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch !=' ')
            {
                s2 = s2 + ch;
            }
            else
            {
                obj.palindrome(s2);
                s2 = "";
            }
        }
    }
    
}
