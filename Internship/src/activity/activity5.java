package activity;
import java.util.Scanner;
class activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3 ="";
        int i;
        char ch;
        System.out.println("Enter First String");
        s1 = sc.nextLine();
        System.out.println("Enter Second String");
        s2 = sc.nextLine();
        for(i=0;i<s2.length();i++)
        {
            ch = s2.charAt(i);
            s3 = ch + s3;
        }
        System.out.println("Output String : "+ s1 + s3);
        
    }
}