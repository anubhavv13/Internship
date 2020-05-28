package activity;
import java.util.Scanner;
class activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2 = "";
        int i, c = 0;
        char ch;
        System.out.println("Enter a String");
        s1 = sc.nextLine();
        s2 = s1;
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                s1.replace(ch, 'z');
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("No Vowel present");
        }
        System.out.println("Input String : " +s2);
        System.out.println("Output String : " + s1);
    }
}