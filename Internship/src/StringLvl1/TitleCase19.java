package StringLvl1;
import java.util.Scanner;
class TitleCase19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to convert into Title Case");
        String s1,s2="";
        int i;
        char ch;
        s1 = sc.nextLine();
        s1 = " " + s1;
        for(i =0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch == ' ')
            {
                s2 = s2 + ch;
                i++;
                ch = Character.toUpperCase(s1.charAt(i)); 
            }
            else
            {
                ch = Character.toLowerCase(s1.charAt(i));
            }
            s2 = s2 + ch;
        }
        System.out.println("Input String : " + s1);
        System.out.println("output String : " + s2);
    }
}
