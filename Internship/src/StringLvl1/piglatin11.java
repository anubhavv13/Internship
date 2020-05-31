package StringLvl1;
import java.util.Scanner;
class piglatin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2="",s3="";
        char ch;
        int i;
        System.out.println("Enter a String");
        s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                s2 = s1.substring(i);
                s3 = s1.substring(0, i);
                break;
            }
        }
        System.out.println("Input String : " + s1);
        System.out.println("Output String : "+ s2 + s3 + "ay");
    }
}
