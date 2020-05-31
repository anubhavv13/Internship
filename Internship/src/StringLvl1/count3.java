package StringLvl1;
import java.util.Scanner;

public class count3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int count=0,i;
        System.out.println("Enter a Word : ");
        a = sc.nextLine();
        for(i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch))
                count++;
        }
        System.out.println("Capital Letters are : " + count);
    }
    
}
