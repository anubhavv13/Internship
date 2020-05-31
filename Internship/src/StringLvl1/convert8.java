package StringLvl1;
import java.util.Scanner;
class convert8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        String s2 = "";
        char ch,cha;
        for(int i =0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(Character.isUpperCase(ch))
            {
                cha = Character.toLowerCase(ch);
            
            }
            else
            {
                cha = Character.toUpperCase(ch);
            }
            s2 = s2 + cha;    
        }
        System.out.println("Input String : "+s1);
        System.out.println("Output String : "+s2);
    }
    
}
