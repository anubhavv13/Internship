package StringLvl1;
import java.util.Scanner;
class rabbit22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1,s2="",s3="";
        int i,j;
        char ch;
        s1 = sc.nextLine();
        s1 = s1 + " ";
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch != ' ')
            {
                s2 = s2 + ch;
            }
            else
            {
                for(j=0;j<s2.length()-1;j++)
                {
                    if(s2.charAt(j) == s2.charAt(j+1))
                    {
                        break;
                    }
                }
                if(j<s2.length()-1)
                {
                    s3 = s3 + s2 + " ";
                }
                s2 = "";
            }
        }
        if(s3.isEmpty())
            System.out.println("No Repeated words available");
        else
        {
            System.out.println("Repated Words are as follows : ");
            System.out.println(s3);
        }
    }
    
}
