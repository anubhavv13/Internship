package activity;
import java.util.Scanner;
class activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2 = "";
        int i;
        char ch;
        System.out.println("Enter a String");
        s1 = sc.nextLine();
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            s2 = ch +s2;
        }
        System.out.println("Input String : " + s1);
        System.out.println("Outpur String : " + s2);
    }
    
}
