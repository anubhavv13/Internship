package StringLvl1;
import java.util.Scanner;

class freq18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        int i,count=0;
        char ch,a;
        for(a='a';a<='z';a++)
        {
            count = 0;
            for(i=0;i<s1.length();i++)
            {
                ch = s1.charAt(i);
                if(ch == a)
                {
                    count++;
                }
                
            }
            if(count>0)
            {
                System.out.println("The Frequency of " + a + " is :  " + count);
            }
        }
    }
    
}
